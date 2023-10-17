// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.lro.rpc.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result of the generation. */
@Immutable
public final class GenerationResult {
    /*
     * The data.
     */
    @Generated
    @JsonProperty(value = "data")
    private String data;

    /**
     * Creates an instance of GenerationResult class.
     *
     * @param data the data value to set.
     */
    @Generated
    @JsonCreator
    private GenerationResult(@JsonProperty(value = "data") String data) {
        this.data = data;
    }

    /**
     * Get the data property: The data.
     *
     * @return the data value.
     */
    @Generated
    public String getData() {
        return this.data;
    }
}