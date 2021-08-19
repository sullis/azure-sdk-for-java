// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Views Delete. */
public final class ViewsDeleteSamples {
    /**
     * Sample code: DeletePrivateView.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void deletePrivateView(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager.views().deleteWithResponse("TestView", Context.NONE);
    }
}
