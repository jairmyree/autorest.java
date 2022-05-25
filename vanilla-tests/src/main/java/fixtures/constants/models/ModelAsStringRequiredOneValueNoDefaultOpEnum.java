// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ModelAsStringRequiredOneValueNoDefaultOpEnum. */
public final class ModelAsStringRequiredOneValueNoDefaultOpEnum
        extends ExpandableStringEnum<ModelAsStringRequiredOneValueNoDefaultOpEnum> {
    /** Static value value1 for ModelAsStringRequiredOneValueNoDefaultOpEnum. */
    public static final ModelAsStringRequiredOneValueNoDefaultOpEnum VALUE1 = fromString("value1");

    /**
     * Creates or finds a ModelAsStringRequiredOneValueNoDefaultOpEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ModelAsStringRequiredOneValueNoDefaultOpEnum.
     */
    @JsonCreator
    public static ModelAsStringRequiredOneValueNoDefaultOpEnum fromString(String name) {
        return fromString(name, ModelAsStringRequiredOneValueNoDefaultOpEnum.class);
    }

    /**
     * Gets known ModelAsStringRequiredOneValueNoDefaultOpEnum values.
     *
     * @return known ModelAsStringRequiredOneValueNoDefaultOpEnum values.
     */
    public static Collection<ModelAsStringRequiredOneValueNoDefaultOpEnum> values() {
        return values(ModelAsStringRequiredOneValueNoDefaultOpEnum.class);
    }
}