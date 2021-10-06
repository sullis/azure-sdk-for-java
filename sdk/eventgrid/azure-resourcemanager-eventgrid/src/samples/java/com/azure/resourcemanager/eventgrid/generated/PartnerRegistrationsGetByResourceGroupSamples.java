// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for PartnerRegistrations GetByResourceGroup. */
public final class PartnerRegistrationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-06-01-preview/examples/PartnerRegistrations_Get.json
     */
    /**
     * Sample code: PartnerRegistrations_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerRegistrationsGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerRegistrations()
            .getByResourceGroupWithResponse("examplerg", "examplePartnerRegistrationName1", Context.NONE);
    }
}
