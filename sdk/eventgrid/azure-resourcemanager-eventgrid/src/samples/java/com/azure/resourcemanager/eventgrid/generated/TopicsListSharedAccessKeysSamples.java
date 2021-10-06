// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for Topics ListSharedAccessKeys. */
public final class TopicsListSharedAccessKeysSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-06-01-preview/examples/Topics_ListSharedAccessKeys.json
     */
    /**
     * Sample code: Topics_ListSharedAccessKeys.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsListSharedAccessKeys(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topics().listSharedAccessKeysWithResponse("examplerg", "exampletopic2", Context.NONE);
    }
}
