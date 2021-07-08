// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Data Lake Store sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreSink")
@Fluent
public final class AzureDataLakeStoreSink extends CopySink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDataLakeStoreSink.class);

    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /*
     * Single File Parallel.
     */
    @JsonProperty(value = "enableAdlsSingleFileParallel")
    private Object enableAdlsSingleFileParallel;

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @return the copyBehavior value.
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set.
     * @return the AzureDataLakeStoreSink object itself.
     */
    public AzureDataLakeStoreSink withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /**
     * Get the enableAdlsSingleFileParallel property: Single File Parallel.
     *
     * @return the enableAdlsSingleFileParallel value.
     */
    public Object enableAdlsSingleFileParallel() {
        return this.enableAdlsSingleFileParallel;
    }

    /**
     * Set the enableAdlsSingleFileParallel property: Single File Parallel.
     *
     * @param enableAdlsSingleFileParallel the enableAdlsSingleFileParallel value to set.
     * @return the AzureDataLakeStoreSink object itself.
     */
    public AzureDataLakeStoreSink withEnableAdlsSingleFileParallel(Object enableAdlsSingleFileParallel) {
        this.enableAdlsSingleFileParallel = enableAdlsSingleFileParallel;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
