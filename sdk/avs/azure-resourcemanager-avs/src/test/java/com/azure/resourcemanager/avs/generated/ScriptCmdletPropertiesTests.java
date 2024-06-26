// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletProperties;

public final class ScriptCmdletPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptCmdletProperties model =
            BinaryData
                .fromString(
                    "{\"description\":\"kh\",\"timeout\":\"ygo\",\"parameters\":[{\"type\":\"String\",\"name\":\"qjbvleorfmlu\",\"description\":\"tqzfavyv\",\"visibility\":\"Hidden\",\"optional\":\"Optional\"},{\"type\":\"Credential\",\"name\":\"euayjkqabqgzsles\",\"description\":\"bhernntiew\",\"visibility\":\"Visible\",\"optional\":\"Required\"},{\"type\":\"Credential\",\"name\":\"rbe\",\"description\":\"agohbuff\",\"visibility\":\"Hidden\",\"optional\":\"Optional\"}]}")
                .toObject(ScriptCmdletProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptCmdletProperties model = new ScriptCmdletProperties();
        model = BinaryData.fromObject(model).toObject(ScriptCmdletProperties.class);
    }
}
