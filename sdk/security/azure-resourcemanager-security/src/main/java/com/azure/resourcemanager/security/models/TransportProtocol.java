// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TransportProtocol. */
public final class TransportProtocol extends ExpandableStringEnum<TransportProtocol> {
    /** Static value TCP for TransportProtocol. */
    public static final TransportProtocol TCP = fromString("TCP");

    /** Static value UDP for TransportProtocol. */
    public static final TransportProtocol UDP = fromString("UDP");

    /**
     * Creates or finds a TransportProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransportProtocol.
     */
    @JsonCreator
    public static TransportProtocol fromString(String name) {
        return fromString(name, TransportProtocol.class);
    }

    /** @return known TransportProtocol values. */
    public static Collection<TransportProtocol> values() {
        return values(TransportProtocol.class);
    }
}
