// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for PacketCaptures List. */
public final class PacketCapturesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkWatcherPacketCapturesList.json
     */
    /**
     * Sample code: List packet captures.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listPacketCaptures(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPacketCaptures().list("rg1", "nw1", Context.NONE);
    }
}
