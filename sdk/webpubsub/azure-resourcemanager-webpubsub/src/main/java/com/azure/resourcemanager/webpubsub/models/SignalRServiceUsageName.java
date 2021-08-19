// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Localizable String object containing the name and a localized value. */
@Fluent
public final class SignalRServiceUsageName {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignalRServiceUsageName.class);

    /*
     * The identifier of the usage.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Localized name of the usage.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: The identifier of the usage.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The identifier of the usage.
     *
     * @param value the value value to set.
     * @return the SignalRServiceUsageName object itself.
     */
    public SignalRServiceUsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized name of the usage.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized name of the usage.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the SignalRServiceUsageName object itself.
     */
    public SignalRServiceUsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
