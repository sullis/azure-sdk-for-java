// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Nic entity property bag. */
@Immutable
public final class NicEntityProperties extends EntityCommonProperties {
    /*
     * The MAC address of this network interface
     */
    @JsonProperty(value = "macAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String macAddress;

    /*
     * The IP entity id of this network interface
     */
    @JsonProperty(value = "ipAddressEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddressEntityId;

    /*
     * A list of VLANs of the network interface entity.
     */
    @JsonProperty(value = "vlans", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> vlans;

    /**
     * Get the macAddress property: The MAC address of this network interface.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Get the ipAddressEntityId property: The IP entity id of this network interface.
     *
     * @return the ipAddressEntityId value.
     */
    public String ipAddressEntityId() {
        return this.ipAddressEntityId;
    }

    /**
     * Get the vlans property: A list of VLANs of the network interface entity.
     *
     * @return the vlans value.
     */
    public List<String> vlans() {
        return this.vlans;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
