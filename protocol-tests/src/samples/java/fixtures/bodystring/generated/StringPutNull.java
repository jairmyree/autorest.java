// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodystring.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import fixtures.bodystring.StringOperationClient;
import fixtures.bodystring.StringOperationClientBuilder;

public class StringPutNull {
    public static void main(String[] args) {
        // BEGIN: fixtures.bodystring.generated.stringputnull.stringputnull
        StringOperationClient client = new StringOperationClientBuilder().host("http://localhost:3000").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.putNullWithResponse(requestOptions);
        // END: fixtures.bodystring.generated.stringputnull.stringputnull
    }
}
