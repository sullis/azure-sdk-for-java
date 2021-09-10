// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of Virtual Network Tap configuration.
 */
@Fluent
public final class NetworkInterfaceTapConfigurationPropertiesFormatInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkInterfaceTapConfigurationPropertiesFormatInner.class);

    /*
     * The reference of the Virtual Network Tap resource.
     */
    @JsonProperty(value = "virtualNetworkTap")
    private VirtualNetworkTapInner virtualNetworkTap;

    /*
     * The provisioning state of the network interface tap configuration.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the virtualNetworkTap property: The reference of the Virtual Network
     * Tap resource.
     * 
     * @return the virtualNetworkTap value.
     */
    public VirtualNetworkTapInner virtualNetworkTap() {
        return this.virtualNetworkTap;
    }

    /**
     * Set the virtualNetworkTap property: The reference of the Virtual Network
     * Tap resource.
     * 
     * @param virtualNetworkTap the virtualNetworkTap value to set.
     * @return the NetworkInterfaceTapConfigurationPropertiesFormatInner object
     * itself.
     */
    public NetworkInterfaceTapConfigurationPropertiesFormatInner withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        this.virtualNetworkTap = virtualNetworkTap;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * network interface tap configuration. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkTap() != null) {
            virtualNetworkTap().validate();
        }
    }
}
