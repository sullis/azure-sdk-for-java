// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The json object containing security policy parameters. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = SecurityPolicyParameters.class)
@JsonTypeName("SecurityPolicyParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "WebApplicationFirewall", value = SecurityPolicyWebApplicationFirewallParameters.class)
})
@Immutable
public class SecurityPolicyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityPolicyParameters.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
