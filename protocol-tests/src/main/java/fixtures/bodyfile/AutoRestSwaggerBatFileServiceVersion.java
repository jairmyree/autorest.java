// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodyfile;

import com.azure.core.util.ServiceVersion;

/** Service version of AutoRestSwaggerBatFileServiceClient. */
public enum AutoRestSwaggerBatFileServiceVersion implements ServiceVersion {
    /** Enum value 1.0.0. */
    V1_0_0("1.0.0");

    private final String version;

    AutoRestSwaggerBatFileServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link AutoRestSwaggerBatFileServiceVersion}.
     */
    public static AutoRestSwaggerBatFileServiceVersion getLatest() {
        return V1_0_0;
    }
}