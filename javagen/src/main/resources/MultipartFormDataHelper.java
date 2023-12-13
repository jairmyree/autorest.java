import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

// DO NOT modify this helper class

public final class MultipartFormDataHelper {
    /**
     * Line separator for the multipart HTTP request.
     */
    private static final String CRLF = "\r\n";

    /**
     * Value to be used as part of the divider for the multipart requests.
     */
    private final String boundary;

    /**
     * The actual part separator in the request. This is obtained by prepending "--" to the "boundary".
     */
    private final String partSeparator;

    /**
     * The marker for the ending of a multipart request. This is obtained by post-pending "--" to the "partSeparator".
     */
    private final String endMarker;

    /**
     * Charset used for encoding the multipart HTTP request.
     */
    private final Charset encoderCharset = StandardCharsets.UTF_8;

    private InputStream requestDataStream = new ByteArrayInputStream(new byte[0]);
    private long requestLength = 0;

    private RequestOptions requestOptions;
    private BinaryData requestBody;

    /**
     * Default constructor used in the code. The boundary is a random value.
     *
     * @param requestOptions the RequestOptions to update
     */
    public MultipartFormDataHelper(RequestOptions requestOptions) {
        this(requestOptions, UUID.randomUUID().toString().substring(0, 16));
    }

    private MultipartFormDataHelper(RequestOptions requestOptions, String boundary) {
        this.requestOptions = requestOptions;
        this.boundary = boundary;
        this.partSeparator = "--" + boundary;
        this.endMarker = this.partSeparator + "--";
    }

    /**
     * Gets the multipart HTTP request body.
     *
     * @return the BinaryData of the multipart HTTP request body
     */
    public BinaryData getRequestBody() {
        return requestBody;
    }

    // text/plain
    /**
     * Formats a text/plain field for a multipart HTTP request.
     *
     * @param fieldName the field name
     * @param value the value of the text/plain field
     * @return the MultipartFormDataHelper instance
     */
    public MultipartFormDataHelper serializeTextField(String fieldName, String value) {
        if (value != null) {
            String serialized = partSeparator
                    + CRLF + "Content-Disposition: form-data; name=\""
                    + fieldName + "\"" + CRLF + CRLF
                    + value
                    + CRLF;
            byte[] data = serialized.getBytes(encoderCharset);
            appendBytes(data);
        }
        return this;
    }

    // application/json
    /**
     * Formats a application/json field for a multipart HTTP request.
     *
     * @param fieldName the field name
     * @param jsonObject the object of the application/json field
     * @return the MultipartFormDataHelper instance
     */
    public MultipartFormDataHelper serializeJsonField(String fieldName, Object jsonObject) {
        if (jsonObject != null) {
            String serialized = partSeparator + CRLF + "Content-Disposition: form-data; name=\"" + fieldName + "\""
                    + CRLF + "Content-Type: application/json"
                    + CRLF + CRLF + BinaryData.fromObject(jsonObject) + CRLF;
            byte[] data = serialized.getBytes(encoderCharset);
            appendBytes(data);
        }
        return this;
    }

    // application/octet-stream
    /**
     * Formats a application/octet-stream field for a multipart HTTP request.
     *
     * @param fieldName the field name
     * @param file the BinaryData of the file
     * @param filename the filename
     * @return the MultipartFormDataHelper instance
     */
    public MultipartFormDataHelper serializeFileField(String fieldName, BinaryData file, String filename) {
        if (file != null) {
            // Multipart preamble
            String fileFieldPreamble = partSeparator
                    + CRLF + "Content-Disposition: form-data; name=\"" + fieldName
                    + "\"; filename=\"" + filename + "\""
                    + CRLF + "Content-Type: application/octet-stream" + CRLF + CRLF;
            byte[] data = fileFieldPreamble.getBytes(encoderCharset);
            appendBytes(data);

            // Writing the file into the request as a byte stream
            requestLength += file.getLength();
            requestDataStream = new SequenceInputStream(requestDataStream, file.toStream());

            // CRLF
            data = CRLF.getBytes(encoderCharset);
            appendBytes(data);
        }
        return this;
    }

    /**
     * Ends the serialization of the multipart HTTP request.
     *
     * @return the MultipartFormDataHelper instance
     */
    public MultipartFormDataHelper end() {
        byte[] data = endMarker.getBytes(encoderCharset);
        appendBytes(data);

        requestBody = BinaryData.fromStream(requestDataStream, requestLength);

        requestOptions
                .setHeader(HttpHeaderName.CONTENT_TYPE, "multipart/form-data; boundary=" + this.boundary)
                .setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(requestLength));

        return this;
    }

    private void appendBytes(byte[] bytes) {
        requestLength += bytes.length;
        requestDataStream = new SequenceInputStream(requestDataStream, new ByteArrayInputStream(bytes));
    }
}