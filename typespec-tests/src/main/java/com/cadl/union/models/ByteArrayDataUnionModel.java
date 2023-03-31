// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.union.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonValue;

/** The ByteArrayDataUnionModel model. */
@Immutable
public final class ByteArrayDataUnionModel extends DataUnionModelBase {
    private final byte[] value;

    /**
     * Creates an instance of ByteArrayDataUnionModel class.
     *
     * @param value the value.
     */
    public ByteArrayDataUnionModel(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    @JsonValue
    public byte[] getValue() {
        return this.value;
    }
}