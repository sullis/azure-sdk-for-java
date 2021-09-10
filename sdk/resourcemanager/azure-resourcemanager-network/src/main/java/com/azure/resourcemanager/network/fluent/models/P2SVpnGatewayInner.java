// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * P2SVpnGateway Resource.
 */
@Fluent
public final class P2SVpnGatewayInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(P2SVpnGatewayInner.class);

    /*
     * Parameters for P2SVpnGateway
     */
    @JsonProperty(value = "properties")
    private P2SVpnGatewayProperties innerProperties;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Parameters for P2SVpnGateway.
     * 
     * @return the innerProperties value.
     */
    private P2SVpnGatewayProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes
     * whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public P2SVpnGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public P2SVpnGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway
     * belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway
     * belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVirtualHub(virtualHub);
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
     * Set the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn
     * gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGatewayScaleUnit();
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn
     * gateway.
     * 
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    /**
     * Get the p2SVpnServerConfiguration property: The
     * P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     * @return the p2SVpnServerConfiguration value.
     */
    public SubResource p2SVpnServerConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().p2SVpnServerConfiguration();
    }

    /**
     * Set the p2SVpnServerConfiguration property: The
     * P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     * @param p2SVpnServerConfiguration the p2SVpnServerConfiguration value to
     * set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withP2SVpnServerConfiguration(SubResource p2SVpnServerConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withP2SVpnServerConfiguration(p2SVpnServerConfiguration);
        return this;
    }

    /**
     * Get the vpnClientAddressPool property: The reference of the address
     * space resource which represents Address space for P2S VpnClient.
     * 
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientAddressPool();
    }

    /**
     * Set the vpnClientAddressPool property: The reference of the address
     * space resource which represents Address space for P2S VpnClient.
     * 
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVpnClientAddressPool(vpnClientAddressPool);
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients'
     * connection health status.
     * 
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientConnectionHealth();
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
