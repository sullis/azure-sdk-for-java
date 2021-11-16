// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuits ListRoutesTable. */
public final class ExpressRouteCircuitsListRoutesTableSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteCircuitRouteTableList.json
     */
    /**
     * Sample code: List Route Tables.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRouteTables(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuits()
            .listRoutesTable("rg1", "circuitName", "peeringName", "devicePath", Context.NONE);
    }
}
