// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.models.NameAvailabilityCheckRequestParameters;

/** Samples for Locations CheckNameAvailability. */
public final class LocationsCheckNameAvailabilitySamples {
    /**
     * Sample code: Get the subscription usages for specific location.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void getTheSubscriptionUsagesForSpecificLocation(
        com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(
                "westus",
                new NameAvailabilityCheckRequestParameters().withName("test123").withType("clusters"),
                Context.NONE);
    }
}
