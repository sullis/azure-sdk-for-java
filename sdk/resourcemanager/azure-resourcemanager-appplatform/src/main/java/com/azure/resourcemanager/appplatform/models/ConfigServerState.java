// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * State of the config server.
 */
public final class ConfigServerState extends ExpandableStringEnum<ConfigServerState> {
    /**
     * Static value NotAvailable for ConfigServerState.
     */
    public static final ConfigServerState NOT_AVAILABLE = fromString("NotAvailable");

    /**
     * Static value Deleted for ConfigServerState.
     */
    public static final ConfigServerState DELETED = fromString("Deleted");

    /**
     * Static value Failed for ConfigServerState.
     */
    public static final ConfigServerState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for ConfigServerState.
     */
    public static final ConfigServerState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Updating for ConfigServerState.
     */
    public static final ConfigServerState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ConfigServerState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConfigServerState() {
    }

    /**
     * Creates or finds a ConfigServerState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConfigServerState.
     */
    @JsonCreator
    public static ConfigServerState fromString(String name) {
        return fromString(name, ConfigServerState.class);
    }

    /**
     * Gets known ConfigServerState values.
     * 
     * @return known ConfigServerState values.
     */
    public static Collection<ConfigServerState> values() {
        return values(ConfigServerState.class);
    }
}
