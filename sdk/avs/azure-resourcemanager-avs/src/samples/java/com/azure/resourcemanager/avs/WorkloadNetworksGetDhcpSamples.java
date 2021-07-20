// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetDhcp. */
public final class WorkloadNetworksGetDhcpSamples {
    /**
     * Sample code: WorkloadNetworks_GetDhcp.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksGetDhcp(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().getDhcpWithResponse("group1", "dhcp1", "cloud1", Context.NONE);
    }
}
