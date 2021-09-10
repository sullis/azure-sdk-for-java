// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Backend address of an application gateway.
 */
@Fluent
public final class ApplicationGatewayBackendAddress {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendAddress.class);

    /*
     * Fully qualified domain name (FQDN).
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * IP address
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * Get the fqdn property: Fully qualified domain name (FQDN).
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fully qualified domain name (FQDN).
     * 
     * @param fqdn the fqdn value to set.
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the ipAddress property: IP address.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP address.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
