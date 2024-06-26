// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentsForResourceGroups;

public final class ConfigurationAssignmentsForResourceGroupsImpl implements ConfigurationAssignmentsForResourceGroups {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationAssignmentsForResourceGroupsImpl.class);

    private final ConfigurationAssignmentsForResourceGroupsClient innerClient;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    public ConfigurationAssignmentsForResourceGroupsImpl(
        ConfigurationAssignmentsForResourceGroupsClient innerClient,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ConfigurationAssignment> getByResourceGroupWithResponse(
        String resourceGroupName, String configurationAssignmentName, Context context) {
        Response<ConfigurationAssignmentInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, configurationAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationAssignment getByResourceGroup(String resourceGroupName, String configurationAssignmentName) {
        ConfigurationAssignmentInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, configurationAssignmentName);
        if (inner != null) {
            return new ConfigurationAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConfigurationAssignment> createOrUpdateWithResponse(
        String resourceGroupName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context) {
        Response<ConfigurationAssignmentInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName, configurationAssignmentName, configurationAssignment, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationAssignment createOrUpdate(
        String resourceGroupName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment) {
        ConfigurationAssignmentInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, configurationAssignmentName, configurationAssignment);
        if (inner != null) {
            return new ConfigurationAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConfigurationAssignment> updateWithResponse(
        String resourceGroupName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context) {
        Response<ConfigurationAssignmentInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, configurationAssignmentName, configurationAssignment, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationAssignment update(
        String resourceGroupName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment) {
        ConfigurationAssignmentInner inner =
            this.serviceClient().update(resourceGroupName, configurationAssignmentName, configurationAssignment);
        if (inner != null) {
            return new ConfigurationAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConfigurationAssignment> deleteByResourceGroupWithResponse(
        String resourceGroupName, String configurationAssignmentName, Context context) {
        Response<ConfigurationAssignmentInner> inner =
            this.serviceClient().deleteWithResponse(resourceGroupName, configurationAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationAssignment deleteByResourceGroup(String resourceGroupName, String configurationAssignmentName) {
        ConfigurationAssignmentInner inner =
            this.serviceClient().delete(resourceGroupName, configurationAssignmentName);
        if (inner != null) {
            return new ConfigurationAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ConfigurationAssignmentsForResourceGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }
}
