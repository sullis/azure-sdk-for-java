// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkSecurityGroups ListByResourceGroup. */
public final class NetworkSecurityGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkSecurityGroupList.json
     */
    /**
     * Sample code: List network security groups in resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNetworkSecurityGroupsInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNetworkSecurityGroups().listByResourceGroup("rg1", Context.NONE);
    }
}
