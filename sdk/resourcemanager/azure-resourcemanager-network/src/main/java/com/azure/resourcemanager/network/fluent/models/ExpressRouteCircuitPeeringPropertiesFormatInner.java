// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.models.ExpressRouteConnectionId;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringState;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ExpressRouteCircuitPeeringPropertiesFormat model.
 */
@Fluent
public final class ExpressRouteCircuitPeeringPropertiesFormatInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitPeeringPropertiesFormatInner.class);

    /*
     * The peering type.
     */
    @JsonProperty(value = "peeringType")
    private ExpressRoutePeeringType peeringType;

    /*
     * The peering state.
     */
    @JsonProperty(value = "state")
    private ExpressRoutePeeringState state;

    /*
     * The Azure ASN.
     */
    @JsonProperty(value = "azureASN")
    private Integer azureAsn;

    /*
     * The peer ASN.
     */
    @JsonProperty(value = "peerASN")
    private Long peerAsn;

    /*
     * The primary address prefix.
     */
    @JsonProperty(value = "primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /*
     * The secondary address prefix.
     */
    @JsonProperty(value = "secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /*
     * The primary port.
     */
    @JsonProperty(value = "primaryAzurePort")
    private String primaryAzurePort;

    /*
     * The secondary port.
     */
    @JsonProperty(value = "secondaryAzurePort")
    private String secondaryAzurePort;

    /*
     * The shared key.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * The VLAN ID.
     */
    @JsonProperty(value = "vlanId")
    private Integer vlanId;

    /*
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /*
     * Gets peering stats.
     */
    @JsonProperty(value = "stats")
    private ExpressRouteCircuitStatsInner stats;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "gatewayManagerEtag")
    private String gatewayManagerEtag;

    /*
     * Gets whether the provider or the customer last modified the peering.
     */
    @JsonProperty(value = "lastModifiedBy")
    private String lastModifiedBy;

    /*
     * The reference of the RouteFilter resource.
     */
    @JsonProperty(value = "routeFilter")
    private RouteFilterInner routeFilter;

    /*
     * The IPv6 peering configuration.
     */
    @JsonProperty(value = "ipv6PeeringConfig")
    private Ipv6ExpressRouteCircuitPeeringConfigInner ipv6PeeringConfig;

    /*
     * The ExpressRoute connection.
     */
    @JsonProperty(value = "expressRouteConnection")
    private ExpressRouteConnectionId expressRouteConnection;

    /*
     * The list of circuit connections associated with Azure Private Peering
     * for this circuit.
     */
    @JsonProperty(value = "connections")
    private List<ExpressRouteCircuitConnectionInner> connections;

    /**
     * Get the peeringType property: The peering type.
     * 
     * @return the peeringType value.
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peeringType property: The peering type.
     * 
     * @param peeringType the peeringType value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the state property: The peering state.
     * 
     * @return the state value.
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the state property: The peering state.
     * 
     * @param state the state value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureAsn property: The Azure ASN.
     * 
     * @return the azureAsn value.
     */
    public Integer azureAsn() {
        return this.azureAsn;
    }

    /**
     * Set the azureAsn property: The Azure ASN.
     * 
     * @param azureAsn the azureAsn value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withAzureAsn(Integer azureAsn) {
        this.azureAsn = azureAsn;
        return this;
    }

    /**
     * Get the peerAsn property: The peer ASN.
     * 
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: The peer ASN.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the primaryPeerAddressPrefix property: The primary address prefix.
     * 
     * @return the primaryPeerAddressPrefix value.
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix property: The primary address prefix.
     * 
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to
     * set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix property: The secondary address
     * prefix.
     * 
     * @return the secondaryPeerAddressPrefix value.
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix property: The secondary address
     * prefix.
     * 
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value
     * to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primaryAzurePort property: The primary port.
     * 
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Set the primaryAzurePort property: The primary port.
     * 
     * @param primaryAzurePort the primaryAzurePort value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withPrimaryAzurePort(String primaryAzurePort) {
        this.primaryAzurePort = primaryAzurePort;
        return this;
    }

    /**
     * Get the secondaryAzurePort property: The secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Set the secondaryAzurePort property: The secondary port.
     * 
     * @param secondaryAzurePort the secondaryAzurePort value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withSecondaryAzurePort(String secondaryAzurePort) {
        this.secondaryAzurePort = secondaryAzurePort;
        return this;
    }

    /**
     * Get the sharedKey property: The shared key.
     * 
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The shared key.
     * 
     * @param sharedKey the sharedKey value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the vlanId property: The VLAN ID.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: The VLAN ID.
     * 
     * @param vlanId the vlanId value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the microsoftPeeringConfig property: The Microsoft peering
     * configuration.
     * 
     * @return the microsoftPeeringConfig value.
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig property: The Microsoft peering
     * configuration.
     * 
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the stats property: Gets peering stats.
     * 
     * @return the stats value.
     */
    public ExpressRouteCircuitStatsInner stats() {
        return this.stats;
    }

    /**
     * Set the stats property: Gets peering stats.
     * 
     * @param stats the stats value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withStats(ExpressRouteCircuitStatsInner stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the lastModifiedBy property: Gets whether the provider or the
     * customer last modified the peering.
     * 
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: Gets whether the provider or the
     * customer last modified the peering.
     * 
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the routeFilter property: The reference of the RouteFilter resource.
     * 
     * @return the routeFilter value.
     */
    public RouteFilterInner routeFilter() {
        return this.routeFilter;
    }

    /**
     * Set the routeFilter property: The reference of the RouteFilter resource.
     * 
     * @param routeFilter the routeFilter value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withRouteFilter(RouteFilterInner routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }

    /**
     * Get the ipv6PeeringConfig property: The IPv6 peering configuration.
     * 
     * @return the ipv6PeeringConfig value.
     */
    public Ipv6ExpressRouteCircuitPeeringConfigInner ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the ipv6PeeringConfig property: The IPv6 peering configuration.
     * 
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfigInner ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Get the expressRouteConnection property: The ExpressRoute connection.
     * 
     * @return the expressRouteConnection value.
     */
    public ExpressRouteConnectionId expressRouteConnection() {
        return this.expressRouteConnection;
    }

    /**
     * Set the expressRouteConnection property: The ExpressRoute connection.
     * 
     * @param expressRouteConnection the expressRouteConnection value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection) {
        this.expressRouteConnection = expressRouteConnection;
        return this;
    }

    /**
     * Get the connections property: The list of circuit connections associated
     * with Azure Private Peering for this circuit.
     * 
     * @return the connections value.
     */
    public List<ExpressRouteCircuitConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections property: The list of circuit connections associated
     * with Azure Private Peering for this circuit.
     * 
     * @param connections the connections value to set.
     * @return the ExpressRouteCircuitPeeringPropertiesFormatInner object
     * itself.
     */
    public ExpressRouteCircuitPeeringPropertiesFormatInner withConnections(List<ExpressRouteCircuitConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (microsoftPeeringConfig() != null) {
            microsoftPeeringConfig().validate();
        }
        if (stats() != null) {
            stats().validate();
        }
        if (routeFilter() != null) {
            routeFilter().validate();
        }
        if (ipv6PeeringConfig() != null) {
            ipv6PeeringConfig().validate();
        }
        if (expressRouteConnection() != null) {
            expressRouteConnection().validate();
        }
        if (connections() != null) {
            connections().forEach(e -> e.validate());
        }
    }
}
