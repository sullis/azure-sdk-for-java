// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SMB CSI Driver settings for the storage profile.
 */
@Fluent
public final class StorageProfileSmbCsiDriver {
    /*
     * Indicates whether to enable SMB CSI Driver. The default value is true.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of StorageProfileSmbCsiDriver class.
     */
    public StorageProfileSmbCsiDriver() {
    }

    /**
     * Get the enabled property: Indicates whether to enable SMB CSI Driver. The default value is true.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether to enable SMB CSI Driver. The default value is true.
     * 
     * @param enabled the enabled value to set.
     * @return the StorageProfileSmbCsiDriver object itself.
     */
    public StorageProfileSmbCsiDriver withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
