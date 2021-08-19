// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties on upload watermark. Mostly timestamp for each upload data type. */
@Fluent
public final class UploadWatermark {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UploadWatermark.class);

    /*
     * Last uploaded date for metrics from kubernetes cluster. Defaults to
     * current date time
     */
    @JsonProperty(value = "metrics")
    private OffsetDateTime metrics;

    /*
     * Last uploaded date for logs from kubernetes cluster. Defaults to current
     * date time
     */
    @JsonProperty(value = "logs")
    private OffsetDateTime logs;

    /*
     * Last uploaded date for usages from kubernetes cluster. Defaults to
     * current date time
     */
    @JsonProperty(value = "usages")
    private OffsetDateTime usages;

    /**
     * Get the metrics property: Last uploaded date for metrics from kubernetes cluster. Defaults to current date time.
     *
     * @return the metrics value.
     */
    public OffsetDateTime metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Last uploaded date for metrics from kubernetes cluster. Defaults to current date time.
     *
     * @param metrics the metrics value to set.
     * @return the UploadWatermark object itself.
     */
    public UploadWatermark withMetrics(OffsetDateTime metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the logs property: Last uploaded date for logs from kubernetes cluster. Defaults to current date time.
     *
     * @return the logs value.
     */
    public OffsetDateTime logs() {
        return this.logs;
    }

    /**
     * Set the logs property: Last uploaded date for logs from kubernetes cluster. Defaults to current date time.
     *
     * @param logs the logs value to set.
     * @return the UploadWatermark object itself.
     */
    public UploadWatermark withLogs(OffsetDateTime logs) {
        this.logs = logs;
        return this;
    }

    /**
     * Get the usages property: Last uploaded date for usages from kubernetes cluster. Defaults to current date time.
     *
     * @return the usages value.
     */
    public OffsetDateTime usages() {
        return this.usages;
    }

    /**
     * Set the usages property: Last uploaded date for usages from kubernetes cluster. Defaults to current date time.
     *
     * @param usages the usages value to set.
     * @return the UploadWatermark object itself.
     */
    public UploadWatermark withUsages(OffsetDateTime usages) {
        this.usages = usages;
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
