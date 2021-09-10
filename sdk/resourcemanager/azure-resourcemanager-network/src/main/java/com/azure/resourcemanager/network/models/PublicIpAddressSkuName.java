// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PublicIpAddressSkuName.
 */
public final class PublicIpAddressSkuName extends ExpandableStringEnum<PublicIpAddressSkuName> {
    /**
     * Static value Basic for PublicIpAddressSkuName.
     */
    public static final PublicIpAddressSkuName BASIC = fromString("Basic");

    /**
     * Static value Standard for PublicIpAddressSkuName.
     */
    public static final PublicIpAddressSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a PublicIpAddressSkuName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicIpAddressSkuName.
     */
    @JsonCreator
    public static PublicIpAddressSkuName fromString(String name) {
        return fromString(name, PublicIpAddressSkuName.class);
    }

    /**
     * @return known PublicIpAddressSkuName values.
     */
    public static Collection<PublicIpAddressSkuName> values() {
        return values(PublicIpAddressSkuName.class);
    }
}
