// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifact;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifactName;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifactType;
import org.junit.jupiter.api.Assertions;

public final class ApplicationArtifactTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationArtifact model =
            BinaryData
                .fromString("{\"name\":\"NotSpecified\",\"uri\":\"appd\",\"type\":\"Custom\"}")
                .toObject(ApplicationArtifact.class);
        Assertions.assertEquals(ApplicationArtifactName.NOT_SPECIFIED, model.name());
        Assertions.assertEquals("appd", model.uri());
        Assertions.assertEquals(ApplicationArtifactType.CUSTOM, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationArtifact model =
            new ApplicationArtifact()
                .withName(ApplicationArtifactName.NOT_SPECIFIED)
                .withUri("appd")
                .withType(ApplicationArtifactType.CUSTOM);
        model = BinaryData.fromObject(model).toObject(ApplicationArtifact.class);
        Assertions.assertEquals(ApplicationArtifactName.NOT_SPECIFIED, model.name());
        Assertions.assertEquals("appd", model.uri());
        Assertions.assertEquals(ApplicationArtifactType.CUSTOM, model.type());
    }
}
