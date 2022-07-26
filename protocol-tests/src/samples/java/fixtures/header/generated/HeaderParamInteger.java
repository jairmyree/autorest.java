// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.header.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import fixtures.header.AutoRestSwaggerBatHeaderServiceClient;
import fixtures.header.AutoRestSwaggerBatHeaderServiceClientBuilder;

public class HeaderParamInteger {
    public static void main(String[] args) {
        AutoRestSwaggerBatHeaderServiceClient autoRestSwaggerBatHeaderServiceClient =
                new AutoRestSwaggerBatHeaderServiceClientBuilder().host("http://localhost:3000").buildClient();
        // BEGIN:fixtures.header.generated.headerparaminteger.headerparaminteger
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                autoRestSwaggerBatHeaderServiceClient.paramIntegerWithResponse("positive", 1, requestOptions);
        // END:fixtures.header.generated.headerparaminteger.headerparaminteger
    }
}