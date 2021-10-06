// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the Power State of the cluster.
 */
@Fluent
public final class PowerState {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PowerState.class);

    /*
     * Tells whether the cluster is Running or Stopped
     */
    @JsonProperty(value = "code")
    private Code code;

    /**
     * Get the code property: Tells whether the cluster is Running or Stopped.
     * 
     * @return the code value.
     */
    public Code code() {
        return this.code;
    }

    /**
     * Set the code property: Tells whether the cluster is Running or Stopped.
     * 
     * @param code the code value to set.
     * @return the PowerState object itself.
     */
    public PowerState withCode(Code code) {
        this.code = code;
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
