// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingArcAutoProvisioning;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingArcAutoProvisioningConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingArcAutoProvisioningTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOfferingArcAutoProvisioning model = BinaryData.fromString(
            "{\"enabled\":true,\"cloudRoleArn\":\"qxmyzkl\",\"configuration\":{\"proxy\":\"n\",\"privateLinkScope\":\"hrvmzrqrazadi\"}}")
            .toObject(DefenderForServersAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("qxmyzkl", model.cloudRoleArn());
        Assertions.assertEquals("n", model.configuration().proxy());
        Assertions.assertEquals("hrvmzrqrazadi", model.configuration().privateLinkScope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOfferingArcAutoProvisioning model
            = new DefenderForServersAwsOfferingArcAutoProvisioning().withEnabled(true).withCloudRoleArn("qxmyzkl")
                .withConfiguration(new DefenderForServersAwsOfferingArcAutoProvisioningConfiguration().withProxy("n")
                    .withPrivateLinkScope("hrvmzrqrazadi"));
        model = BinaryData.fromObject(model).toObject(DefenderForServersAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("qxmyzkl", model.cloudRoleArn());
        Assertions.assertEquals("n", model.configuration().proxy());
        Assertions.assertEquals("hrvmzrqrazadi", model.configuration().privateLinkScope());
    }
}
