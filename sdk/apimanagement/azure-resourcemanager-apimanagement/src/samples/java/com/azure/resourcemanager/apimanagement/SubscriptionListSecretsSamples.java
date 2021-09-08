// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Subscription ListSecrets. */
public final class SubscriptionListSecretsSamples {
    /*
     * operationId: Subscription_ListSecrets
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementSubscriptionListSecrets
     */
    /**
     * Sample code: ApiManagementSubscriptionListSecrets.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementSubscriptionListSecrets(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .subscriptions()
            .listSecretsWithResponse("rg1", "apimService1", "5931a769d8d14f0ad8ce13b8", Context.NONE);
    }
}
