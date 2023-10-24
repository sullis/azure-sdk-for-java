// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/PrivateEndpointConnections_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void privateEndpointConnectionsListMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .privateEndpointConnections()
            .list("resourcegroupname", "elasticsanname", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/PrivateEndpointConnections_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void privateEndpointConnectionsListMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .privateEndpointConnections()
            .list("resourcegroupname", "elasticsanname", com.azure.core.util.Context.NONE);
    }
}
