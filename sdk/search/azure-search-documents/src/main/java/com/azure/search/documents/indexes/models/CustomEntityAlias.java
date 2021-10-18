// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A complex object that can be used to specify alternative spellings or synonyms to the root entity name. */
@Fluent
public final class CustomEntityAlias {
    /*
     * The text of the alias.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Determine if the alias is case sensitive.
     */
    @JsonProperty(value = "caseSensitive")
    private Boolean caseSensitive;

    /*
     * Determine if the alias is accent sensitive.
     */
    @JsonProperty(value = "accentSensitive")
    private Boolean accentSensitive;

    /*
     * Determine the fuzzy edit distance of the alias.
     */
    @JsonProperty(value = "fuzzyEditDistance")
    private Integer fuzzyEditDistance;

    /**
     * Creates an instance of CustomEntityAlias class.
     *
     * @param text the text value to set.
     */
    @JsonCreator
    public CustomEntityAlias(@JsonProperty(value = "text", required = true) String text) {
        this.text = text;
    }

    /**
     * Get the text property: The text of the alias.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the caseSensitive property: Determine if the alias is case sensitive.
     *
     * @return the caseSensitive value.
     */
    public Boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * Set the caseSensitive property: Determine if the alias is case sensitive.
     *
     * @param caseSensitive the caseSensitive value to set.
     * @return the CustomEntityAlias object itself.
     */
    public CustomEntityAlias setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * Get the accentSensitive property: Determine if the alias is accent sensitive.
     *
     * @return the accentSensitive value.
     */
    public Boolean isAccentSensitive() {
        return this.accentSensitive;
    }

    /**
     * Set the accentSensitive property: Determine if the alias is accent sensitive.
     *
     * @param accentSensitive the accentSensitive value to set.
     * @return the CustomEntityAlias object itself.
     */
    public CustomEntityAlias setAccentSensitive(Boolean accentSensitive) {
        this.accentSensitive = accentSensitive;
        return this;
    }

    /**
     * Get the fuzzyEditDistance property: Determine the fuzzy edit distance of the alias.
     *
     * @return the fuzzyEditDistance value.
     */
    public Integer getFuzzyEditDistance() {
        return this.fuzzyEditDistance;
    }

    /**
     * Set the fuzzyEditDistance property: Determine the fuzzy edit distance of the alias.
     *
     * @param fuzzyEditDistance the fuzzyEditDistance value to set.
     * @return the CustomEntityAlias object itself.
     */
    public CustomEntityAlias setFuzzyEditDistance(Integer fuzzyEditDistance) {
        this.fuzzyEditDistance = fuzzyEditDistance;
        return this;
    }
}
