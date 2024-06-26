// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.avs.models.SegmentStatusEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentPortVif;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentProvisioningState;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NSX Segment Properties. */
@Fluent
public final class WorkloadNetworkSegmentProperties {
    /*
     * Display name of the segment.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Gateway which to connect segment to.
     */
    @JsonProperty(value = "connectedGateway")
    private String connectedGateway;

    /*
     * Subnet which to connect segment to.
     */
    @JsonProperty(value = "subnet")
    private WorkloadNetworkSegmentSubnet subnet;

    /*
     * Port Vif which segment is associated with.
     */
    @JsonProperty(value = "portVif", access = JsonProperty.Access.WRITE_ONLY)
    private List<WorkloadNetworkSegmentPortVif> portVif;

    /*
     * Segment status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SegmentStatusEnum status;

    /*
     * The provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadNetworkSegmentProvisioningState provisioningState;

    /*
     * NSX revision number.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /** Creates an instance of WorkloadNetworkSegmentProperties class. */
    public WorkloadNetworkSegmentProperties() {
    }

    /**
     * Get the displayName property: Display name of the segment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the segment.
     *
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkSegmentProperties object itself.
     */
    public WorkloadNetworkSegmentProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the connectedGateway property: Gateway which to connect segment to.
     *
     * @return the connectedGateway value.
     */
    public String connectedGateway() {
        return this.connectedGateway;
    }

    /**
     * Set the connectedGateway property: Gateway which to connect segment to.
     *
     * @param connectedGateway the connectedGateway value to set.
     * @return the WorkloadNetworkSegmentProperties object itself.
     */
    public WorkloadNetworkSegmentProperties withConnectedGateway(String connectedGateway) {
        this.connectedGateway = connectedGateway;
        return this;
    }

    /**
     * Get the subnet property: Subnet which to connect segment to.
     *
     * @return the subnet value.
     */
    public WorkloadNetworkSegmentSubnet subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Subnet which to connect segment to.
     *
     * @param subnet the subnet value to set.
     * @return the WorkloadNetworkSegmentProperties object itself.
     */
    public WorkloadNetworkSegmentProperties withSubnet(WorkloadNetworkSegmentSubnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the portVif property: Port Vif which segment is associated with.
     *
     * @return the portVif value.
     */
    public List<WorkloadNetworkSegmentPortVif> portVif() {
        return this.portVif;
    }

    /**
     * Get the status property: Segment status.
     *
     * @return the status value.
     */
    public SegmentStatusEnum status() {
        return this.status;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkloadNetworkSegmentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the revision property: NSX revision number.
     *
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: NSX revision number.
     *
     * @param revision the revision value to set.
     * @return the WorkloadNetworkSegmentProperties object itself.
     */
    public WorkloadNetworkSegmentProperties withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (portVif() != null) {
            portVif().forEach(e -> e.validate());
        }
    }
}
