// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * NetworkSecurityGroup resource.
 */
@Fluent
public final class NetworkSecurityGroupInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkSecurityGroupInner.class);

    /*
     * Properties of the network security group
     */
    @JsonProperty(value = "properties")
    private NetworkSecurityGroupPropertiesFormat innerProperties;

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
     * Get the innerProperties property: Properties of the network security
     * group.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityGroupPropertiesFormat innerProperties() {
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
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withEtag(String etag) {
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
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkSecurityGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkSecurityGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the securityRules property: A collection of security rules of the
     * network security group.
     * 
     * @return the securityRules value.
     */
    public List<SecurityRuleInner> securityRules() {
        return this.innerProperties() == null ? null : this.innerProperties().securityRules();
    }

    /**
     * Set the securityRules property: A collection of security rules of the
     * network security group.
     * 
     * @param securityRules the securityRules value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withSecurityRules(List<SecurityRuleInner> securityRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityGroupPropertiesFormat();
        }
        this.innerProperties().withSecurityRules(securityRules);
        return this;
    }

    /**
     * Get the defaultSecurityRules property: The default security rules of
     * network security group.
     * 
     * @return the defaultSecurityRules value.
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultSecurityRules();
    }

    /**
     * Set the defaultSecurityRules property: The default security rules of
     * network security group.
     * 
     * @param defaultSecurityRules the defaultSecurityRules value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityGroupPropertiesFormat();
        }
        this.innerProperties().withDefaultSecurityRules(defaultSecurityRules);
        return this;
    }

    /**
     * Get the networkInterfaces property: A collection of references to
     * network interfaces.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaces();
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     * 
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().subnets();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network
     * security group resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the network
     * security group resource.
     * 
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withResourceGuid(String resourceGuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityGroupPropertiesFormat();
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
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityGroupPropertiesFormat();
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
