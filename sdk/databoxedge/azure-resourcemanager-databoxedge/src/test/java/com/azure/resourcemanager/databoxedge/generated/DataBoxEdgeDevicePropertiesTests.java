// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.DataBoxEdgeDeviceProperties;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceStatus;
import org.junit.jupiter.api.Assertions;

public final class DataBoxEdgeDevicePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataBoxEdgeDeviceProperties model =
            BinaryData
                .fromString(
                    "{\"dataBoxEdgeDeviceStatus\":\"ReadyToSetup\",\"serialNumber\":\"rcgyn\",\"description\":\"cpecfvmmcoofs\",\"modelDescription\":\"zevgb\",\"deviceType\":\"DataBoxEdgeDevice\",\"friendlyName\":\"abcypmivk\",\"culture\":\"zuvccfwnfnbacfio\",\"deviceModel\":\"ebxetqgtzxdp\",\"deviceSoftwareVersion\":\"bqqwxrj\",\"deviceLocalCapacity\":1458668924048164836,\"timeZone\":\"nwsubisnj\",\"deviceHcsVersion\":\"pmng\",\"configuredRoleTypes\":[\"IOT\",\"Cognitive\"],\"nodeCount\":431293436}")
                .toObject(DataBoxEdgeDeviceProperties.class);
        Assertions.assertEquals(DataBoxEdgeDeviceStatus.READY_TO_SETUP, model.dataBoxEdgeDeviceStatus());
        Assertions.assertEquals("cpecfvmmcoofs", model.description());
        Assertions.assertEquals("zevgb", model.modelDescription());
        Assertions.assertEquals("abcypmivk", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataBoxEdgeDeviceProperties model =
            new DataBoxEdgeDeviceProperties()
                .withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus.READY_TO_SETUP)
                .withDescription("cpecfvmmcoofs")
                .withModelDescription("zevgb")
                .withFriendlyName("abcypmivk");
        model = BinaryData.fromObject(model).toObject(DataBoxEdgeDeviceProperties.class);
        Assertions.assertEquals(DataBoxEdgeDeviceStatus.READY_TO_SETUP, model.dataBoxEdgeDeviceStatus());
        Assertions.assertEquals("cpecfvmmcoofs", model.description());
        Assertions.assertEquals("zevgb", model.modelDescription());
        Assertions.assertEquals("abcypmivk", model.friendlyName());
    }
}
