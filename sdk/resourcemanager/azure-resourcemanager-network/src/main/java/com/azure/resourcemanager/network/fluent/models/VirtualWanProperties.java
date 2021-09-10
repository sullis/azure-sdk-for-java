// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.OfficeTrafficCategory;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for VirtualWAN.
 */
@Fluent
public final class VirtualWanProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualWanProperties.class);

    /*
     * Vpn encryption to be disabled or not.
     */
    @JsonProperty(value = "disableVpnEncryption")
    private Boolean disableVpnEncryption;

    /*
     * List of VirtualHubs in the VirtualWAN.
     */
    @JsonProperty(value = "virtualHubs", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualHubs;

    /*
     * The vpnSites property.
     */
    @JsonProperty(value = "vpnSites", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> vpnSites;

    /*
     * The Security Provider name.
     */
    @JsonProperty(value = "securityProviderName")
    private String securityProviderName;

    /*
     * True if branch to branch traffic is allowed.
     */
    @JsonProperty(value = "allowBranchToBranchTraffic")
    private Boolean allowBranchToBranchTraffic;

    /*
     * True if Vnet to Vnet traffic is allowed.
     */
    @JsonProperty(value = "allowVnetToVnetTraffic")
    private Boolean allowVnetToVnetTraffic;

    /*
     * The office local breakout category.
     */
    @JsonProperty(value = "office365LocalBreakoutCategory", access = JsonProperty.Access.WRITE_ONLY)
    private OfficeTrafficCategory office365LocalBreakoutCategory;

    /*
     * list of all P2SVpnServerConfigurations associated with the virtual wan.
     */
    @JsonProperty(value = "p2SVpnServerConfigurations")
    private List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the disableVpnEncryption property: Vpn encryption to be disabled or
     * not.
     * 
     * @return the disableVpnEncryption value.
     */
    public Boolean disableVpnEncryption() {
        return this.disableVpnEncryption;
    }

    /**
     * Set the disableVpnEncryption property: Vpn encryption to be disabled or
     * not.
     * 
     * @param disableVpnEncryption the disableVpnEncryption value to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withDisableVpnEncryption(Boolean disableVpnEncryption) {
        this.disableVpnEncryption = disableVpnEncryption;
        return this;
    }

    /**
     * Get the virtualHubs property: List of VirtualHubs in the VirtualWAN.
     * 
     * @return the virtualHubs value.
     */
    public List<SubResource> virtualHubs() {
        return this.virtualHubs;
    }

    /**
     * Get the vpnSites property: The vpnSites property.
     * 
     * @return the vpnSites value.
     */
    public List<SubResource> vpnSites() {
        return this.vpnSites;
    }

    /**
     * Get the securityProviderName property: The Security Provider name.
     * 
     * @return the securityProviderName value.
     */
    public String securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * Set the securityProviderName property: The Security Provider name.
     * 
     * @param securityProviderName the securityProviderName value to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withSecurityProviderName(String securityProviderName) {
        this.securityProviderName = securityProviderName;
        return this;
    }

    /**
     * Get the allowBranchToBranchTraffic property: True if branch to branch
     * traffic is allowed.
     * 
     * @return the allowBranchToBranchTraffic value.
     */
    public Boolean allowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }

    /**
     * Set the allowBranchToBranchTraffic property: True if branch to branch
     * traffic is allowed.
     * 
     * @param allowBranchToBranchTraffic the allowBranchToBranchTraffic value
     * to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        return this;
    }

    /**
     * Get the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is
     * allowed.
     * 
     * @return the allowVnetToVnetTraffic value.
     */
    public Boolean allowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic;
    }

    /**
     * Set the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is
     * allowed.
     * 
     * @param allowVnetToVnetTraffic the allowVnetToVnetTraffic value to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic) {
        this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
        return this;
    }

    /**
     * Get the office365LocalBreakoutCategory property: The office local
     * breakout category.
     * 
     * @return the office365LocalBreakoutCategory value.
     */
    public OfficeTrafficCategory office365LocalBreakoutCategory() {
        return this.office365LocalBreakoutCategory;
    }

    /**
     * Get the p2SVpnServerConfigurations property: list of all
     * P2SVpnServerConfigurations associated with the virtual wan.
     * 
     * @return the p2SVpnServerConfigurations value.
     */
    public List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations() {
        return this.p2SVpnServerConfigurations;
    }

    /**
     * Set the p2SVpnServerConfigurations property: list of all
     * P2SVpnServerConfigurations associated with the virtual wan.
     * 
     * @param p2SVpnServerConfigurations the p2SVpnServerConfigurations value
     * to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withP2SVpnServerConfigurations(List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations) {
        this.p2SVpnServerConfigurations = p2SVpnServerConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the VirtualWanProperties object itself.
     */
    public VirtualWanProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p2SVpnServerConfigurations() != null) {
            p2SVpnServerConfigurations().forEach(e -> e.validate());
        }
    }
}
