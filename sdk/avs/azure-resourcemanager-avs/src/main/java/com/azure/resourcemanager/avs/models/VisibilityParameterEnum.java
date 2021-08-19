// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VisibilityParameterEnum. */
public final class VisibilityParameterEnum extends ExpandableStringEnum<VisibilityParameterEnum> {
    /** Static value Visible for VisibilityParameterEnum. */
    public static final VisibilityParameterEnum VISIBLE = fromString("Visible");

    /** Static value Hidden for VisibilityParameterEnum. */
    public static final VisibilityParameterEnum HIDDEN = fromString("Hidden");

    /**
     * Creates or finds a VisibilityParameterEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VisibilityParameterEnum.
     */
    @JsonCreator
    public static VisibilityParameterEnum fromString(String name) {
        return fromString(name, VisibilityParameterEnum.class);
    }

    /** @return known VisibilityParameterEnum values. */
    public static Collection<VisibilityParameterEnum> values() {
        return values(VisibilityParameterEnum.class);
    }
}
