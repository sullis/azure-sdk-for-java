// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.EdgeModulesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleEntityInner;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleProvisioningTokenInner;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModuleEntity;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModuleProvisioningToken;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModules;
import com.azure.resourcemanager.videoanalyzer.models.ListProvisioningTokenInput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EdgeModulesImpl implements EdgeModules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeModulesImpl.class);

    private final EdgeModulesClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public EdgeModulesImpl(
        EdgeModulesClient innerClient, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EdgeModuleEntity> list(String resourceGroupName, String accountName) {
        PagedIterable<EdgeModuleEntityInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new EdgeModuleEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<EdgeModuleEntity> list(
        String resourceGroupName, String accountName, Integer top, Context context) {
        PagedIterable<EdgeModuleEntityInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, top, context);
        return Utils.mapPage(inner, inner1 -> new EdgeModuleEntityImpl(inner1, this.manager()));
    }

    public EdgeModuleEntity get(String resourceGroupName, String accountName, String edgeModuleName) {
        EdgeModuleEntityInner inner = this.serviceClient().get(resourceGroupName, accountName, edgeModuleName);
        if (inner != null) {
            return new EdgeModuleEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EdgeModuleEntity> getWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context) {
        Response<EdgeModuleEntityInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, edgeModuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EdgeModuleEntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String edgeModuleName) {
        this.serviceClient().delete(resourceGroupName, accountName, edgeModuleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, edgeModuleName, context);
    }

    public EdgeModuleProvisioningToken listProvisioningToken(
        String resourceGroupName, String accountName, String edgeModuleName, ListProvisioningTokenInput parameters) {
        EdgeModuleProvisioningTokenInner inner =
            this.serviceClient().listProvisioningToken(resourceGroupName, accountName, edgeModuleName, parameters);
        if (inner != null) {
            return new EdgeModuleProvisioningTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EdgeModuleProvisioningToken> listProvisioningTokenWithResponse(
        String resourceGroupName,
        String accountName,
        String edgeModuleName,
        ListProvisioningTokenInput parameters,
        Context context) {
        Response<EdgeModuleProvisioningTokenInner> inner =
            this
                .serviceClient()
                .listProvisioningTokenWithResponse(resourceGroupName, accountName, edgeModuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EdgeModuleProvisioningTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EdgeModuleEntity getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String edgeModuleName = Utils.getValueFromIdByName(id, "edgeModules");
        if (edgeModuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'edgeModules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, edgeModuleName, Context.NONE).getValue();
    }

    public Response<EdgeModuleEntity> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String edgeModuleName = Utils.getValueFromIdByName(id, "edgeModules");
        if (edgeModuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'edgeModules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, edgeModuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String edgeModuleName = Utils.getValueFromIdByName(id, "edgeModules");
        if (edgeModuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'edgeModules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, edgeModuleName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String edgeModuleName = Utils.getValueFromIdByName(id, "edgeModules");
        if (edgeModuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'edgeModules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, edgeModuleName, context);
    }

    private EdgeModulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    public EdgeModuleEntityImpl define(String name) {
        return new EdgeModuleEntityImpl(name, this.manager());
    }
}
