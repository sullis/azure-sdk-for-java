// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TypesGetTermTemplateDefByName {
    public static void main(String[] args) {
        TypesClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildTypesClient();
        Response<BinaryData> response = client.getTermTemplateDefByNameWithResponse("MS KPI", null, null);
    }
}
