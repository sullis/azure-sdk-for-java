// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemCheckSubnetError;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemCheckSubnetErrorFilesystemSubnet;
import com.azure.resourcemanager.storagecache.models.FilesystemSubnetStatusType;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemCheckSubnetErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemCheckSubnetError model
            = BinaryData.fromString("{\"filesystemSubnet\":{\"status\":\"Ok\",\"message\":\"xsabkyqdu\"}}")
                .toObject(AmlFilesystemCheckSubnetError.class);
        Assertions.assertEquals(FilesystemSubnetStatusType.OK, model.filesystemSubnet().status());
        Assertions.assertEquals("xsabkyqdu", model.filesystemSubnet().message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemCheckSubnetError model = new AmlFilesystemCheckSubnetError()
            .withFilesystemSubnet(new AmlFilesystemCheckSubnetErrorFilesystemSubnet()
                .withStatus(FilesystemSubnetStatusType.OK).withMessage("xsabkyqdu"));
        model = BinaryData.fromObject(model).toObject(AmlFilesystemCheckSubnetError.class);
        Assertions.assertEquals(FilesystemSubnetStatusType.OK, model.filesystemSubnet().status());
        Assertions.assertEquals("xsabkyqdu", model.filesystemSubnet().message());
    }
}
