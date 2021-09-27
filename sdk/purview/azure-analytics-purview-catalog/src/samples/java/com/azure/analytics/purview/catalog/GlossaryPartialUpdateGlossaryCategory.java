// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryPartialUpdateGlossaryCategory {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildGlossaryClient();
        BinaryData partialUpdates = BinaryData.fromString("{\"longDescription\":\"Example Long Description\"}");
        Response<BinaryData> response =
                client.partialUpdateGlossaryCategoryWithResponse(
                        "3243ea0a-9492-47e1-392e-a84e64980af9", partialUpdates, null, null);
    }
}
