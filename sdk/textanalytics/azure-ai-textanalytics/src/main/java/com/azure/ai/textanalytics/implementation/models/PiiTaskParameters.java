// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PiiTaskParameters model. */
@Fluent
public final class PiiTaskParameters {
    /*
     * The domain property.
     */
    @JsonProperty(value = "domain")
    private PiiTaskParametersDomain domain;

    /*
     * The model-version property.
     */
    @JsonProperty(value = "model-version")
    private String modelVersion;

    /*
     * The loggingOptOut property.
     */
    @JsonProperty(value = "loggingOptOut")
    private Boolean loggingOptOut;

    /*
     * (Optional) describes the PII categories to return
     */
    @JsonProperty(value = "piiCategories")
    private List<PiiCategory> piiCategories;

    /*
     * The stringIndexType property.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /**
     * Get the domain property: The domain property.
     *
     * @return the domain value.
     */
    public PiiTaskParametersDomain getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: The domain property.
     *
     * @param domain the domain value to set.
     * @return the PiiTaskParameters object itself.
     */
    public PiiTaskParameters setDomain(PiiTaskParametersDomain domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the modelVersion property: The model-version property.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The model-version property.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the PiiTaskParameters object itself.
     */
    public PiiTaskParameters setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Get the loggingOptOut property: The loggingOptOut property.
     *
     * @return the loggingOptOut value.
     */
    public Boolean isLoggingOptOut() {
        return this.loggingOptOut;
    }

    /**
     * Set the loggingOptOut property: The loggingOptOut property.
     *
     * @param loggingOptOut the loggingOptOut value to set.
     * @return the PiiTaskParameters object itself.
     */
    public PiiTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        this.loggingOptOut = loggingOptOut;
        return this;
    }

    /**
     * Get the piiCategories property: (Optional) describes the PII categories to return.
     *
     * @return the piiCategories value.
     */
    public List<PiiCategory> getPiiCategories() {
        return this.piiCategories;
    }

    /**
     * Set the piiCategories property: (Optional) describes the PII categories to return.
     *
     * @param piiCategories the piiCategories value to set.
     * @return the PiiTaskParameters object itself.
     */
    public PiiTaskParameters setPiiCategories(List<PiiCategory> piiCategories) {
        this.piiCategories = piiCategories;
        return this;
    }

    /**
     * Get the stringIndexType property: The stringIndexType property.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: The stringIndexType property.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the PiiTaskParameters object itself.
     */
    public PiiTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}
