// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.resourcemanager.managedapplications.fluent.models.ManagedIdentityTokenResultInner;
import java.util.List;

/** An immutable client-side representation of ManagedIdentityTokenResult. */
public interface ManagedIdentityTokenResult {
    /**
     * Gets the value property: The array of managed identity tokens.
     *
     * @return the value value.
     */
    List<ManagedIdentityToken> value();

    /**
     * Gets the inner com.azure.resourcemanager.managedapplications.fluent.models.ManagedIdentityTokenResultInner
     * object.
     *
     * @return the inner object.
     */
    ManagedIdentityTokenResultInner innerModel();
}
