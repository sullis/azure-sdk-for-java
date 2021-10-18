// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.AzureCapacity;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure resource SKU definition. */
@Fluent
public final class AzureResourceSkuInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureResourceSkuInner.class);

    /*
     * Resource Namespace and Type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The SKU details.
     */
    @JsonProperty(value = "sku")
    private AzureSku sku;

    /*
     * The number of instances of the cluster.
     */
    @JsonProperty(value = "capacity")
    private AzureCapacity capacity;

    /**
     * Get the resourceType property: Resource Namespace and Type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Namespace and Type.
     *
     * @param resourceType the resourceType value to set.
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: The SKU details.
     *
     * @return the sku value.
     */
    public AzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU details.
     *
     * @param sku the sku value to set.
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withSku(AzureSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity property: The number of instances of the cluster.
     *
     * @return the capacity value.
     */
    public AzureCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The number of instances of the cluster.
     *
     * @param capacity the capacity value to set.
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withCapacity(AzureCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }
}
