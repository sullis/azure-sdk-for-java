// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecuritySolutionStatus. */
public final class SecuritySolutionStatus extends ExpandableStringEnum<SecuritySolutionStatus> {
    /** Static value Enabled for SecuritySolutionStatus. */
    public static final SecuritySolutionStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SecuritySolutionStatus. */
    public static final SecuritySolutionStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SecuritySolutionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecuritySolutionStatus.
     */
    @JsonCreator
    public static SecuritySolutionStatus fromString(String name) {
        return fromString(name, SecuritySolutionStatus.class);
    }

    /** @return known SecuritySolutionStatus values. */
    public static Collection<SecuritySolutionStatus> values() {
        return values(SecuritySolutionStatus.class);
    }
}
