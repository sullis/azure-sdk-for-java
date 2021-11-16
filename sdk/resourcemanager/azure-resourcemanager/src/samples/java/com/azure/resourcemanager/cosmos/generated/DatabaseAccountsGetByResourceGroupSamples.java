// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseAccounts GetByResourceGroup. */
public final class DatabaseAccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2021-10-15/examples/CosmosDBDatabaseAccountGet.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .getByResourceGroupWithResponse("rg1", "ddb1", Context.NONE);
    }
}
