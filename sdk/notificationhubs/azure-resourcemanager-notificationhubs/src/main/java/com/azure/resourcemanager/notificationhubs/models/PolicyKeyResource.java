// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Namespace / NotificationHub Regenerate Keys request.
 */
@Fluent
public final class PolicyKeyResource {
    /*
     * Type of Shared Access Policy Key (primary or secondary).
     */
    @JsonProperty(value = "policyKey", required = true)
    private PolicyKeyType policyKey;

    /**
     * Creates an instance of PolicyKeyResource class.
     */
    public PolicyKeyResource() {
    }

    /**
     * Get the policyKey property: Type of Shared Access Policy Key (primary or secondary).
     * 
     * @return the policyKey value.
     */
    public PolicyKeyType policyKey() {
        return this.policyKey;
    }

    /**
     * Set the policyKey property: Type of Shared Access Policy Key (primary or secondary).
     * 
     * @param policyKey the policyKey value to set.
     * @return the PolicyKeyResource object itself.
     */
    public PolicyKeyResource withPolicyKey(PolicyKeyType policyKey) {
        this.policyKey = policyKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyKey() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property policyKey in model PolicyKeyResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyKeyResource.class);
}
