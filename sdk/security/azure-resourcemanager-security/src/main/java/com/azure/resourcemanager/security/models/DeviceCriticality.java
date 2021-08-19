// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeviceCriticality. */
public final class DeviceCriticality extends ExpandableStringEnum<DeviceCriticality> {
    /** Static value Important for DeviceCriticality. */
    public static final DeviceCriticality IMPORTANT = fromString("Important");

    /** Static value Standard for DeviceCriticality. */
    public static final DeviceCriticality STANDARD = fromString("Standard");

    /**
     * Creates or finds a DeviceCriticality from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeviceCriticality.
     */
    @JsonCreator
    public static DeviceCriticality fromString(String name) {
        return fromString(name, DeviceCriticality.class);
    }

    /** @return known DeviceCriticality values. */
    public static Collection<DeviceCriticality> values() {
        return values(DeviceCriticality.class);
    }
}
