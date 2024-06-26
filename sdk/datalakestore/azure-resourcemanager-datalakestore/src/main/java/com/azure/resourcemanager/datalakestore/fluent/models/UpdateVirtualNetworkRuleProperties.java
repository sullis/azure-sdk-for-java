// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The virtual network rule properties to use when updating a virtual network rule. */
@Fluent
public final class UpdateVirtualNetworkRuleProperties {
    /*
     * The resource identifier for the subnet.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /** Creates an instance of UpdateVirtualNetworkRuleProperties class. */
    public UpdateVirtualNetworkRuleProperties() {
    }

    /**
     * Get the subnetId property: The resource identifier for the subnet.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The resource identifier for the subnet.
     *
     * @param subnetId the subnetId value to set.
     * @return the UpdateVirtualNetworkRuleProperties object itself.
     */
    public UpdateVirtualNetworkRuleProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
