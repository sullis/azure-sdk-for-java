// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to represent shoebox log specification in json client discovery. */
@Fluent
public final class ClientDiscoveryForLogSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClientDiscoveryForLogSpecification.class);

    /*
     * Name for shoebox log specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * blob duration of shoebox log specification
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the name property: Name for shoebox log specification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for shoebox log specification.
     *
     * @param name the name value to set.
     * @return the ClientDiscoveryForLogSpecification object itself.
     */
    public ClientDiscoveryForLogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized display name.
     *
     * @param displayName the displayName value to set.
     * @return the ClientDiscoveryForLogSpecification object itself.
     */
    public ClientDiscoveryForLogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: blob duration of shoebox log specification.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: blob duration of shoebox log specification.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the ClientDiscoveryForLogSpecification object itself.
     */
    public ClientDiscoveryForLogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
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
