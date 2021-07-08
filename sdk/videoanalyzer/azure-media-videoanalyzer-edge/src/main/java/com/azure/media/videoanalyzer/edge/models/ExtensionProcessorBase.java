// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Base class for pipeline extension processors. Pipeline extensions allow for custom media analysis and processing to
 * be plugged into the Video Analyzer pipeline.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = ExtensionProcessorBase.class)
@JsonTypeName("#Microsoft.VideoAnalyzer.ExtensionProcessorBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.GrpcExtension", value = GrpcExtension.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.HttpExtension", value = HttpExtension.class)
})
@Fluent
public class ExtensionProcessorBase extends ProcessorNodeBase {
    /*
     * Endpoint details of the pipeline extension plugin.
     */
    @JsonProperty(value = "endpoint", required = true)
    private EndpointBase endpoint;

    /*
     * Image transformations and formatting options to be applied to the video
     * frame(s) prior submission to the pipeline extension plugin.
     */
    @JsonProperty(value = "image", required = true)
    private ImageProperties image;

    /*
     * Media sampling parameters that define how often media is submitted to
     * the extension plugin.
     */
    @JsonProperty(value = "samplingOptions")
    private SamplingOptions samplingOptions;

    /**
     * Creates an instance of ExtensionProcessorBase class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     * @param endpoint the endpoint value to set.
     * @param image the image value to set.
     */
    @JsonCreator
    public ExtensionProcessorBase(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs,
            @JsonProperty(value = "endpoint", required = true) EndpointBase endpoint,
            @JsonProperty(value = "image", required = true) ImageProperties image) {
        super(name, inputs);
        this.endpoint = endpoint;
        this.image = image;
    }

    /**
     * Get the endpoint property: Endpoint details of the pipeline extension plugin.
     *
     * @return the endpoint value.
     */
    public EndpointBase getEndpoint() {
        return this.endpoint;
    }

    /**
     * Get the image property: Image transformations and formatting options to be applied to the video frame(s) prior
     * submission to the pipeline extension plugin.
     *
     * @return the image value.
     */
    public ImageProperties getImage() {
        return this.image;
    }

    /**
     * Get the samplingOptions property: Media sampling parameters that define how often media is submitted to the
     * extension plugin.
     *
     * @return the samplingOptions value.
     */
    public SamplingOptions getSamplingOptions() {
        return this.samplingOptions;
    }

    /**
     * Set the samplingOptions property: Media sampling parameters that define how often media is submitted to the
     * extension plugin.
     *
     * @param samplingOptions the samplingOptions value to set.
     * @return the ExtensionProcessorBase object itself.
     */
    public ExtensionProcessorBase setSamplingOptions(SamplingOptions samplingOptions) {
        this.samplingOptions = samplingOptions;
        return this;
    }
}
