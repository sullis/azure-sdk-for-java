// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HDInsightClusterProvisioningState. */
public final class HDInsightClusterProvisioningState extends ExpandableStringEnum<HDInsightClusterProvisioningState> {
    /** Static value InProgress for HDInsightClusterProvisioningState. */
    public static final HDInsightClusterProvisioningState IN_PROGRESS = fromString("InProgress");

    /** Static value Failed for HDInsightClusterProvisioningState. */
    public static final HDInsightClusterProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for HDInsightClusterProvisioningState. */
    public static final HDInsightClusterProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for HDInsightClusterProvisioningState. */
    public static final HDInsightClusterProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deleting for HDInsightClusterProvisioningState. */
    public static final HDInsightClusterProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a HDInsightClusterProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HDInsightClusterProvisioningState.
     */
    @JsonCreator
    public static HDInsightClusterProvisioningState fromString(String name) {
        return fromString(name, HDInsightClusterProvisioningState.class);
    }

    /** @return known HDInsightClusterProvisioningState values. */
    public static Collection<HDInsightClusterProvisioningState> values() {
        return values(HDInsightClusterProvisioningState.class);
    }
}
