// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.models.AzureMonitorSelectedConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The azure monitor status response. */
@Fluent
public final class AzureMonitorResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureMonitorResponseInner.class);

    /*
     * The status of the monitor on the HDInsight cluster.
     */
    @JsonProperty(value = "clusterMonitoringEnabled")
    private Boolean clusterMonitoringEnabled;

    /*
     * The workspace ID of the monitor on the HDInsight cluster.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /*
     * The selected configurations.
     */
    @JsonProperty(value = "selectedConfigurations")
    private AzureMonitorSelectedConfigurations selectedConfigurations;

    /**
     * Get the clusterMonitoringEnabled property: The status of the monitor on the HDInsight cluster.
     *
     * @return the clusterMonitoringEnabled value.
     */
    public Boolean clusterMonitoringEnabled() {
        return this.clusterMonitoringEnabled;
    }

    /**
     * Set the clusterMonitoringEnabled property: The status of the monitor on the HDInsight cluster.
     *
     * @param clusterMonitoringEnabled the clusterMonitoringEnabled value to set.
     * @return the AzureMonitorResponseInner object itself.
     */
    public AzureMonitorResponseInner withClusterMonitoringEnabled(Boolean clusterMonitoringEnabled) {
        this.clusterMonitoringEnabled = clusterMonitoringEnabled;
        return this;
    }

    /**
     * Get the workspaceId property: The workspace ID of the monitor on the HDInsight cluster.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The workspace ID of the monitor on the HDInsight cluster.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the AzureMonitorResponseInner object itself.
     */
    public AzureMonitorResponseInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the selectedConfigurations property: The selected configurations.
     *
     * @return the selectedConfigurations value.
     */
    public AzureMonitorSelectedConfigurations selectedConfigurations() {
        return this.selectedConfigurations;
    }

    /**
     * Set the selectedConfigurations property: The selected configurations.
     *
     * @param selectedConfigurations the selectedConfigurations value to set.
     * @return the AzureMonitorResponseInner object itself.
     */
    public AzureMonitorResponseInner withSelectedConfigurations(
        AzureMonitorSelectedConfigurations selectedConfigurations) {
        this.selectedConfigurations = selectedConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (selectedConfigurations() != null) {
            selectedConfigurations().validate();
        }
    }
}
