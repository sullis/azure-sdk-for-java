// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.purview.models.ScopeType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Payload to get and set the default account in the given scope. */
@Fluent
public final class DefaultAccountPayloadInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DefaultAccountPayloadInner.class);

    /*
     * The name of the account that is set as the default.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * The resource group name of the account that is set as the default.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * The scope object ID. For example, sub ID or tenant ID.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The scope tenant in which the default account is set.
     */
    @JsonProperty(value = "scopeTenantId")
    private String scopeTenantId;

    /*
     * The scope where the default account is set.
     */
    @JsonProperty(value = "scopeType")
    private ScopeType scopeType;

    /*
     * The subscription ID of the account that is set as the default.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * Get the accountName property: The name of the account that is set as the default.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The name of the account that is set as the default.
     *
     * @param accountName the accountName value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the resourceGroupName property: The resource group name of the account that is set as the default.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: The resource group name of the account that is set as the default.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the scope property: The scope object ID. For example, sub ID or tenant ID.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope object ID. For example, sub ID or tenant ID.
     *
     * @param scope the scope value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the scopeTenantId property: The scope tenant in which the default account is set.
     *
     * @return the scopeTenantId value.
     */
    public String scopeTenantId() {
        return this.scopeTenantId;
    }

    /**
     * Set the scopeTenantId property: The scope tenant in which the default account is set.
     *
     * @param scopeTenantId the scopeTenantId value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withScopeTenantId(String scopeTenantId) {
        this.scopeTenantId = scopeTenantId;
        return this;
    }

    /**
     * Get the scopeType property: The scope where the default account is set.
     *
     * @return the scopeType value.
     */
    public ScopeType scopeType() {
        return this.scopeType;
    }

    /**
     * Set the scopeType property: The scope where the default account is set.
     *
     * @param scopeType the scopeType value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withScopeType(ScopeType scopeType) {
        this.scopeType = scopeType;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription ID of the account that is set as the default.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription ID of the account that is set as the default.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the DefaultAccountPayloadInner object itself.
     */
    public DefaultAccountPayloadInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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
