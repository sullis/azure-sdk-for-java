// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.implementation;

import com.azure.resourcemanager.purview.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.purview.models.PrivateLinkResource;
import com.azure.resourcemanager.purview.models.PrivateLinkResourceProperties;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.purview.PurviewManager serviceManager;

    PrivateLinkResourceImpl(
        PrivateLinkResourceInner innerObject, com.azure.resourcemanager.purview.PurviewManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public PrivateLinkResourceProperties properties() {
        return this.innerModel().properties();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.purview.PurviewManager manager() {
        return this.serviceManager;
    }
}
