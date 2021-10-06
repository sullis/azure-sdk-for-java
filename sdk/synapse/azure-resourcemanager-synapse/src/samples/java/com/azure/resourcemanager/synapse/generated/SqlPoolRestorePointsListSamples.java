// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolRestorePoints List. */
public final class SqlPoolRestorePointsListSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListSqlPoolRestorePoints.json
     */
    /**
     * Sample code: Get a list of restore points of a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getAListOfRestorePointsOfASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolRestorePoints().list("Default-SQL-SouthEastAsia", "testserver", "testDatabase", Context.NONE);
    }
}
