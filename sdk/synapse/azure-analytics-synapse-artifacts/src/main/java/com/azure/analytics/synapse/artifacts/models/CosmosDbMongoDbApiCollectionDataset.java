// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The CosmosDB (MongoDB API) database dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApiCollection")
@JsonFlatten
@Fluent
public class CosmosDbMongoDbApiCollectionDataset extends Dataset {
    /*
     * The collection name of the CosmosDB (MongoDB API) database. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.collection", required = true)
    private Object collection;

    /**
     * Get the collection property: The collection name of the CosmosDB (MongoDB API) database. Type: string (or
     * Expression with resultType string).
     *
     * @return the collection value.
     */
    public Object getCollection() {
        return this.collection;
    }

    /**
     * Set the collection property: The collection name of the CosmosDB (MongoDB API) database. Type: string (or
     * Expression with resultType string).
     *
     * @param collection the collection value to set.
     * @return the CosmosDbMongoDbApiCollectionDataset object itself.
     */
    public CosmosDbMongoDbApiCollectionDataset setCollection(Object collection) {
        this.collection = collection;
        return this;
    }
}
