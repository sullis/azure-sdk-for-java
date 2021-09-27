// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryRemoveTermAssignmentFromEntities {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildGlossaryClient();
        BinaryData relatedObjectIds =
                BinaryData.fromString(
                        "[{\"guid\":\"16feb2a1-2c79-ade1-338d-fb24fcb8b8bd\",\"relationshipGuid\":\"624f08bb-3c93-4f03-9ce1-ed2ce2c7c8d5\"}]");
        Response<Void> response =
                client.removeTermAssignmentFromEntitiesWithResponse(
                        "8a7f65ec-6429-0b9b-3734-ec57bf1e34c2", relatedObjectIds, null, null);
    }
}
