// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.ConnectionPolicyName;

/** Samples for ServerConnectionPolicies Get. */
public final class ServerConnectionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ServerConnectionPolicyGet.json
     */
    /**
     * Sample code: Get a server's secure connection policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAServerSSecureConnectionPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerConnectionPolicies()
            .getWithResponse("test-1234", "test-5678", ConnectionPolicyName.DEFAULT, Context.NONE);
    }
}