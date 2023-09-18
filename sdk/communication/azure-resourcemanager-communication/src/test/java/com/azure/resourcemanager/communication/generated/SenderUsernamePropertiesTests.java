// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.SenderUsernameProperties;
import org.junit.jupiter.api.Assertions;

public final class SenderUsernamePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SenderUsernameProperties model =
            BinaryData
                .fromString(
                    "{\"dataLocation\":\"gshwankixz\",\"username\":\"injep\",\"displayName\":\"tmryw\",\"provisioningState\":\"Running\"}")
                .toObject(SenderUsernameProperties.class);
        Assertions.assertEquals("injep", model.username());
        Assertions.assertEquals("tmryw", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SenderUsernameProperties model = new SenderUsernameProperties().withUsername("injep").withDisplayName("tmryw");
        model = BinaryData.fromObject(model).toObject(SenderUsernameProperties.class);
        Assertions.assertEquals("injep", model.username());
        Assertions.assertEquals("tmryw", model.displayName());
    }
}
