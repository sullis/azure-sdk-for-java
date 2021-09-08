// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.models.ClusterMonitoringRequest;

/** Samples for Extensions EnableMonitoring. */
public final class ExtensionsEnableMonitoringSamples {
    /**
     * Sample code: Enable cluster monitoring.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void enableClusterMonitoring(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .extensions()
            .enableMonitoring(
                "rg1",
                "cluster1",
                new ClusterMonitoringRequest()
                    .withWorkspaceId("a2090ead-8c9f-4fba-b70e-533e3e003163")
                    .withPrimaryKey("**********"),
                Context.NONE);
    }
}
