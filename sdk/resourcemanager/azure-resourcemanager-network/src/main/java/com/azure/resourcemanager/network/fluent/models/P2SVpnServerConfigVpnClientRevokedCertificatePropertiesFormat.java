// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the revoked VPN client certificate of
 * P2SVpnServerConfiguration.
 */
@Fluent
public final class P2SVpnServerConfigVpnClientRevokedCertificatePropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(P2SVpnServerConfigVpnClientRevokedCertificatePropertiesFormat.class);

    /*
     * The revoked VPN client certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The provisioning state of the VPN client revoked certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the thumbprint property: The revoked VPN client certificate
     * thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate
     * thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the
     * P2SVpnServerConfigVpnClientRevokedCertificatePropertiesFormat object
     * itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificatePropertiesFormat withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN
     * client revoked certificate resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
