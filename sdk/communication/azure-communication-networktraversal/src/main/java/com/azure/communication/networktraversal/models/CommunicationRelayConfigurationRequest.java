// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.networktraversal.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request for a CommunicationRelayConfiguration. */
@Fluent
public final class CommunicationRelayConfigurationRequest {
    /*
     * An existing ACS identity.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: An existing ACS identity.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: An existing ACS identity.
     *
     * @param id the id value to set.
     * @return the CommunicationRelayConfigurationRequest object itself.
     */
    public CommunicationRelayConfigurationRequest setId(String id) {
        this.id = id;
        return this;
    }
}
