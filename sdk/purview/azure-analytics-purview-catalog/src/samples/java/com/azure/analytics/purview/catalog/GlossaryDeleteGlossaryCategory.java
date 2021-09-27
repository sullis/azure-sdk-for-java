// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryDeleteGlossaryCategory {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildGlossaryClient();
        Response<Void> response =
                client.deleteGlossaryCategoryWithResponse("0e391355-252a-e5f3-ac18-5a3602df7616", null, null);
    }
}
