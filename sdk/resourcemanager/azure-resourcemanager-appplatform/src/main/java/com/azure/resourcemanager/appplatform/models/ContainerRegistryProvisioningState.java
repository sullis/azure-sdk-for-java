// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * State of the Container Registry.
 */
public final class ContainerRegistryProvisioningState extends ExpandableStringEnum<ContainerRegistryProvisioningState> {
    /**
     * Static value Creating for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Succeeded for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleting for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Canceled for ContainerRegistryProvisioningState.
     */
    public static final ContainerRegistryProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of ContainerRegistryProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContainerRegistryProvisioningState() {
    }

    /**
     * Creates or finds a ContainerRegistryProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContainerRegistryProvisioningState.
     */
    @JsonCreator
    public static ContainerRegistryProvisioningState fromString(String name) {
        return fromString(name, ContainerRegistryProvisioningState.class);
    }

    /**
     * Gets known ContainerRegistryProvisioningState values.
     * 
     * @return known ContainerRegistryProvisioningState values.
     */
    public static Collection<ContainerRegistryProvisioningState> values() {
        return values(ContainerRegistryProvisioningState.class);
    }
}
