// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.basicpolymorphicmodels.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DerivedFromBaseClassA model. */
@Fluent
public final class DerivedFromBaseClassA extends BaseClass {
    /*
     * An example property on a derived type
     */
    @JsonProperty(value = "derivedClassAProperty", required = true)
    private String derivedClassAProperty;

    /**
     * Creates an instance of DerivedFromBaseClassA class.
     *
     * @param baseClassProperty the baseClassProperty value to set.
     * @param derivedClassAProperty the derivedClassAProperty value to set.
     */
    @JsonCreator
    public DerivedFromBaseClassA(
            @JsonProperty(value = "baseClassProperty", required = true) String baseClassProperty,
            @JsonProperty(value = "derivedClassAProperty", required = true) String derivedClassAProperty) {
        super(baseClassProperty);
        this.derivedClassAProperty = derivedClassAProperty;
    }

    /**
     * Get the derivedClassAProperty property: An example property on a derived type.
     *
     * @return the derivedClassAProperty value.
     */
    public String getDerivedClassAProperty() {
        return this.derivedClassAProperty;
    }
}