// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner;

/** An immutable client-side representation of UserRoleResponse. */
public interface UserRoleResponse {
    /**
     * Gets the role property: User roles on configured in Logz.io account.
     *
     * @return the role value.
     */
    UserRole role();

    /**
     * Gets the inner com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner object.
     *
     * @return the inner object.
     */
    UserRoleResponseInner innerModel();
}
