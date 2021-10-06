// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing a managed private endpoint. */
@Fluent
public final class ManagedPrivateEndpointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedPrivateEndpointInner.class);

    /*
     * A managed private endpoint.
     */
    @JsonProperty(value = "properties")
    private ManagedPrivateEndpointProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: A managed private endpoint.
     *
     * @return the innerProperties value.
     */
    private ManagedPrivateEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the privateLinkResourceId property: The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkResourceId();
    }

    /**
     * Set the privateLinkResourceId property: The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withPrivateLinkResourceId(String privateLinkResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedPrivateEndpointProperties();
        }
        this.innerProperties().withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    /**
     * Get the privateLinkResourceRegion property: The region of the resource to which the managed private endpoint is
     * created.
     *
     * @return the privateLinkResourceRegion value.
     */
    public String privateLinkResourceRegion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkResourceRegion();
    }

    /**
     * Set the privateLinkResourceRegion property: The region of the resource to which the managed private endpoint is
     * created.
     *
     * @param privateLinkResourceRegion the privateLinkResourceRegion value to set.
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withPrivateLinkResourceRegion(String privateLinkResourceRegion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedPrivateEndpointProperties();
        }
        this.innerProperties().withPrivateLinkResourceRegion(privateLinkResourceRegion);
        return this;
    }

    /**
     * Get the groupId property: The groupId in which the managed private endpoint is created.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: The groupId in which the managed private endpoint is created.
     *
     * @param groupId the groupId value to set.
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedPrivateEndpointProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the requestMessage property: The user request message.
     *
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().requestMessage();
    }

    /**
     * Set the requestMessage property: The user request message.
     *
     * @param requestMessage the requestMessage value to set.
     * @return the ManagedPrivateEndpointInner object itself.
     */
    public ManagedPrivateEndpointInner withRequestMessage(String requestMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedPrivateEndpointProperties();
        }
        this.innerProperties().withRequestMessage(requestMessage);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
