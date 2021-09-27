// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityUpdateClassifications {
    public static void main(String[] args) {
        EntityClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildEntityClient();
        BinaryData classifications =
                BinaryData.fromString(
                        "[{\"entityGuid\":\"45dd4404-e897-b7e2-ca3c-f6e6b11b4f24\",\"typeName\":\"MICROSOFT.FINANCIAL.CREDIT_CARD_NUMBER\"},{\"entityGuid\":\"45dd4404-e897-b7e2-ca3c-f6e6b11b4f24\",\"typeName\":\"MICROSOFT.FINANCIAL.US_BANK_ACCOUNT_NUMBER\"}]");
        Response<Void> response =
                client.updateClassificationsWithResponse(
                        "45dd4404-e897-b7e2-ca3c-f6e6b11b4f24", classifications, null, null);
    }
}
