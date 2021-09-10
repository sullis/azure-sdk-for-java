// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ServiceDelegationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details the service to which the subnet is delegated.
 */
@Fluent
public final class Delegation extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(Delegation.class);

    /*
     * Properties of the subnet.
     */
    @JsonProperty(value = "properties")
    private ServiceDelegationPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a subnet. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of the subnet.
     * 
     * @return the innerProperties value.
     */
    private ServiceDelegationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a
     * subnet. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a
     * subnet. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the Delegation object itself.
     */
    public Delegation withName(String name) {
        this.name = name;
        return this;
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
     * @return the Delegation object itself.
     */
    public Delegation withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Delegation withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the serviceName property: The name of the service to whom the subnet
     * should be delegated (e.g. Microsoft.Sql/servers).
     * 
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceName();
    }

    /**
     * Set the serviceName property: The name of the service to whom the subnet
     * should be delegated (e.g. Microsoft.Sql/servers).
     * 
     * @param serviceName the serviceName value to set.
     * @return the Delegation object itself.
     */
    public Delegation withServiceName(String serviceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceDelegationPropertiesFormat();
        }
        this.innerProperties().withServiceName(serviceName);
        return this;
    }

    /**
     * Get the actions property: Describes the actions permitted to the service
     * upon delegation.
     * 
     * @return the actions value.
     */
    public List<String> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: Describes the actions permitted to the service
     * upon delegation.
     * 
     * @param actions the actions value to set.
     * @return the Delegation object itself.
     */
    public Delegation withActions(List<String> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceDelegationPropertiesFormat();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
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
