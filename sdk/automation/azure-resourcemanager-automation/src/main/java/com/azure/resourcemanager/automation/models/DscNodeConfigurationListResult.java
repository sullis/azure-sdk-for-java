// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.fluent.models.DscNodeConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list job operation. */
@Fluent
public final class DscNodeConfigurationListResult {
    /*
     * Gets or sets a list of Dsc node configurations.
     */
    @JsonProperty(value = "value")
    private List<DscNodeConfigurationInner> value;

    /*
     * Gets or sets the next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Gets or sets the total rows in query.
     */
    @JsonProperty(value = "totalCount")
    private Integer totalCount;

    /**
     * Get the value property: Gets or sets a list of Dsc node configurations.
     *
     * @return the value value.
     */
    public List<DscNodeConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of Dsc node configurations.
     *
     * @param value the value value to set.
     * @return the DscNodeConfigurationListResult object itself.
     */
    public DscNodeConfigurationListResult withValue(List<DscNodeConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the DscNodeConfigurationListResult object itself.
     */
    public DscNodeConfigurationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the totalCount property: Gets or sets the total rows in query.
     *
     * @return the totalCount value.
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Gets or sets the total rows in query.
     *
     * @param totalCount the totalCount value to set.
     * @return the DscNodeConfigurationListResult object itself.
     */
    public DscNodeConfigurationListResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
