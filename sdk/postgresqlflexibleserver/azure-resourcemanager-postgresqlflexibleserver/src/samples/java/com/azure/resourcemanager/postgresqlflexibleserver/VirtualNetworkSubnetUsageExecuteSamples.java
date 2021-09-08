// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualNetworkSubnetUsageParameter;

/** Samples for VirtualNetworkSubnetUsage Execute. */
public final class VirtualNetworkSubnetUsageExecuteSamples {
    /*
     * operationId: VirtualNetworkSubnetUsage_Execute
     * api-version: 2021-06-01
     * x-ms-examples: VirtualNetworkSubnetUsageList
     */
    /**
     * Sample code: VirtualNetworkSubnetUsageList.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void virtualNetworkSubnetUsageList(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager
            .virtualNetworkSubnetUsages()
            .executeWithResponse(
                "westus",
                new VirtualNetworkSubnetUsageParameter()
                    .withVirtualNetworkArmResourceId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/testvnet"),
                Context.NONE);
    }
}
