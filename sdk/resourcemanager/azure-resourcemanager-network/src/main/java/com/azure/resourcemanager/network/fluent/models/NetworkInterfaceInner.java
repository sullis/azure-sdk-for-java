// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.NetworkInterfaceDnsSettings;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * A network interface in a resource group.
 */
@Fluent
public final class NetworkInterfaceInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkInterfaceInner.class);

    /*
     * Properties of the network interface.
     */
    @JsonProperty(value = "properties")
    private NetworkInterfacePropertiesFormatInner innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the network interface.
     * 
     * @return the innerProperties value.
     */
    private NetworkInterfacePropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualMachine property: The reference of a virtual machine.
     * 
     * @return the virtualMachine value.
     */
    public SubResource virtualMachine() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachine();
    }

    /**
     * Get the networkSecurityGroup property: The reference of the
     * NetworkSecurityGroup resource.
     * 
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroup();
    }

    /**
     * Set the networkSecurityGroup property: The reference of the
     * NetworkSecurityGroup resource.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    /**
     * Get the interfaceEndpoint property: A reference to the interface
     * endpoint to which the network interface is linked.
     * 
     * @return the interfaceEndpoint value.
     */
    public InterfaceEndpointInner interfaceEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceEndpoint();
    }

    /**
     * Get the ipConfigurations property: A list of IPConfigurations of the
     * network interface.
     * 
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: A list of IPConfigurations of the
     * network interface.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withIpConfigurations(List<NetworkInterfaceIpConfigurationInner> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the tapConfigurations property: A list of TapConfigurations of the
     * network interface.
     * 
     * @return the tapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> tapConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().tapConfigurations();
    }

    /**
     * Set the tapConfigurations property: A list of TapConfigurations of the
     * network interface.
     * 
     * @param tapConfigurations the tapConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withTapConfigurations(List<NetworkInterfaceTapConfigurationInner> tapConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withTapConfigurations(tapConfigurations);
        return this;
    }

    /**
     * Get the dnsSettings property: The DNS settings in network interface.
     * 
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The DNS settings in network interface.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     * 
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().macAddress();
    }

    /**
     * Set the macAddress property: The MAC address of the network interface.
     * 
     * @param macAddress the macAddress value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withMacAddress(String macAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withMacAddress(macAddress);
        return this;
    }

    /**
     * Get the primary property: Gets whether this is a primary network
     * interface on a virtual machine.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Gets whether this is a primary network
     * interface on a virtual machine.
     * 
     * @param primary the primary value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: If the network interface
     * is accelerated networking enabled.
     * 
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAcceleratedNetworking();
    }

    /**
     * Set the enableAcceleratedNetworking property: If the network interface
     * is accelerated networking enabled.
     * 
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value
     * to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    /**
     * Get the enableIpForwarding property: Indicates whether IP forwarding is
     * enabled on this network interface.
     * 
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpForwarding();
    }

    /**
     * Set the enableIpForwarding property: Indicates whether IP forwarding is
     * enabled on this network interface.
     * 
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableIpForwarding(Boolean enableIpForwarding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withEnableIpForwarding(enableIpForwarding);
        return this;
    }

    /**
     * Get the hostedWorkloads property: A list of references to linked
     * BareMetal resources.
     * 
     * @return the hostedWorkloads value.
     */
    public List<String> hostedWorkloads() {
        return this.innerProperties() == null ? null : this.innerProperties().hostedWorkloads();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network
     * interface resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the network
     * interface resource.
     * 
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withResourceGuid(String resourceGuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withResourceGuid(resourceGuid);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public
     * IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the public
     * IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withProvisioningState(provisioningState);
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
    }
}
