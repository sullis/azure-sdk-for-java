// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnGatewayPacketCaptureStartParameters;

/** Samples for VpnGateways StartPacketCapture. */
public final class VpnGatewaysStartPacketCaptureSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VpnGatewayStartPacketCaptureFilterData.json
     */
    /**
     * Sample code: Start packet capture on vpn gateway with filter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVpnGatewayWithFilter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVpnGateways()
            .startPacketCapture(
                "rg1",
                "vpngw",
                new VpnGatewayPacketCaptureStartParameters()
                    .withFilterData(
                        "{'TracingFlags': 11,'MaxPacketBufferSize': 120,'MaxFileSize': 200,'Filters':"
                            + " [{'SourceSubnets': ['20.1.1.0/24'],'DestinationSubnets': ['10.1.1.0/24'],'SourcePort':"
                            + " [500],'DestinationPort': [4500],'Protocol': 6,'TcpFlags':"
                            + " 16,'CaptureSingleDirectionTrafficOnly': true}]}"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VpnGatewayStartPacketCapture.json
     */
    /**
     * Sample code: Start packet capture on vpn gateway without filter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVpnGatewayWithoutFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVpnGateways()
            .startPacketCapture("rg1", "vpngw", null, Context.NONE);
    }
}
