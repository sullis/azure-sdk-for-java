// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationOperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Lists of Custom Locations operations. */
@Fluent
public final class CustomLocationOperationsList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomLocationOperationsList.class);

    /*
     * Next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of customLocationOperation
     */
    @JsonProperty(value = "value", required = true)
    private List<CustomLocationOperationInner> value;

    /**
     * Get the nextLink property: Next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the CustomLocationOperationsList object itself.
     */
    public CustomLocationOperationsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of customLocationOperation.
     *
     * @return the value value.
     */
    public List<CustomLocationOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of customLocationOperation.
     *
     * @param value the value value to set.
     * @return the CustomLocationOperationsList object itself.
     */
    public CustomLocationOperationsList withValue(List<CustomLocationOperationInner> value) {
        this.value = value;
        return this;
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
                    new IllegalArgumentException(
                        "Missing required property value in model CustomLocationOperationsList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
