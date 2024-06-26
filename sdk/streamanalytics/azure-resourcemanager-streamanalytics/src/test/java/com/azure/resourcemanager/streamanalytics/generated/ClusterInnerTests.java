// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterInner;
import com.azure.resourcemanager.streamanalytics.models.ClusterProperties;
import com.azure.resourcemanager.streamanalytics.models.ClusterSku;
import com.azure.resourcemanager.streamanalytics.models.ClusterSkuName;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInner model = BinaryData.fromString(
            "{\"sku\":{\"name\":\"Default\",\"capacity\":357365351},\"etag\":\"zzmhjrunmpxttd\",\"properties\":{\"createdDate\":\"2020-12-21T00:54:21Z\",\"clusterId\":\"l\",\"provisioningState\":\"Succeeded\",\"capacityAllocated\":1850668583,\"capacityAssigned\":1795094625},\"location\":\"k\",\"tags\":{\"nrs\":\"enbtkcxywny\",\"lhaaxdbabp\":\"nlqidybyxczf\",\"fkts\":\"lwrq\",\"nyyazttbtwwrqpue\":\"hsucoc\"},\"id\":\"ckzywbiexzfeyue\",\"name\":\"xibxujwbhqwalm\",\"type\":\"zyoxaepdkzjan\"}")
            .toObject(ClusterInner.class);
        Assertions.assertEquals("k", model.location());
        Assertions.assertEquals("enbtkcxywny", model.tags().get("nrs"));
        Assertions.assertEquals(ClusterSkuName.DEFAULT, model.sku().name());
        Assertions.assertEquals(357365351, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInner model = new ClusterInner().withLocation("k")
            .withTags(
                mapOf("nrs", "enbtkcxywny", "lhaaxdbabp", "nlqidybyxczf", "fkts", "lwrq", "nyyazttbtwwrqpue", "hsucoc"))
            .withSku(new ClusterSku().withName(ClusterSkuName.DEFAULT).withCapacity(357365351))
            .withProperties(new ClusterProperties());
        model = BinaryData.fromObject(model).toObject(ClusterInner.class);
        Assertions.assertEquals("k", model.location());
        Assertions.assertEquals("enbtkcxywny", model.tags().get("nrs"));
        Assertions.assertEquals(ClusterSkuName.DEFAULT, model.sku().name());
        Assertions.assertEquals(357365351, model.sku().capacity());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
