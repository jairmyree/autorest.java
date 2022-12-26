// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A JSON web signature. */
@Fluent
public final class JWK {
    /*
     * JSON web key parameter
     */
    @JsonProperty(value = "jwk")
    private JWKHeader jwk;

    /*
     * The algorithm used to sign or encrypt the JWT
     */
    @JsonProperty(value = "alg")
    private String alg;

    /** Creates an instance of JWK class. */
    public JWK() {}

    /**
     * Get the jwk property: JSON web key parameter.
     *
     * @return the jwk value.
     */
    public JWKHeader getJwk() {
        return this.jwk;
    }

    /**
     * Set the jwk property: JSON web key parameter.
     *
     * @param jwk the jwk value to set.
     * @return the JWK object itself.
     */
    public JWK setJwk(JWKHeader jwk) {
        this.jwk = jwk;
        return this;
    }

    /**
     * Get the alg property: The algorithm used to sign or encrypt the JWT.
     *
     * @return the alg value.
     */
    public String getAlg() {
        return this.alg;
    }

    /**
     * Set the alg property: The algorithm used to sign or encrypt the JWT.
     *
     * @param alg the alg value to set.
     * @return the JWK object itself.
     */
    public JWK setAlg(String alg) {
        this.alg = alg;
        return this;
    }
}