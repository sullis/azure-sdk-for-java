// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for DevicesForSubscription List. */
public final class DevicesForSubscriptionListSamples {
    /**
     * Sample code: Get Devices.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getDevices(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.devicesForSubscriptions().list(null, null, null, Context.NONE);
    }
}
