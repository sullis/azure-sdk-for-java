// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for OutboundRulePropertiesFormatProtocol.
 */
public final class OutboundRulePropertiesFormatProtocol extends ExpandableStringEnum<OutboundRulePropertiesFormatProtocol> {
    /**
     * Static value Tcp for OutboundRulePropertiesFormatProtocol.
     */
    public static final OutboundRulePropertiesFormatProtocol TCP = fromString("Tcp");

    /**
     * Static value Udp for OutboundRulePropertiesFormatProtocol.
     */
    public static final OutboundRulePropertiesFormatProtocol UDP = fromString("Udp");

    /**
     * Static value All for OutboundRulePropertiesFormatProtocol.
     */
    public static final OutboundRulePropertiesFormatProtocol ALL = fromString("All");

    /**
     * Creates or finds a OutboundRulePropertiesFormatProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OutboundRulePropertiesFormatProtocol.
     */
    @JsonCreator
    public static OutboundRulePropertiesFormatProtocol fromString(String name) {
        return fromString(name, OutboundRulePropertiesFormatProtocol.class);
    }

    /**
     * @return known OutboundRulePropertiesFormatProtocol values.
     */
    public static Collection<OutboundRulePropertiesFormatProtocol> values() {
        return values(OutboundRulePropertiesFormatProtocol.class);
    }
}
