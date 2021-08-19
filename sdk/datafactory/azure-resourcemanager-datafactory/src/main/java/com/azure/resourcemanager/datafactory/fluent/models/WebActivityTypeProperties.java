// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.WebActivityAuthentication;
import com.azure.resourcemanager.datafactory.models.WebActivityMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Web activity type properties. */
@Fluent
public final class WebActivityTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebActivityTypeProperties.class);

    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "method", required = true)
    private WebActivityMethod method;

    /*
     * Web activity target endpoint and path. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "body")
    private Object body;

    /*
     * Authentication method used for calling the endpoint.
     */
    @JsonProperty(value = "authentication")
    private WebActivityAuthentication authentication;

    /*
     * List of datasets passed to web endpoint.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetReference> datasets;

    /*
     * List of linked services passed to web endpoint.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceReference> linkedServices;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "connectVia")
    private IntegrationRuntimeReference connectVia;

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public WebActivityMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withMethod(WebActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: Web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: Web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     *
     * @return the authentication value.
     */
    public WebActivityAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     *
     * @param authentication the authentication value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the datasets property: List of datasets passed to web endpoint.
     *
     * @return the datasets value.
     */
    public List<DatasetReference> datasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: List of datasets passed to web endpoint.
     *
     * @param datasets the datasets value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services passed to web endpoint.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceReference> linkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: List of linked services passed to web endpoint.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withLinkedServices(List<LinkedServiceReference> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     *
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     *
     * @param connectVia the connectVia value to set.
     * @return the WebActivityTypeProperties object itself.
     */
    public WebActivityTypeProperties withConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (method() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property method in model WebActivityTypeProperties"));
        }
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model WebActivityTypeProperties"));
        }
        if (authentication() != null) {
            authentication().validate();
        }
        if (datasets() != null) {
            datasets().forEach(e -> e.validate());
        }
        if (linkedServices() != null) {
            linkedServices().forEach(e -> e.validate());
        }
        if (connectVia() != null) {
            connectVia().validate();
        }
    }
}
