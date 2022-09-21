// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.specialheaders.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
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
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SpecialHeadersOps. */
public final class SpecialHeadersOpsImpl {
    /** The proxy service used to perform REST calls. */
    private final SpecialHeadersOpsService service;

    /** The service client containing this operation class. */
    private final SpecialHeadersClientImpl client;

    /**
     * Initializes an instance of SpecialHeadersOpsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SpecialHeadersOpsImpl(SpecialHeadersClientImpl client) {
        this.service =
                RestProxy.create(
                        SpecialHeadersOpsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SpecialHeadersSpecialHeadersOps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SpecialHeadersSpecia")
    private interface SpecialHeadersOpsService {
        @Get("/special-headers/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("name") String name,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/special-headers/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> put(
                @HostParam("endpoint") String endpoint,
                @PathParam("name") String name,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Post("/special-headers/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> post(
                @HostParam("endpoint") String endpoint,
                @PathParam("name") String name,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Patch("/special-headers/resources/{name}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> createLro(
                @HostParam("endpoint") String endpoint,
                @PathParam("name") String name,
                @HeaderParam("content-type") String contentType,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/merge-patch+json") BinaryData resource,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Send a get request without header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String name, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.get(this.client.getEndpoint(), name, accept, requestOptions, context));
    }

    /**
     * Send a get request without header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String name, RequestOptions requestOptions) {
        return getWithResponseAsync(name, requestOptions).block();
    }

    /**
     * Send a put request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putWithResponseAsync(
            String name, BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.setHeader("repeatability-request-id", UUID.randomUUID().toString());
        requestOptionsLocal.setHeader(
                "repeatability-first-sent", DateTimeRfc1123.toRfc1123String(OffsetDateTime.now()));
        return FluxUtil.withContext(
                context -> service.put(this.client.getEndpoint(), name, accept, body, requestOptionsLocal, context));
    }

    /**
     * Send a put request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putWithResponse(String name, BinaryData body, RequestOptions requestOptions) {
        return putWithResponseAsync(name, body, requestOptions).block();
    }

    /**
     * Send a post request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postWithResponseAsync(
            String name, BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.setHeader("repeatability-request-id", UUID.randomUUID().toString());
        requestOptionsLocal.setHeader(
                "repeatability-first-sent", DateTimeRfc1123.toRfc1123String(OffsetDateTime.now()));
        return FluxUtil.withContext(
                context -> service.post(this.client.getEndpoint(), name, accept, body, requestOptionsLocal, context));
    }

    /**
     * Send a post request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postWithResponse(String name, BinaryData body, RequestOptions requestOptions) {
        return postWithResponseAsync(name, body, requestOptions).block();
    }

    /**
     * Send a LRO request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param resource The resource parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BinaryData>> createLroWithResponseAsync(
            String name, BinaryData resource, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.setHeader("repeatability-request-id", UUID.randomUUID().toString());
        requestOptionsLocal.setHeader(
                "repeatability-first-sent", DateTimeRfc1123.toRfc1123String(OffsetDateTime.now()));
        return FluxUtil.withContext(
                context ->
                        service.createLro(
                                this.client.getEndpoint(),
                                name,
                                contentType,
                                this.client.getServiceVersion().getVersion(),
                                accept,
                                resource,
                                requestOptionsLocal,
                                context));
    }

    /**
     * Send a LRO request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param resource The resource parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateLroAsync(
            String name, BinaryData resource, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.createLroWithResponseAsync(name, resource, requestOptions),
                new DefaultPollingStrategy<>(
                        this.client.getHttpPipeline(),
                        null,
                        requestOptions != null && requestOptions.getContext() != null
                                ? requestOptions.getContext()
                                : Context.NONE),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Send a LRO request with header Repeatability-Request-ID and Repeatability-First-Sent.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     description: String (Optional)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param resource The resource parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateLro(
            String name, BinaryData resource, RequestOptions requestOptions) {
        return this.beginCreateLroAsync(name, resource, requestOptions).getSyncPoller();
    }
}