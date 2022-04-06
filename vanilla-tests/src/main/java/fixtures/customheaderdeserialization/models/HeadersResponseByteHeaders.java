// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.customheaderdeserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Base64;

/** The HeadersResponseByteHeaders model. */
@Fluent
public final class HeadersResponseByteHeaders {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private byte[] value;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of HeadersResponseByteHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public HeadersResponseByteHeaders(HttpHeaders rawHeaders) {
        if (rawHeaders.getValue("value") != null) {
            this.value = Base64.getDecoder().decode(rawHeaders.getValue("value"));
        }
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public byte[] getValue() {
        return CoreUtils.clone(this.value);
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the HeadersResponseByteHeaders object itself.
     */
    public HeadersResponseByteHeaders setValue(byte[] value) {
        this.value = CoreUtils.clone(value);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}