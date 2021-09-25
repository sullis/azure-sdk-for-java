// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CallLocatorTypeModel. */
public final class CallLocatorTypeModel extends ExpandableStringEnum<CallLocatorTypeModel> {
    /** Static value groupCallLocator for CallLocatorTypeModel. */
    public static final CallLocatorTypeModel GROUP_CALL_LOCATOR = fromString("groupCallLocator");

    /** Static value serverCallLocator for CallLocatorTypeModel. */
    public static final CallLocatorTypeModel SERVER_CALL_LOCATOR = fromString("serverCallLocator");

    /**
     * Creates or finds a CallLocatorTypeModel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CallLocatorTypeModel.
     */
    @JsonCreator
    public static CallLocatorTypeModel fromString(String name) {
        return fromString(name, CallLocatorTypeModel.class);
    }

    /** @return known CallLocatorTypeModel values. */
    public static Collection<CallLocatorTypeModel> values() {
        return values(CallLocatorTypeModel.class);
    }
}
