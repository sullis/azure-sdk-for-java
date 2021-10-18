// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Encoder processor allows for encoding of the input content. For example, it can used to change the resolution from 4K
 * to 1280x720.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.EncoderProcessor")
@Fluent
public final class EncoderProcessor extends ProcessorNodeBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncoderProcessor.class);

    /*
     * The encoder preset, which defines the recipe or instructions on how the
     * input content should be processed.
     */
    @JsonProperty(value = "preset", required = true)
    private EncoderPresetBase preset;

    /**
     * Get the preset property: The encoder preset, which defines the recipe or instructions on how the input content
     * should be processed.
     *
     * @return the preset value.
     */
    public EncoderPresetBase preset() {
        return this.preset;
    }

    /**
     * Set the preset property: The encoder preset, which defines the recipe or instructions on how the input content
     * should be processed.
     *
     * @param preset the preset value to set.
     * @return the EncoderProcessor object itself.
     */
    public EncoderProcessor withPreset(EncoderPresetBase preset) {
        this.preset = preset;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EncoderProcessor withInputs(List<NodeInput> inputs) {
        super.withInputs(inputs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EncoderProcessor withName(String name) {
        super.withName(name);
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
        if (preset() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property preset in model EncoderProcessor"));
        } else {
            preset().validate();
        }
    }
}
