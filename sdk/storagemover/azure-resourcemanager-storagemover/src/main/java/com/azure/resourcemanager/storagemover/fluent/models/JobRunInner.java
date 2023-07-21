// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storagemover.models.JobRunError;
import com.azure.resourcemanager.storagemover.models.JobRunScanStatus;
import com.azure.resourcemanager.storagemover.models.JobRunStatus;
import com.azure.resourcemanager.storagemover.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Job Run resource. */
@Immutable
public final class JobRunInner extends ProxyResource {
    /*
     * Job run properties.
     */
    @JsonProperty(value = "properties")
    private JobRunProperties innerProperties;

    /** Creates an instance of JobRunInner class. */
    public JobRunInner() {
    }

    /**
     * Get the innerProperties property: Job run properties.
     *
     * @return the innerProperties value.
     */
    private JobRunProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: The state of the job execution.
     *
     * @return the status value.
     */
    public JobRunStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the scanStatus property: The status of Agent's scanning of source.
     *
     * @return the scanStatus value.
     */
    public JobRunScanStatus scanStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().scanStatus();
    }

    /**
     * Get the agentName property: Name of the Agent assigned to this run.
     *
     * @return the agentName value.
     */
    public String agentName() {
        return this.innerProperties() == null ? null : this.innerProperties().agentName();
    }

    /**
     * Get the agentResourceId property: Fully qualified resource id of the Agent assigned to this run.
     *
     * @return the agentResourceId value.
     */
    public String agentResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().agentResourceId();
    }

    /**
     * Get the executionStartTime property: Start time of the run. Null if no Agent reported that the job has started.
     *
     * @return the executionStartTime value.
     */
    public OffsetDateTime executionStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().executionStartTime();
    }

    /**
     * Get the executionEndTime property: End time of the run. Null if Agent has not reported that the job has ended.
     *
     * @return the executionEndTime value.
     */
    public OffsetDateTime executionEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().executionEndTime();
    }

    /**
     * Get the lastStatusUpdate property: The last updated time of the Job Run.
     *
     * @return the lastStatusUpdate value.
     */
    public OffsetDateTime lastStatusUpdate() {
        return this.innerProperties() == null ? null : this.innerProperties().lastStatusUpdate();
    }

    /**
     * Get the itemsScanned property: Number of items scanned so far in source.
     *
     * @return the itemsScanned value.
     */
    public Long itemsScanned() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsScanned();
    }

    /**
     * Get the itemsExcluded property: Number of items that will not be transferred, as they are excluded by user
     * configuration.
     *
     * @return the itemsExcluded value.
     */
    public Long itemsExcluded() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsExcluded();
    }

    /**
     * Get the itemsUnsupported property: Number of items that will not be transferred, as they are unsupported on
     * target.
     *
     * @return the itemsUnsupported value.
     */
    public Long itemsUnsupported() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsUnsupported();
    }

    /**
     * Get the itemsNoTransferNeeded property: Number of items that will not be transferred, as they are already found
     * on target (e.g. mirror mode).
     *
     * @return the itemsNoTransferNeeded value.
     */
    public Long itemsNoTransferNeeded() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsNoTransferNeeded();
    }

    /**
     * Get the itemsFailed property: Number of items that were attempted to transfer and failed.
     *
     * @return the itemsFailed value.
     */
    public Long itemsFailed() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsFailed();
    }

    /**
     * Get the itemsTransferred property: Number of items successfully transferred to target.
     *
     * @return the itemsTransferred value.
     */
    public Long itemsTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsTransferred();
    }

    /**
     * Get the bytesScanned property: Bytes of data scanned so far in source.
     *
     * @return the bytesScanned value.
     */
    public Long bytesScanned() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesScanned();
    }

    /**
     * Get the bytesExcluded property: Bytes of data that will not be transferred, as they are excluded by user
     * configuration.
     *
     * @return the bytesExcluded value.
     */
    public Long bytesExcluded() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesExcluded();
    }

    /**
     * Get the bytesUnsupported property: Bytes of data that will not be transferred, as they are unsupported on target.
     *
     * @return the bytesUnsupported value.
     */
    public Long bytesUnsupported() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesUnsupported();
    }

    /**
     * Get the bytesNoTransferNeeded property: Bytes of data that will not be transferred, as they are already found on
     * target (e.g. mirror mode).
     *
     * @return the bytesNoTransferNeeded value.
     */
    public Long bytesNoTransferNeeded() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesNoTransferNeeded();
    }

    /**
     * Get the bytesFailed property: Bytes of data that were attempted to transfer and failed.
     *
     * @return the bytesFailed value.
     */
    public Long bytesFailed() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesFailed();
    }

    /**
     * Get the bytesTransferred property: Bytes of data successfully transferred to target.
     *
     * @return the bytesTransferred value.
     */
    public Long bytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesTransferred();
    }

    /**
     * Get the sourceName property: Name of source Endpoint resource. This resource may no longer exist.
     *
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceName();
    }

    /**
     * Get the sourceResourceId property: Fully qualified resource id of source Endpoint. This id may no longer exist.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceId();
    }

    /**
     * Get the sourceProperties property: Copy of source Endpoint resource's properties at time of Job Run creation.
     *
     * @return the sourceProperties value.
     */
    public Object sourceProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceProperties();
    }

    /**
     * Get the targetName property: Name of target Endpoint resource. This resource may no longer exist.
     *
     * @return the targetName value.
     */
    public String targetName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetName();
    }

    /**
     * Get the targetResourceId property: Fully qualified resource id of of Endpoint. This id may no longer exist.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceId();
    }

    /**
     * Get the targetProperties property: Copy of Endpoint resource's properties at time of Job Run creation.
     *
     * @return the targetProperties value.
     */
    public Object targetProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().targetProperties();
    }

    /**
     * Get the jobDefinitionProperties property: Copy of parent Job Definition's properties at time of Job Run creation.
     *
     * @return the jobDefinitionProperties value.
     */
    public Object jobDefinitionProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().jobDefinitionProperties();
    }

    /**
     * Get the error property: Error details.
     *
     * @return the error value.
     */
    public JobRunError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Get the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
