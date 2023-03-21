// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.models.ContactsPropertiesAntennaConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContactsPropertiesAntennaConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactsPropertiesAntennaConfiguration model =
            BinaryData
                .fromString("{\"destinationIp\":\"jdkirsoodqx\",\"sourceIps\":[\"mnoh\",\"t\"]}")
                .toObject(ContactsPropertiesAntennaConfiguration.class);
        Assertions.assertEquals("jdkirsoodqx", model.destinationIp());
        Assertions.assertEquals("mnoh", model.sourceIps().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactsPropertiesAntennaConfiguration model =
            new ContactsPropertiesAntennaConfiguration()
                .withDestinationIp("jdkirsoodqx")
                .withSourceIps(Arrays.asList("mnoh", "t"));
        model = BinaryData.fromObject(model).toObject(ContactsPropertiesAntennaConfiguration.class);
        Assertions.assertEquals("jdkirsoodqx", model.destinationIp());
        Assertions.assertEquals("mnoh", model.sourceIps().get(0));
    }
}
