// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class RelationshipCreate {
    public static void main(String[] args) {
        RelationshipClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRelationshipClient();
        BinaryData relationship =
                BinaryData.fromString(
                        "{\"attributes\":{\"description\":\"Example Description\",\"expression\":\"Example Expression\",\"source\":null,\"status\":null,\"steward\":\"Example Steward\"},\"createdBy\":\"ExampleCreator\",\"end1\":{\"guid\":\"856d31e6-e342-a1ce-6273-22ddb77029c6\",\"typeName\":\"AtlasGlossaryTerm\"},\"end2\":{\"guid\":\"77481037-2874-9bdc-9b9e-76bb94ee71aa\",\"typeName\":\"AtlasGlossaryTerm\"},\"label\":\"r:AtlasGlossarySynonym\",\"status\":\"ACTIVE\",\"typeName\":\"AtlasGlossarySynonym\",\"updatedBy\":\"ExampleUpdator\",\"version\":0}");
        Response<BinaryData> response = client.createWithResponse(relationship, null, null);
    }
}
