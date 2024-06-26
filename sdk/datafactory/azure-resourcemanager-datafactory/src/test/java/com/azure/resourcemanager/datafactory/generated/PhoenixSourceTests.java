// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PhoenixSource;

public final class PhoenixSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PhoenixSource model = BinaryData.fromString(
            "{\"type\":\"ancjlkrskzw\",\"query\":\"datajwlwysrswzhci\",\"queryTimeout\":\"dataskmqkanuxju\",\"additionalColumns\":\"datavzodnxlcdgkc\",\"sourceRetryCount\":\"databafqzihmvw\",\"sourceRetryWait\":\"datajwvqiahoqjz\",\"maxConcurrentConnections\":\"datavwdlrt\",\"disableMetricsCollection\":\"dataulmzxhgwz\",\"\":{\"p\":\"datatwuuwehntjssj\"}}")
            .toObject(PhoenixSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PhoenixSource model = new PhoenixSource().withSourceRetryCount("databafqzihmvw")
            .withSourceRetryWait("datajwvqiahoqjz")
            .withMaxConcurrentConnections("datavwdlrt")
            .withDisableMetricsCollection("dataulmzxhgwz")
            .withQueryTimeout("dataskmqkanuxju")
            .withAdditionalColumns("datavzodnxlcdgkc")
            .withQuery("datajwlwysrswzhci");
        model = BinaryData.fromObject(model).toObject(PhoenixSource.class);
    }
}
