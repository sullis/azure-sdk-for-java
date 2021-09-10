// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.PacketCaptureResultInner;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of packet capture sessions.
 */
@Fluent
public final class PacketCaptureListResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PacketCaptureListResult.class);

    /*
     * Information about packet capture sessions.
     */
    @JsonProperty(value = "value")
    private List<PacketCaptureResultInner> value;

    /**
     * Get the value property: Information about packet capture sessions.
     * 
     * @return the value value.
     */
    public List<PacketCaptureResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about packet capture sessions.
     * 
     * @param value the value value to set.
     * @return the PacketCaptureListResult object itself.
     */
    public PacketCaptureListResult withValue(List<PacketCaptureResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
