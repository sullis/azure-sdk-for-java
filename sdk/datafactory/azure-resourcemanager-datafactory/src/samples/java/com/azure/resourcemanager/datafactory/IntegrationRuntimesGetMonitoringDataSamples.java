// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimes GetMonitoringData. */
public final class IntegrationRuntimesGetMonitoringDataSamples {
    /*
     * operationId: IntegrationRuntimes_GetMonitoringData
     * api-version: 2018-06-01
     * x-ms-examples: IntegrationRuntimes_GetMonitoringData
     */
    /**
     * Sample code: IntegrationRuntimes_GetMonitoringData.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesGetMonitoringData(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .integrationRuntimes()
            .getMonitoringDataWithResponse(
                "exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", Context.NONE);
    }
}
