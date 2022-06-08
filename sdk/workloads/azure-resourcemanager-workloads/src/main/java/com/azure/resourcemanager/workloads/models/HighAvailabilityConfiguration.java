// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gets or sets the high availability configuration. */
@Fluent
public final class HighAvailabilityConfiguration {
    /*
     * The high availability type.
     */
    @JsonProperty(value = "highAvailabilityType", required = true)
    private SapHighAvailabilityType highAvailabilityType;

    /**
     * Get the highAvailabilityType property: The high availability type.
     *
     * @return the highAvailabilityType value.
     */
    public SapHighAvailabilityType highAvailabilityType() {
        return this.highAvailabilityType;
    }

    /**
     * Set the highAvailabilityType property: The high availability type.
     *
     * @param highAvailabilityType the highAvailabilityType value to set.
     * @return the HighAvailabilityConfiguration object itself.
     */
    public HighAvailabilityConfiguration withHighAvailabilityType(SapHighAvailabilityType highAvailabilityType) {
        this.highAvailabilityType = highAvailabilityType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (highAvailabilityType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property highAvailabilityType in model HighAvailabilityConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HighAvailabilityConfiguration.class);
}