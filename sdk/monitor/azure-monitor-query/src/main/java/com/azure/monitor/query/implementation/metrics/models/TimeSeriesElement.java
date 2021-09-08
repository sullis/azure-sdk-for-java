// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A time series result type. The discriminator value is always TimeSeries in this case. */
@Fluent
public final class TimeSeriesElement {
    /*
     * the metadata values returned if $filter was specified in the call.
     */
    @JsonProperty(value = "metadatavalues")
    private List<MetadataValue> metadatavalues;

    /*
     * An array of data points representing the metric values.  This is only
     * returned if a result type of data is specified.
     */
    @JsonProperty(value = "data")
    private List<MetricValue> data;

    /**
     * Get the metadatavalues property: the metadata values returned if $filter was specified in the call.
     *
     * @return the metadatavalues value.
     */
    public List<MetadataValue> getMetadatavalues() {
        return this.metadatavalues;
    }

    /**
     * Set the metadatavalues property: the metadata values returned if $filter was specified in the call.
     *
     * @param metadatavalues the metadatavalues value to set.
     * @return the TimeSeriesElement object itself.
     */
    public TimeSeriesElement setMetadatavalues(List<MetadataValue> metadatavalues) {
        this.metadatavalues = metadatavalues;
        return this;
    }

    /**
     * Get the data property: An array of data points representing the metric values. This is only returned if a result
     * type of data is specified.
     *
     * @return the data value.
     */
    public List<MetricValue> getData() {
        return this.data;
    }

    /**
     * Set the data property: An array of data points representing the metric values. This is only returned if a result
     * type of data is specified.
     *
     * @param data the data value to set.
     * @return the TimeSeriesElement object itself.
     */
    public TimeSeriesElement setData(List<MetricValue> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getMetadatavalues() != null) {
            getMetadatavalues().forEach(e -> e.validate());
        }
        if (getData() != null) {
            getData().forEach(e -> e.validate());
        }
    }
}
