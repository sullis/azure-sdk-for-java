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
 * Vpn Client Parameters for package generation.
 */
@Fluent
public final class P2SVpnProfileParameters {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(P2SVpnProfileParameters.class);

    /*
     * VPN client Authentication Method. Possible values are: 'EAPTLS' and
     * 'EAPMSCHAPv2'.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /**
     * Get the authenticationMethod property: VPN client Authentication Method.
     * Possible values are: 'EAPTLS' and 'EAPMSCHAPv2'.
     * 
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: VPN client Authentication Method.
     * Possible values are: 'EAPTLS' and 'EAPMSCHAPv2'.
     * 
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the P2SVpnProfileParameters object itself.
     */
    public P2SVpnProfileParameters withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
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
