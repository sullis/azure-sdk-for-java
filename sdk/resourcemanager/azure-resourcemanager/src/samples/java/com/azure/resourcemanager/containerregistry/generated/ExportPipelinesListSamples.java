// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.core.util.Context;

/** Samples for ExportPipelines List. */
public final class ExportPipelinesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-12-01-preview/examples/ExportPipelineList.json
     */
    /**
     * Sample code: ExportPipelineList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void exportPipelineList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getExportPipelines()
            .list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
