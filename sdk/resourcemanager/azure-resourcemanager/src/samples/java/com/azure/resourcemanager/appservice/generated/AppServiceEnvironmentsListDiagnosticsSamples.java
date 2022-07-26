// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceEnvironments ListDiagnostics. */
public final class AppServiceEnvironmentsListDiagnosticsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/AppServiceEnvironments_ListDiagnostics.json
     */
    /**
     * Sample code: Get diagnostic information for an App Service Environment.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDiagnosticInformationForAnAppServiceEnvironment(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .listDiagnosticsWithResponse("test-rg", "test-ase", Context.NONE);
    }
}