// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Properties to control reconnect requests. */
@Fluent
public final class BackendReconnectProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendReconnectProperties.class);

    /*
     * Duration in ISO8601 format after which reconnect will be initiated.
     * Minimum duration of the Reconnect is PT2M.
     */
    @JsonProperty(value = "after")
    private Duration after;

    /**
     * Get the after property: Duration in ISO8601 format after which reconnect will be initiated. Minimum duration of
     * the Reconnect is PT2M.
     *
     * @return the after value.
     */
    public Duration after() {
        return this.after;
    }

    /**
     * Set the after property: Duration in ISO8601 format after which reconnect will be initiated. Minimum duration of
     * the Reconnect is PT2M.
     *
     * @param after the after value to set.
     * @return the BackendReconnectProperties object itself.
     */
    public BackendReconnectProperties withAfter(Duration after) {
        this.after = after;
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
