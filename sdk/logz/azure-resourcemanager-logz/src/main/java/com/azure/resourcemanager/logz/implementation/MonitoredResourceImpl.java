// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.logz.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.logz.models.MonitoredResource;

public final class MonitoredResourceImpl implements MonitoredResource {
    private MonitoredResourceInner innerObject;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    MonitoredResourceImpl(
        MonitoredResourceInner innerObject, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public Boolean sendingMetrics() {
        return this.innerModel().sendingMetrics();
    }

    public String reasonForMetricsStatus() {
        return this.innerModel().reasonForMetricsStatus();
    }

    public Boolean sendingLogs() {
        return this.innerModel().sendingLogs();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String reasonForLogsStatus() {
        return this.innerModel().reasonForLogsStatus();
    }

    public MonitoredResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }
}
