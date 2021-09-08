// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP configuration profile child resource. */
@Fluent
public final class IpConfigurationProfileInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationProfileInner.class);

    /*
     * Properties of the IP configuration profile.
     */
    @JsonProperty(value = "properties")
    private IpConfigurationProfilePropertiesFormatInner innerProperties;

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the IP configuration profile.
     *
     * @return the innerProperties value.
     */
    private IpConfigurationProfilePropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfigurationProfileInner object itself.
     */
    public IpConfigurationProfileInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public IpConfigurationProfileInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationProfileInner object itself.
     */
    public IpConfigurationProfileInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationProfilePropertiesFormatInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the IP configuration profile resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
