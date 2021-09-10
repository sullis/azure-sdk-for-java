// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.InboundNatRuleInner;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListInboundNatRule API service call.
 */
@Fluent
public final class InboundNatRuleListResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(InboundNatRuleListResult.class);

    /*
     * A list of inbound nat rules in a load balancer.
     */
    @JsonProperty(value = "value")
    private List<InboundNatRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of inbound nat rules in a load balancer.
     * 
     * @return the value value.
     */
    public List<InboundNatRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of inbound nat rules in a load balancer.
     * 
     * @param value the value value to set.
     * @return the InboundNatRuleListResult object itself.
     */
    public InboundNatRuleListResult withValue(List<InboundNatRuleInner> value) {
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
