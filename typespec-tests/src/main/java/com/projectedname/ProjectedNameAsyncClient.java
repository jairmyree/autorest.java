// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.projectedname;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.projectedname.implementation.ProjectedNameClientImpl;
import com.projectedname.models.Project;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ProjectedNameClient type. */
@ServiceClient(builder = ProjectedNameClientBuilder.class, isAsync = true)
public final class ProjectedNameAsyncClient {
    @Generated private final ProjectedNameClientImpl serviceClient;

    /**
     * Initializes an instance of ProjectedNameAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ProjectedNameAsyncClient(ProjectedNameClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The jsonProjection operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     codegen: String (Optional)
     *     builtfrom: String (Optional)
     *     wasMadeFor: String (Optional)
     * }
     * }</pre>
     *
     * @param project The project parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> jsonProjectionWithResponse(BinaryData project, RequestOptions requestOptions) {
        return this.serviceClient.jsonProjectionWithResponseAsync(project, requestOptions);
    }

    /**
     * The clientProjection operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     codegen: String (Optional)
     *     builtfrom: String (Optional)
     *     wasMadeFor: String (Optional)
     * }
     * }</pre>
     *
     * @param project The project parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> clientProjectionWithResponse(BinaryData project, RequestOptions requestOptions) {
        return this.serviceClient.clientProjectionWithResponseAsync(project, requestOptions);
    }

    /**
     * The languageProjection operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     codegen: String (Optional)
     *     builtfrom: String (Optional)
     *     wasMadeFor: String (Optional)
     * }
     * }</pre>
     *
     * @param project The project parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> languageProjectionWithResponse(BinaryData project, RequestOptions requestOptions) {
        return this.serviceClient.languageProjectionWithResponseAsync(project, requestOptions);
    }

    /**
     * The jsonProjection operation.
     *
     * @param project The project parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> jsonProjection(Project project) {
        // Generated convenience method for jsonProjectionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return jsonProjectionWithResponse(BinaryData.fromObject(project), requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The clientProjection operation.
     *
     * @param project The project parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> clientProjection(Project project) {
        // Generated convenience method for clientProjectionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return clientProjectionWithResponse(BinaryData.fromObject(project), requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The languageProjection operation.
     *
     * @param project The project parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> languageProjection(Project project) {
        // Generated convenience method for languageProjectionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return languageProjectionWithResponse(BinaryData.fromObject(project), requestOptions).flatMap(FluxUtil::toMono);
    }
}