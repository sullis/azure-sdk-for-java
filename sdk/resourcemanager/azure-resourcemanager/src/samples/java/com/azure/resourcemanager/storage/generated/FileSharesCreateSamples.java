// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.FileShareInner;
import com.azure.resourcemanager.storage.models.EnabledProtocols;
import com.azure.resourcemanager.storage.models.ShareAccessTier;

/** Samples for FileShares Create. */
public final class FileSharesCreateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/FileSharesPut_AccessTier.json
     */
    /**
     * Sample code: PutShares with Access Tier.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putSharesWithAccessTier(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .createWithResponse(
                "res346",
                "sto666",
                "share1235",
                new FileShareInner().withAccessTier(ShareAccessTier.HOT),
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/FileSharesPut_NFS.json
     */
    /**
     * Sample code: Create NFS Shares.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createNFSShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .createWithResponse(
                "res346",
                "sto666",
                "share1235",
                new FileShareInner().withEnabledProtocols(EnabledProtocols.NFS),
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/FileSharesPut.json
     */
    /**
     * Sample code: PutShares.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .createWithResponse("res3376", "sto328", "share6185", new FileShareInner(), null, Context.NONE);
    }
}
