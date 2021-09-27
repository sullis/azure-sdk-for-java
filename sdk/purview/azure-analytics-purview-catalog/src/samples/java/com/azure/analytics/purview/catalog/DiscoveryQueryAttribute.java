// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DiscoveryQueryAttribute {
    public static void main(String[] args) {
        DiscoveryClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildDiscoveryClient();
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"filter\":{\"attributeName\":\"name\",\"attributeValue\":\"exampledata.csv\",\"operator\":\"eq\"},\"keywords\":null,\"limit\":2}");
        Response<BinaryData> response = client.queryWithResponse(searchRequest, null, null);
    }
}
