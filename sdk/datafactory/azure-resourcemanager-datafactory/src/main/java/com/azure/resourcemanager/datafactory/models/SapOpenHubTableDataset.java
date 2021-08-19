// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapOpenHubTableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Sap Business Warehouse Open Hub Destination Table properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHubTable")
@Fluent
public final class SapOpenHubTableDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SapOpenHubTableDataset.class);

    /*
     * Sap Business Warehouse Open Hub Destination Table properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapOpenHubTableDatasetTypeProperties innerTypeProperties = new SapOpenHubTableDatasetTypeProperties();

    /**
     * Get the innerTypeProperties property: Sap Business Warehouse Open Hub Destination Table properties.
     *
     * @return the innerTypeProperties value.
     */
    private SapOpenHubTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the openHubDestinationName property: The name of the Open Hub Destination with destination type as Database
     * Table. Type: string (or Expression with resultType string).
     *
     * @return the openHubDestinationName value.
     */
    public Object openHubDestinationName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().openHubDestinationName();
    }

    /**
     * Set the openHubDestinationName property: The name of the Open Hub Destination with destination type as Database
     * Table. Type: string (or Expression with resultType string).
     *
     * @param openHubDestinationName the openHubDestinationName value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset withOpenHubDestinationName(Object openHubDestinationName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withOpenHubDestinationName(openHubDestinationName);
        return this;
    }

    /**
     * Get the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the excludeLastRequest value.
     */
    public Object excludeLastRequest() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().excludeLastRequest();
    }

    /**
     * Set the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     *
     * @param excludeLastRequest the excludeLastRequest value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset withExcludeLastRequest(Object excludeLastRequest) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withExcludeLastRequest(excludeLastRequest);
        return this;
    }

    /**
     * Get the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     *
     * @return the baseRequestId value.
     */
    public Object baseRequestId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().baseRequestId();
    }

    /**
     * Set the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     *
     * @param baseRequestId the baseRequestId value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset withBaseRequestId(Object baseRequestId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withBaseRequestId(baseRequestId);
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
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SapOpenHubTableDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
