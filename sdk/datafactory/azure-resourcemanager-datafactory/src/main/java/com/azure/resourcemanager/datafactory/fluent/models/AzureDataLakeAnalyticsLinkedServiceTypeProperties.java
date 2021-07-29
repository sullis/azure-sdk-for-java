// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Data Lake Analytics linked service properties. */
@Fluent
public final class AzureDataLakeAnalyticsLinkedServiceTypeProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureDataLakeAnalyticsLinkedServiceTypeProperties.class);

    /*
     * The Azure Data Lake Analytics account name. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "accountName", required = true)
    private Object accountName;

    /*
     * The ID of the application used to authenticate against the Azure Data
     * Lake Analytics account. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data
     * Lake Analytics account.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tenant", required = true)
    private Object tenant;

    /*
     * Data Lake Analytics account subscription ID (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "subscriptionId")
    private Object subscriptionId;

    /*
     * Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "resourceGroupName")
    private Object resourceGroupName;

    /*
     * Azure Data Lake Analytics URI Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "dataLakeAnalyticsUri")
    private Object dataLakeAnalyticsUri;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     *
     * @return the accountName value.
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     *
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     *
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     *
     * @return the dataLakeAnalyticsUri value.
     */
    public Object dataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri;
    }

    /**
     * Set the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     *
     * @param dataLakeAnalyticsUri the dataLakeAnalyticsUri value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withDataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountName in model"
                            + " AzureDataLakeAnalyticsLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (tenant() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenant in model AzureDataLakeAnalyticsLinkedServiceTypeProperties"));
        }
    }
}
