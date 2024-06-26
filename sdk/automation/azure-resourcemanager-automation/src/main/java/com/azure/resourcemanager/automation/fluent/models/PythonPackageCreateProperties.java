// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.ContentLink;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters supplied to the create or update module properties. */
@Fluent
public final class PythonPackageCreateProperties {
    /*
     * Gets or sets the module content link.
     */
    @JsonProperty(value = "contentLink", required = true)
    private ContentLink contentLink;

    /**
     * Get the contentLink property: Gets or sets the module content link.
     *
     * @return the contentLink value.
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set the contentLink property: Gets or sets the module content link.
     *
     * @param contentLink the contentLink value to set.
     * @return the PythonPackageCreateProperties object itself.
     */
    public PythonPackageCreateProperties withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentLink() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentLink in model PythonPackageCreateProperties"));
        } else {
            contentLink().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PythonPackageCreateProperties.class);
}
