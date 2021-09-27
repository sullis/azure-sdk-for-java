// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityUpdate {
    public static void main(String[] args) {
        EntityClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildEntityClient();
        BinaryData entity =
                BinaryData.fromString(
                        "{\"entity\":{\"attributes\":{\"name\":\"ExampleStorageAccount\",\"description\":null,\"createTime\":0,\"modifiedTime\":0,\"owner\":\"ExampleOwner\",\"publicAccessLevel\":null,\"qualifiedName\":\"exampleaccount\"},\"contacts\":{\"Expert\":[{\"info\":\"Example Expert Info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}],\"Owner\":[{\"info\":\"Example Owner Info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}]},\"createdBy\":\"ExampleCreator\",\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\",\"updatedBy\":\"ExampleUpdator\",\"version\":0},\"referredEntities\":{}}");
        Response<BinaryData> response = client.createOrUpdateWithResponse(entity, null, null);
    }
}
