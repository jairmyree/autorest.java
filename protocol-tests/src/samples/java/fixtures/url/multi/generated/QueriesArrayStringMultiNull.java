// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.url.multi.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import fixtures.url.multi.AutoRestUrlMutliCollectionFormatTestServiceClient;
import fixtures.url.multi.AutoRestUrlMutliCollectionFormatTestServiceClientBuilder;

public class QueriesArrayStringMultiNull {
    public static void main(String[] args) {
        // BEGIN: fixtures.url.multi.generated.queriesarraystringmultinull.queriesarraystringmultinull
        AutoRestUrlMutliCollectionFormatTestServiceClient client =
                new AutoRestUrlMutliCollectionFormatTestServiceClientBuilder()
                        .host("http://localhost:3000")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.arrayStringMultiNullWithResponse(requestOptions);
        // END: fixtures.url.multi.generated.queriesarraystringmultinull.queriesarraystringmultinull
    }
}
