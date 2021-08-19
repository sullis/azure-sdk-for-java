// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.DeviceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Devices. */
@Fluent
public final class DeviceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceList.class);

    /*
     * List of devices
     */
    @JsonProperty(value = "value", required = true)
    private List<DeviceInner> value;

    /*
     * When there are too many devices for one page, use this URI to fetch the
     * next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of devices.
     *
     * @return the value value.
     */
    public List<DeviceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of devices.
     *
     * @param value the value value to set.
     * @return the DeviceList object itself.
     */
    public DeviceList withValue(List<DeviceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: When there are too many devices for one page, use this URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model DeviceList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
