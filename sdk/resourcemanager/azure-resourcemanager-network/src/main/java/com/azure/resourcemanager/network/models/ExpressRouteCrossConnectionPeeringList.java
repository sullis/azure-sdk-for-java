// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListPeering API service call retrieves all peerings that belong
 * to an ExpressRouteCrossConnection.
 */
@Fluent
public final class ExpressRouteCrossConnectionPeeringList {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionPeeringList.class);

    /*
     * The peerings in an express route cross connection.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCrossConnectionPeeringInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The peerings in an express route cross
     * connection.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The peerings in an express route cross
     * connection.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCrossConnectionPeeringList object itself.
     */
    public ExpressRouteCrossConnectionPeeringList withValue(List<ExpressRouteCrossConnectionPeeringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
