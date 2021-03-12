// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IotHubReplicaRoleType. */
public final class IotHubReplicaRoleType extends ExpandableStringEnum<IotHubReplicaRoleType> {
    /** Static value primary for IotHubReplicaRoleType. */
    public static final IotHubReplicaRoleType PRIMARY = fromString("primary");

    /** Static value secondary for IotHubReplicaRoleType. */
    public static final IotHubReplicaRoleType SECONDARY = fromString("secondary");

    /**
     * Creates or finds a IotHubReplicaRoleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IotHubReplicaRoleType.
     */
    @JsonCreator
    public static IotHubReplicaRoleType fromString(String name) {
        return fromString(name, IotHubReplicaRoleType.class);
    }

    /** @return known IotHubReplicaRoleType values. */
    public static Collection<IotHubReplicaRoleType> values() {
        return values(IotHubReplicaRoleType.class);
    }
}
