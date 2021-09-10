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
import java.util.List;

/**
 * Effective Route.
 */
@Fluent
public final class EffectiveRoute {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(EffectiveRoute.class);

    /*
     * The name of the user defined route. This is optional.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Who created the route. Possible values are: 'Unknown', 'User',
     * 'VirtualNetworkGateway', and 'Default'.
     */
    @JsonProperty(value = "source")
    private EffectiveRouteSource source;

    /*
     * The value of effective route. Possible values are: 'Active' and
     * 'Invalid'.
     */
    @JsonProperty(value = "state")
    private EffectiveRouteState state;

    /*
     * The address prefixes of the effective routes in CIDR notation.
     */
    @JsonProperty(value = "addressPrefix")
    private List<String> addressPrefix;

    /*
     * The IP address of the next hop of the effective route.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private List<String> nextHopIpAddress;

    /*
     * The type of Azure hop the packet should be sent to. Possible values are:
     * 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance',
     * and 'None'.
     */
    @JsonProperty(value = "nextHopType")
    private RouteNextHopType nextHopType;

    /**
     * Get the name property: The name of the user defined route. This is
     * optional.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the user defined route. This is
     * optional.
     * 
     * @param name the name value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: Who created the route. Possible values are:
     * 'Unknown', 'User', 'VirtualNetworkGateway', and 'Default'.
     * 
     * @return the source value.
     */
    public EffectiveRouteSource source() {
        return this.source;
    }

    /**
     * Set the source property: Who created the route. Possible values are:
     * 'Unknown', 'User', 'VirtualNetworkGateway', and 'Default'.
     * 
     * @param source the source value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withSource(EffectiveRouteSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state property: The value of effective route. Possible values
     * are: 'Active' and 'Invalid'.
     * 
     * @return the state value.
     */
    public EffectiveRouteState state() {
        return this.state;
    }

    /**
     * Set the state property: The value of effective route. Possible values
     * are: 'Active' and 'Invalid'.
     * 
     * @param state the state value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withState(EffectiveRouteState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the addressPrefix property: The address prefixes of the effective
     * routes in CIDR notation.
     * 
     * @return the addressPrefix value.
     */
    public List<String> addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: The address prefixes of the effective
     * routes in CIDR notation.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withAddressPrefix(List<String> addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the nextHopIpAddress property: The IP address of the next hop of the
     * effective route.
     * 
     * @return the nextHopIpAddress value.
     */
    public List<String> nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress property: The IP address of the next hop of the
     * effective route.
     * 
     * @param nextHopIpAddress the nextHopIpAddress value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopIpAddress(List<String> nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

    /**
     * Get the nextHopType property: The type of Azure hop the packet should be
     * sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal',
     * 'Internet', 'VirtualAppliance', and 'None'.
     * 
     * @return the nextHopType value.
     */
    public RouteNextHopType nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType property: The type of Azure hop the packet should be
     * sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal',
     * 'Internet', 'VirtualAppliance', and 'None'.
     * 
     * @param nextHopType the nextHopType value to set.
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopType(RouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
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
