// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.apiversion.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.cadl.apiversion.ApiVersionServiceVersion;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ApiVersionOps.
 */
public final class ApiVersionOpsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ApiVersionOpsService service;

    /**
     * The service client containing this operation class.
     */
    private final ApiVersionClientImpl client;

    /**
     * Initializes an instance of ApiVersionOpsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ApiVersionOpsImpl(ApiVersionClientImpl client) {
        this.service
            = RestProxy.create(ApiVersionOpsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public ApiVersionServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for ApiVersionClientApiVersionOps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}/{ApiVersion}")
    @ServiceInterface(name = "ApiVersionClientApiV")
    public interface ApiVersionOpsService {
        @Get("/apiversion")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> read(@HostParam("endpoint") String endpoint,
            @HostParam("ApiVersion") String apiVersion, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/apiversion")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> readSync(@HostParam("endpoint") String endpoint,
            @HostParam("ApiVersion") String apiVersion, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);
    }

    /**
     * The read operation.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sequence of textual characters along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> readWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.read(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), accept, requestOptions, context));
    }

    /**
     * The read operation.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sequence of textual characters along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> readWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.readSync(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(), accept,
            requestOptions, Context.NONE);
    }
}