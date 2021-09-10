// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSL certificates of an application gateway.
 */
@Fluent
public final class ApplicationGatewaySslCertificateInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslCertificateInner.class);

    /*
     * Properties of SSL certificates of an application gateway.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewaySslCertificatePropertiesFormat innerProperties;

    /*
     * Name of the SSL certificate that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the innerProperties property: Properties of SSL certificates of an
     * application gateway.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewaySslCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the SSL certificate that is unique within
     * an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SSL certificate that is unique within
     * an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withName(String name) {
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
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewaySslCertificateInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the data property: Base-64 encoded pfx certificate. Only applicable
     * in PUT Request.
     * 
     * @return the data value.
     */
    public String data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Base-64 encoded pfx certificate. Only applicable
     * in PUT Request.
     * 
     * @param data the data value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withData(String data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslCertificatePropertiesFormat();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the password property: Password for the pfx file specified in data.
     * Only applicable in PUT request.
     * 
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: Password for the pfx file specified in data.
     * Only applicable in PUT request.
     * 
     * @param password the password value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslCertificatePropertiesFormat();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the publicCertData property: Base-64 encoded Public cert data
     * corresponding to pfx specified in data. Only applicable in GET request.
     * 
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.innerProperties() == null ? null : this.innerProperties().publicCertData();
    }

    /**
     * Set the publicCertData property: Base-64 encoded Public cert data
     * corresponding to pfx specified in data. Only applicable in GET request.
     * 
     * @param publicCertData the publicCertData value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withPublicCertData(String publicCertData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslCertificatePropertiesFormat();
        }
        this.innerProperties().withPublicCertData(publicCertData);
        return this;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded
     * unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     * @return the keyVaultSecretId value.
     */
    public String keyVaultSecretId() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultSecretId();
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded
     * unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withKeyVaultSecretId(String keyVaultSecretId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslCertificatePropertiesFormat();
        }
        this.innerProperties().withKeyVaultSecretId(keyVaultSecretId);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the SSL
     * certificate resource Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the SSL
     * certificate resource Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewaySslCertificatePropertiesFormat();
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
