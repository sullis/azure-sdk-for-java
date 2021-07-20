// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Tasks ListByResourceGroup. */
public final class TasksListByResourceGroupSamples {
    /**
     * Sample code: Get security recommendation tasks in a resource group.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityRecommendationTasksInAResourceGroup(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.tasks().listByResourceGroup("myRg", "westeurope", null, Context.NONE);
    }
}
