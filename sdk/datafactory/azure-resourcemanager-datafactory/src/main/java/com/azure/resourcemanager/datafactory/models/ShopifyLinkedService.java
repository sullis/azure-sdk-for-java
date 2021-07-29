// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ShopifyLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Shopify Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Shopify")
@Fluent
public final class ShopifyLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShopifyLinkedService.class);

    /*
     * Shopify Service linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ShopifyLinkedServiceTypeProperties innerTypeProperties = new ShopifyLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Shopify Service linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private ShopifyLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ShopifyLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ShopifyLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ShopifyLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ShopifyLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     *
     * @param host the host value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     *
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessToken();
    }

    /**
     * Set the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     *
     * @param accessToken the accessToken value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withAccessToken(SecretBase accessToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessToken(accessToken);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
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
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ShopifyLinkedServiceTypeProperties();
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
                        "Missing required property innerTypeProperties in model ShopifyLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
