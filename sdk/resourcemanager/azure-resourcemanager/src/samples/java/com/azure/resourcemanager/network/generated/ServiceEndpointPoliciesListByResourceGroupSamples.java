// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicies ListByResourceGroup. */
public final class ServiceEndpointPoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceEndpointPolicyList.json
     */
    /**
     * Sample code: List resource group service endpoint policies.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listResourceGroupServiceEndpointPolicies(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceEndpointPolicies()
            .listByResourceGroup("rg1", Context.NONE);
    }
}
