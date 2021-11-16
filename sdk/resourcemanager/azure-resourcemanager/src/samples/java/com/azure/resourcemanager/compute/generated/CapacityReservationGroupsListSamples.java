// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.ExpandTypesForGetCapacityReservationGroups;

/** Samples for CapacityReservationGroups List. */
public final class CapacityReservationGroupsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/ListCapacityReservationGroupsInSubscription.json
     */
    /**
     * Sample code: List capacity reservation groups in subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCapacityReservationGroupsInSubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getCapacityReservationGroups()
            .list(ExpandTypesForGetCapacityReservationGroups.VIRTUAL_MACHINES_REF, Context.NONE);
    }
}
