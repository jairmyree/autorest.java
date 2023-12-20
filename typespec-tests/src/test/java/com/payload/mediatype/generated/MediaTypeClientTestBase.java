// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.payload.mediatype.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.payload.mediatype.MediaTypeClient;
import com.payload.mediatype.MediaTypeClientBuilder;

class MediaTypeClientTestBase extends TestProxyTestBase {
    protected MediaTypeClient mediaTypeClient;

    @Override
    protected void beforeTest() {
        MediaTypeClientBuilder mediaTypeClientbuilder
            = new MediaTypeClientBuilder().httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            mediaTypeClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            mediaTypeClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        mediaTypeClient = mediaTypeClientbuilder.buildClient();

    }
}
