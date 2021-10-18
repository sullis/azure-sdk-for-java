// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.Context;

/** Samples for SubAccount VMHostPayload. */
public final class SubAccountVMHostPayloadSamples {
    /*
     * x-ms-original-file: specification/logz/resource-manager/Microsoft.Logz/stable/2020-10-01/examples/SubAccount_VMHosts_Payload.json
     */
    /**
     * Sample code: SubAccount_VMHosts_Payload.
     *
     * @param manager Entry point to LogzManager.
     */
    public static void subAccountVMHostsPayload(com.azure.resourcemanager.logz.LogzManager manager) {
        manager.subAccounts().vMHostPayloadWithResponse("myResourceGroup", "myMonitor", "SubAccount1", Context.NONE);
    }
}
