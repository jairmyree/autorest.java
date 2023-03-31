// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.lro.rpc.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.lro.rpc.RpcClient;
import com.azure.lro.rpc.RpcClientBuilder;

class RpcClientTestBase extends TestBase {
    protected RpcClient rpcClient;

    @Override
    protected void beforeTest() {
        RpcClientBuilder rpcClientbuilder =
                new RpcClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            rpcClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            rpcClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        rpcClient = rpcClientbuilder.buildClient();
    }
}