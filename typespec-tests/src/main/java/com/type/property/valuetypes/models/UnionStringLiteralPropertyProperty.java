// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines values for UnionStringLiteralPropertyProperty.
 */
public enum UnionStringLiteralPropertyProperty implements JsonSerializable<UnionStringLiteralPropertyProperty> {
    /**
     * Enum value hello.
     */
    HELLO("hello"),

    /**
     * Enum value world.
     */
    WORLD("world");

    /**
     * The actual serialized value for a UnionStringLiteralPropertyProperty instance.
     */
    private final String value;

    UnionStringLiteralPropertyProperty(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UnionStringLiteralPropertyProperty instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed UnionStringLiteralPropertyProperty object, or null if unable to parse.
     */
    public static UnionStringLiteralPropertyProperty fromString(String value) {
        if (value == null) {
            return null;
        }
        UnionStringLiteralPropertyProperty[] items = UnionStringLiteralPropertyProperty.values();
        for (UnionStringLiteralPropertyProperty item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeString(value);
    }

    /**
     * Reads a UnionStringLiteralPropertyProperty from the JSON stream.
     * <p>
     * The passed JsonReader must be positioned at a JsonToken.STRING value.
     * 
     * @param jsonReader The JsonReader being read.
     * @return The UnionStringLiteralPropertyProperty that the JSON stream represented, may return null.
     * @throws java.io.IOException If a UnionStringLiteralPropertyProperty fails to be read from the JsonReader.
     */
    @Generated
    public static UnionStringLiteralPropertyProperty fromJson(JsonReader jsonReader) throws IOException {
        return fromString(jsonReader.getString());
    }
}