// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.AzureFirewallApplicationRuleCollectionPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Application rule collection resource.
 */
@Fluent
public final class AzureFirewallApplicationRuleCollection extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureFirewallApplicationRuleCollection.class);

    /*
     * Properties of the application rule collection.
     */
    @JsonProperty(value = "properties")
    private AzureFirewallApplicationRuleCollectionPropertiesFormat innerProperties;

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the application rule
     * collection.
     * 
     * @return the innerProperties value.
     */
    private AzureFirewallApplicationRuleCollectionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withName(String name) {
        this.name = name;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public AzureFirewallApplicationRuleCollection withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the priority property: Priority of the application rule collection
     * resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of the application rule collection
     * resource.
     * 
     * @param priority the priority value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallApplicationRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     * 
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.innerProperties() == null ? null : this.innerProperties().action();
    }

    /**
     * Set the action property: The action type of a rule collection.
     * 
     * @param action the action value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withAction(AzureFirewallRCAction action) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallApplicationRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withAction(action);
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a application rule
     * collection.
     * 
     * @return the rules value.
     */
    public List<AzureFirewallApplicationRule> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: Collection of rules used by a application rule
     * collection.
     * 
     * @param rules the rules value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withRules(List<AzureFirewallApplicationRule> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallApplicationRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withRules(rules);
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
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallApplicationRuleCollectionPropertiesFormat();
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
