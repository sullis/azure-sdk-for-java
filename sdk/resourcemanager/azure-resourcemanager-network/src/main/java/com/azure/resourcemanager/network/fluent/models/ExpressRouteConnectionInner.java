// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitPeeringId;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRouteConnection resource.
 */
@Fluent
public final class ExpressRouteConnectionInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteConnectionInner.class);

    /*
     * Properties of the ExpressRouteConnection subresource.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteConnectionProperties innerProperties;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the innerProperties property: Properties of the
     * ExpressRouteConnection subresource.
     * 
     * @return the innerProperties value.
     */
    private ExpressRouteConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     * 
     * @param name the name value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExpressRouteConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the expressRouteCircuitPeering property: The ExpressRoute circuit
     * peering.
     * 
     * @return the expressRouteCircuitPeering value.
     */
    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteCircuitPeering();
    }

    /**
     * Set the expressRouteCircuitPeering property: The ExpressRoute circuit
     * peering.
     * 
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value
     * to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withExpressRouteCircuitPeering(ExpressRouteCircuitPeeringId expressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the authorizationKey property: Authorization key to establish the
     * connection.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: Authorization key to establish the
     * connection.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight associated to the
     * connection.
     * 
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: The routing weight associated to the
     * connection.
     * 
     * @param routingWeight the routingWeight value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
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
        if (name() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property name in model ExpressRouteConnectionInner"));
        }
    }
}
