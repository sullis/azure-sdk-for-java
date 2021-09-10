// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage location provided for troubleshoot.
 */
@Fluent
public final class TroubleshootingProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(TroubleshootingProperties.class);

    /*
     * The ID for the storage account to save the troubleshoot result.
     */
    @JsonProperty(value = "storageId", required = true)
    private String storageId;

    /*
     * The path to the blob to save the troubleshoot result in.
     */
    @JsonProperty(value = "storagePath", required = true)
    private String storagePath;

    /**
     * Get the storageId property: The ID for the storage account to save the
     * troubleshoot result.
     * 
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: The ID for the storage account to save the
     * troubleshoot result.
     * 
     * @param storageId the storageId value to set.
     * @return the TroubleshootingProperties object itself.
     */
    public TroubleshootingProperties withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the storagePath property: The path to the blob to save the
     * troubleshoot result in.
     * 
     * @return the storagePath value.
     */
    public String storagePath() {
        return this.storagePath;
    }

    /**
     * Set the storagePath property: The path to the blob to save the
     * troubleshoot result in.
     * 
     * @param storagePath the storagePath value to set.
     * @return the TroubleshootingProperties object itself.
     */
    public TroubleshootingProperties withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageId() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property storageId in model TroubleshootingProperties"));
        }
        if (storagePath() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property storagePath in model TroubleshootingProperties"));
        }
    }
}
