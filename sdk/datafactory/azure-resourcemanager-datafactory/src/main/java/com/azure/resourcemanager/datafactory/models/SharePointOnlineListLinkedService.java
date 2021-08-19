// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SharePointOnlineListLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SharePoint Online List linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SharePointOnlineList")
@Fluent
public final class SharePointOnlineListLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharePointOnlineListLinkedService.class);

    /*
     * SharePoint Online List linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SharePointOnlineListLinkedServiceTypeProperties innerTypeProperties =
        new SharePointOnlineListLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: SharePoint Online List linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private SharePointOnlineListLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the siteUrl property: The URL of the SharePoint Online site. For example,
     * https://contoso.sharepoint.com/sites/siteName. Type: string (or Expression with resultType string).
     *
     * @return the siteUrl value.
     */
    public Object siteUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().siteUrl();
    }

    /**
     * Set the siteUrl property: The URL of the SharePoint Online site. For example,
     * https://contoso.sharepoint.com/sites/siteName. Type: string (or Expression with resultType string).
     *
     * @param siteUrl the siteUrl value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService withSiteUrl(Object siteUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSiteUrl(siteUrl);
        return this;
    }

    /**
     * Get the tenantId property: The tenant ID under which your application resides. You can find it from Azure portal
     * Active Directory overview page. Type: string (or Expression with resultType string).
     *
     * @return the tenantId value.
     */
    public Object tenantId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenant ID under which your application resides. You can find it from Azure portal
     * Active Directory overview page. Type: string (or Expression with resultType string).
     *
     * @param tenantId the tenantId value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService withTenantId(Object tenantId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The application (client) ID of your application registered in Azure Active
     * Directory. Make sure to grant SharePoint site permission to this application. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The application (client) ID of your application registered in Azure Active
     * Directory. Make sure to grant SharePoint site permission to this application. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The client secret of your application registered in Azure Active Directory.
     * Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The client secret of your application registered in Azure Active Directory.
     * Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SharePointOnlineListLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
