// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRoutePorts Location Bandwidths Real-time inventory of available
 * ExpressRoute port bandwidths.
 */
@Immutable
public final class ExpressRoutePortsLocationBandwidths {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRoutePortsLocationBandwidths.class);

    /*
     * Bandwidth descriptive name
     */
    @JsonProperty(value = "offerName", access = JsonProperty.Access.WRITE_ONLY)
    private String offerName;

    /*
     * Bandwidth value in Gbps
     */
    @JsonProperty(value = "valueInGbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer valueInGbps;

    /**
     * Get the offerName property: Bandwidth descriptive name.
     * 
     * @return the offerName value.
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Get the valueInGbps property: Bandwidth value in Gbps.
     * 
     * @return the valueInGbps value.
     */
    public Integer valueInGbps() {
        return this.valueInGbps;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
