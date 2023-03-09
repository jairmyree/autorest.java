// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * CORS is an HTTP feature that enables a web application running under one domain to access resources in another
 * domain. Web browsers implement a security restriction known as same-origin policy that prevents a web page from
 * calling APIs in a different domain; CORS provides a secure way to allow one domain (the origin domain) to call APIs
 * in another domain.
 */
@Fluent
public final class CorsRule implements XmlSerializable<CorsRule> {
    /*
     * The origin domains that are permitted to make a request against the storage service via CORS. The origin domain
     * is the domain from which the request originates. Note that the origin must be an exact case-sensitive match with
     * the origin that the user age sends to the service. You can also use the wildcard character '*' to allow all
     * origin domains to make requests via CORS.
     */
    private String allowedOrigins;

    /*
     * The methods (HTTP request verbs) that the origin domain may use for a CORS request. (comma separated)
     */
    private String allowedMethods;

    /*
     * the request headers that the origin domain may specify on the CORS request.
     */
    private String allowedHeaders;

    /*
     * The response headers that may be sent in the response to the CORS request and exposed by the browser to the
     * request issuer
     */
    private String exposedHeaders;

    /*
     * The maximum amount time that a browser should cache the preflight OPTIONS request.
     */
    private int maxAgeInSeconds;

    /** Creates an instance of CorsRule class. */
    public CorsRule() {}

    /**
     * Get the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     *
     * @return the allowedOrigins value.
     */
    public String getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: The origin domains that are permitted to make a request against the storage
     * service via CORS. The origin domain is the domain from which the request originates. Note that the origin must be
     * an exact case-sensitive match with the origin that the user age sends to the service. You can also use the
     * wildcard character '*' to allow all origin domains to make requests via CORS.
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule setAllowedOrigins(String allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     *
     * @return the allowedMethods value.
     */
    public String getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: The methods (HTTP request verbs) that the origin domain may use for a CORS
     * request. (comma separated).
     *
     * @param allowedMethods the allowedMethods value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule setAllowedMethods(String allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the allowedHeaders property: the request headers that the origin domain may specify on the CORS request.
     *
     * @return the allowedHeaders value.
     */
    public String getAllowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: the request headers that the origin domain may specify on the CORS request.
     *
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule setAllowedHeaders(String allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     *
     * @return the exposedHeaders value.
     */
    public String getExposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Set the exposedHeaders property: The response headers that may be sent in the response to the CORS request and
     * exposed by the browser to the request issuer.
     *
     * @param exposedHeaders the exposedHeaders value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule setExposedHeaders(String exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
        return this;
    }

    /**
     * Get the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     *
     * @return the maxAgeInSeconds value.
     */
    public int getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    /**
     * Set the maxAgeInSeconds property: The maximum amount time that a browser should cache the preflight OPTIONS
     * request.
     *
     * @param maxAgeInSeconds the maxAgeInSeconds value to set.
     * @return the CorsRule object itself.
     */
    public CorsRule setMaxAgeInSeconds(int maxAgeInSeconds) {
        this.maxAgeInSeconds = maxAgeInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getAllowedOrigins() == null) {
            throw new IllegalArgumentException("Missing required property allowedOrigins in model CorsRule");
        }
        if (getAllowedMethods() == null) {
            throw new IllegalArgumentException("Missing required property allowedMethods in model CorsRule");
        }
        if (getAllowedHeaders() == null) {
            throw new IllegalArgumentException("Missing required property allowedHeaders in model CorsRule");
        }
        if (getExposedHeaders() == null) {
            throw new IllegalArgumentException("Missing required property exposedHeaders in model CorsRule");
        }
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        xmlWriter.writeStartElement("CorsRule");
        xmlWriter.writeStringElement("AllowedOrigins", this.allowedOrigins);
        xmlWriter.writeStringElement("AllowedMethods", this.allowedMethods);
        xmlWriter.writeStringElement("AllowedHeaders", this.allowedHeaders);
        xmlWriter.writeStringElement("ExposedHeaders", this.exposedHeaders);
        xmlWriter.writeIntElement("MaxAgeInSeconds", this.maxAgeInSeconds);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of CorsRule from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of CorsRule if the XmlReader was pointing to an instance of it, or null if it was pointing to
     *     XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     */
    public static CorsRule fromXml(XmlReader xmlReader) throws XMLStreamException {
        return xmlReader.readObject(
                "CorsRule",
                reader -> {
                    String allowedOrigins = null;
                    String allowedMethods = null;
                    String allowedHeaders = null;
                    String exposedHeaders = null;
                    int maxAgeInSeconds = 0;
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        QName fieldName = reader.getElementName();

                        if ("AllowedOrigins".equals(fieldName.getLocalPart())) {
                            allowedOrigins = reader.getStringElement();
                        } else if ("AllowedMethods".equals(fieldName.getLocalPart())) {
                            allowedMethods = reader.getStringElement();
                        } else if ("AllowedHeaders".equals(fieldName.getLocalPart())) {
                            allowedHeaders = reader.getStringElement();
                        } else if ("ExposedHeaders".equals(fieldName.getLocalPart())) {
                            exposedHeaders = reader.getStringElement();
                        } else if ("MaxAgeInSeconds".equals(fieldName.getLocalPart())) {
                            maxAgeInSeconds = reader.getIntElement();
                        } else {
                            reader.skipElement();
                        }
                    }
                    CorsRule deserializedCorsRule = new CorsRule();
                    deserializedCorsRule.allowedOrigins = allowedOrigins;
                    deserializedCorsRule.allowedMethods = allowedMethods;
                    deserializedCorsRule.allowedHeaders = allowedHeaders;
                    deserializedCorsRule.exposedHeaders = exposedHeaders;
                    deserializedCorsRule.maxAgeInSeconds = maxAgeInSeconds;

                    return deserializedCorsRule;
                });
    }
}
