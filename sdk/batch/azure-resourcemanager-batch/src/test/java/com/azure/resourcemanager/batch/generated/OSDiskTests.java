// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.CachingType;
import com.azure.resourcemanager.batch.models.DiffDiskPlacement;
import com.azure.resourcemanager.batch.models.DiffDiskSettings;
import com.azure.resourcemanager.batch.models.ManagedDisk;
import com.azure.resourcemanager.batch.models.OSDisk;
import com.azure.resourcemanager.batch.models.StorageAccountType;
import org.junit.jupiter.api.Assertions;

public final class OSDiskTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OSDisk model = BinaryData.fromString(
            "{\"ephemeralOSDiskSettings\":{\"placement\":\"CacheDisk\"},\"caching\":\"None\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"},\"diskSizeGB\":406179535,\"writeAcceleratorEnabled\":true}")
            .toObject(OSDisk.class);
        Assertions.assertEquals(DiffDiskPlacement.CACHE_DISK, model.ephemeralOSDiskSettings().placement());
        Assertions.assertEquals(CachingType.NONE, model.caching());
        Assertions.assertEquals(StorageAccountType.STANDARD_LRS, model.managedDisk().storageAccountType());
        Assertions.assertEquals(406179535, model.diskSizeGB());
        Assertions.assertEquals(true, model.writeAcceleratorEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OSDisk model = new OSDisk()
            .withEphemeralOSDiskSettings(new DiffDiskSettings().withPlacement(DiffDiskPlacement.CACHE_DISK))
            .withCaching(CachingType.NONE)
            .withManagedDisk(new ManagedDisk().withStorageAccountType(StorageAccountType.STANDARD_LRS))
            .withDiskSizeGB(406179535).withWriteAcceleratorEnabled(true);
        model = BinaryData.fromObject(model).toObject(OSDisk.class);
        Assertions.assertEquals(DiffDiskPlacement.CACHE_DISK, model.ephemeralOSDiskSettings().placement());
        Assertions.assertEquals(CachingType.NONE, model.caching());
        Assertions.assertEquals(StorageAccountType.STANDARD_LRS, model.managedDisk().storageAccountType());
        Assertions.assertEquals(406179535, model.diskSizeGB());
        Assertions.assertEquals(true, model.writeAcceleratorEnabled());
    }
}
