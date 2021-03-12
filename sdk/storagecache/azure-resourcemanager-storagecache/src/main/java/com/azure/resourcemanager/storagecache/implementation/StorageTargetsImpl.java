// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.StorageTargetsClient;
import com.azure.resourcemanager.storagecache.fluent.models.StorageTargetInner;
import com.azure.resourcemanager.storagecache.models.StorageTarget;
import com.azure.resourcemanager.storagecache.models.StorageTargets;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class StorageTargetsImpl implements StorageTargets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageTargetsImpl.class);

    private final StorageTargetsClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public StorageTargetsImpl(
        StorageTargetsClient innerClient, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void dnsRefresh(String resourceGroupName, String cacheName, String storageTargetName) {
        this.serviceClient().dnsRefresh(resourceGroupName, cacheName, storageTargetName);
    }

    public void dnsRefresh(String resourceGroupName, String cacheName, String storageTargetName, Context context) {
        this.serviceClient().dnsRefresh(resourceGroupName, cacheName, storageTargetName, context);
    }

    public PagedIterable<StorageTarget> listByCache(String resourceGroupName, String cacheName) {
        PagedIterable<StorageTargetInner> inner = this.serviceClient().listByCache(resourceGroupName, cacheName);
        return Utils.mapPage(inner, inner1 -> new StorageTargetImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageTarget> listByCache(String resourceGroupName, String cacheName, Context context) {
        PagedIterable<StorageTargetInner> inner =
            this.serviceClient().listByCache(resourceGroupName, cacheName, context);
        return Utils.mapPage(inner, inner1 -> new StorageTargetImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String cacheName, String storageTargetName) {
        this.serviceClient().delete(resourceGroupName, cacheName, storageTargetName);
    }

    public void delete(String resourceGroupName, String cacheName, String storageTargetName, Context context) {
        this.serviceClient().delete(resourceGroupName, cacheName, storageTargetName, context);
    }

    public StorageTarget get(String resourceGroupName, String cacheName, String storageTargetName) {
        StorageTargetInner inner = this.serviceClient().get(resourceGroupName, cacheName, storageTargetName);
        if (inner != null) {
            return new StorageTargetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageTarget> getWithResponse(
        String resourceGroupName, String cacheName, String storageTargetName, Context context) {
        Response<StorageTargetInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, cacheName, storageTargetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageTargetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageTarget getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        String storageTargetName = Utils.getValueFromIdByName(id, "storageTargets");
        if (storageTargetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageTargets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, cacheName, storageTargetName, Context.NONE).getValue();
    }

    public Response<StorageTarget> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        String storageTargetName = Utils.getValueFromIdByName(id, "storageTargets");
        if (storageTargetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageTargets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, cacheName, storageTargetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        String storageTargetName = Utils.getValueFromIdByName(id, "storageTargets");
        if (storageTargetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageTargets'.", id)));
        }
        this.delete(resourceGroupName, cacheName, storageTargetName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String cacheName = Utils.getValueFromIdByName(id, "caches");
        if (cacheName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'caches'.", id)));
        }
        String storageTargetName = Utils.getValueFromIdByName(id, "storageTargets");
        if (storageTargetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageTargets'.", id)));
        }
        this.delete(resourceGroupName, cacheName, storageTargetName, context);
    }

    private StorageTargetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }

    public StorageTargetImpl define(String name) {
        return new StorageTargetImpl(name, this.manager());
    }
}
