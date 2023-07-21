// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of NFS share endpoint. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("NfsMount")
@Fluent
public final class NfsMountEndpointProperties extends EndpointBaseProperties {
    /*
     * The host name or IP address of the server exporting the file system.
     */
    @JsonProperty(value = "host", required = true)
    private String host;

    /*
     * The NFS protocol version.
     */
    @JsonProperty(value = "nfsVersion")
    private NfsVersion nfsVersion;

    /*
     * The directory being exported from the server.
     */
    @JsonProperty(value = "export", required = true)
    private String export;

    /** Creates an instance of NfsMountEndpointProperties class. */
    public NfsMountEndpointProperties() {
    }

    /**
     * Get the host property: The host name or IP address of the server exporting the file system.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: The host name or IP address of the server exporting the file system.
     *
     * @param host the host value to set.
     * @return the NfsMountEndpointProperties object itself.
     */
    public NfsMountEndpointProperties withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the nfsVersion property: The NFS protocol version.
     *
     * @return the nfsVersion value.
     */
    public NfsVersion nfsVersion() {
        return this.nfsVersion;
    }

    /**
     * Set the nfsVersion property: The NFS protocol version.
     *
     * @param nfsVersion the nfsVersion value to set.
     * @return the NfsMountEndpointProperties object itself.
     */
    public NfsMountEndpointProperties withNfsVersion(NfsVersion nfsVersion) {
        this.nfsVersion = nfsVersion;
        return this;
    }

    /**
     * Get the export property: The directory being exported from the server.
     *
     * @return the export value.
     */
    public String export() {
        return this.export;
    }

    /**
     * Set the export property: The directory being exported from the server.
     *
     * @param export the export value to set.
     * @return the NfsMountEndpointProperties object itself.
     */
    public NfsMountEndpointProperties withExport(String export) {
        this.export = export;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NfsMountEndpointProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property host in model NfsMountEndpointProperties"));
        }
        if (export() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property export in model NfsMountEndpointProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NfsMountEndpointProperties.class);
}
