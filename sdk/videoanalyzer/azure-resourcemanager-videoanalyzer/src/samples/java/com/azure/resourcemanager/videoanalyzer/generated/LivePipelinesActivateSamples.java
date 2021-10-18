// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for LivePipelines Activate. */
public final class LivePipelinesActivateSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/live-pipeline-activate.json
     */
    /**
     * Sample code: Activate live pipeline.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void activateLivePipeline(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.livePipelines().activate("testrg", "testaccount2", "livePipeline1", Context.NONE);
    }
}
