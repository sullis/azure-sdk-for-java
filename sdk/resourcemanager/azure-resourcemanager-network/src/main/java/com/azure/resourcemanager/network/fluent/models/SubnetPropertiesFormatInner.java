// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.Delegation;
import com.azure.resourcemanager.network.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.models.ServiceEndpointPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the subnet.
 */
@Fluent
public final class SubnetPropertiesFormatInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SubnetPropertiesFormatInner.class);

    /*
     * The address prefix for the subnet.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * List of  address prefixes for the subnet.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /*
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /*
     * The reference of the RouteTable resource.
     */
    @JsonProperty(value = "routeTable")
    private RouteTableInner routeTable;

    /*
     * An array of service endpoints.
     */
    @JsonProperty(value = "serviceEndpoints")
    private List<ServiceEndpointPropertiesFormat> serviceEndpoints;

    /*
     * An array of service endpoint policies.
     */
    @JsonProperty(value = "serviceEndpointPolicies")
    private List<ServiceEndpointPolicyInner> serviceEndpointPolicies;

    /*
     * An array of references to interface endpoints
     */
    @JsonProperty(value = "interfaceEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<InterfaceEndpointInner> interfaceEndpoints;

    /*
     * Gets an array of references to the network interface IP configurations
     * using subnet.
     */
    @JsonProperty(value = "ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IpConfigurationInner> ipConfigurations;

    /*
     * Array of IP configuration profiles which reference this subnet.
     */
    @JsonProperty(value = "ipConfigurationProfiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<IpConfigurationProfileInner> ipConfigurationProfiles;

    /*
     * Gets an array of references to the external resources using subnet.
     */
    @JsonProperty(value = "resourceNavigationLinks")
    private List<ResourceNavigationLink> resourceNavigationLinks;

    /*
     * Gets an array of references to services injecting into this subnet.
     */
    @JsonProperty(value = "serviceAssociationLinks")
    private List<ServiceAssociationLink> serviceAssociationLinks;

    /*
     * Gets an array of references to the delegations on the subnet.
     */
    @JsonProperty(value = "delegations")
    private List<Delegation> delegations;

    /*
     * A read-only string identifying the intention of use for this subnet
     * based on delegations and other user-defined properties.
     */
    @JsonProperty(value = "purpose", access = JsonProperty.Access.WRITE_ONLY)
    private String purpose;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the addressPrefix property: The address prefix for the subnet.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: The address prefix for the subnet.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the addressPrefixes property: List of  address prefixes for the
     * subnet.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of  address prefixes for the
     * subnet.
     * 
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The reference of the
     * NetworkSecurityGroup resource.
     * 
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The reference of the
     * NetworkSecurityGroup resource.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the routeTable property: The reference of the RouteTable resource.
     * 
     * @return the routeTable value.
     */
    public RouteTableInner routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable property: The reference of the RouteTable resource.
     * 
     * @param routeTable the routeTable value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withRouteTable(RouteTableInner routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the serviceEndpoints property: An array of service endpoints.
     * 
     * @return the serviceEndpoints value.
     */
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set the serviceEndpoints property: An array of service endpoints.
     * 
     * @param serviceEndpoints the serviceEndpoints value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

    /**
     * Get the serviceEndpointPolicies property: An array of service endpoint
     * policies.
     * 
     * @return the serviceEndpointPolicies value.
     */
    public List<ServiceEndpointPolicyInner> serviceEndpointPolicies() {
        return this.serviceEndpointPolicies;
    }

    /**
     * Set the serviceEndpointPolicies property: An array of service endpoint
     * policies.
     * 
     * @param serviceEndpointPolicies the serviceEndpointPolicies value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies) {
        this.serviceEndpointPolicies = serviceEndpointPolicies;
        return this;
    }

    /**
     * Get the interfaceEndpoints property: An array of references to interface
     * endpoints.
     * 
     * @return the interfaceEndpoints value.
     */
    public List<InterfaceEndpointInner> interfaceEndpoints() {
        return this.interfaceEndpoints;
    }

    /**
     * Get the ipConfigurations property: Gets an array of references to the
     * network interface IP configurations using subnet.
     * 
     * @return the ipConfigurations value.
     */
    public List<IpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the ipConfigurationProfiles property: Array of IP configuration
     * profiles which reference this subnet.
     * 
     * @return the ipConfigurationProfiles value.
     */
    public List<IpConfigurationProfileInner> ipConfigurationProfiles() {
        return this.ipConfigurationProfiles;
    }

    /**
     * Get the resourceNavigationLinks property: Gets an array of references to
     * the external resources using subnet.
     * 
     * @return the resourceNavigationLinks value.
     */
    public List<ResourceNavigationLink> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * Set the resourceNavigationLinks property: Gets an array of references to
     * the external resources using subnet.
     * 
     * @param resourceNavigationLinks the resourceNavigationLinks value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withResourceNavigationLinks(List<ResourceNavigationLink> resourceNavigationLinks) {
        this.resourceNavigationLinks = resourceNavigationLinks;
        return this;
    }

    /**
     * Get the serviceAssociationLinks property: Gets an array of references to
     * services injecting into this subnet.
     * 
     * @return the serviceAssociationLinks value.
     */
    public List<ServiceAssociationLink> serviceAssociationLinks() {
        return this.serviceAssociationLinks;
    }

    /**
     * Set the serviceAssociationLinks property: Gets an array of references to
     * services injecting into this subnet.
     * 
     * @param serviceAssociationLinks the serviceAssociationLinks value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withServiceAssociationLinks(List<ServiceAssociationLink> serviceAssociationLinks) {
        this.serviceAssociationLinks = serviceAssociationLinks;
        return this;
    }

    /**
     * Get the delegations property: Gets an array of references to the
     * delegations on the subnet.
     * 
     * @return the delegations value.
     */
    public List<Delegation> delegations() {
        return this.delegations;
    }

    /**
     * Set the delegations property: Gets an array of references to the
     * delegations on the subnet.
     * 
     * @param delegations the delegations value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withDelegations(List<Delegation> delegations) {
        this.delegations = delegations;
        return this;
    }

    /**
     * Get the purpose property: A read-only string identifying the intention
     * of use for this subnet based on delegations and other user-defined
     * properties.
     * 
     * @return the purpose value.
     */
    public String purpose() {
        return this.purpose;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SubnetPropertiesFormatInner object itself.
     */
    public SubnetPropertiesFormatInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSecurityGroup() != null) {
            networkSecurityGroup().validate();
        }
        if (routeTable() != null) {
            routeTable().validate();
        }
        if (serviceEndpoints() != null) {
            serviceEndpoints().forEach(e -> e.validate());
        }
        if (serviceEndpointPolicies() != null) {
            serviceEndpointPolicies().forEach(e -> e.validate());
        }
        if (interfaceEndpoints() != null) {
            interfaceEndpoints().forEach(e -> e.validate());
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (ipConfigurationProfiles() != null) {
            ipConfigurationProfiles().forEach(e -> e.validate());
        }
        if (resourceNavigationLinks() != null) {
            resourceNavigationLinks().forEach(e -> e.validate());
        }
        if (serviceAssociationLinks() != null) {
            serviceAssociationLinks().forEach(e -> e.validate());
        }
        if (delegations() != null) {
            delegations().forEach(e -> e.validate());
        }
    }
}
