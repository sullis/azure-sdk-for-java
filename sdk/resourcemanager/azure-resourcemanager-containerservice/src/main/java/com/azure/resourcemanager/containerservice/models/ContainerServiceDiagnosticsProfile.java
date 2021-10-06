// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for diagnostics on the container service cluster.
 */
@Fluent
public final class ContainerServiceDiagnosticsProfile {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ContainerServiceDiagnosticsProfile.class);

    /*
     * Profile for diagnostics on the container service VMs.
     */
    @JsonProperty(value = "vmDiagnostics", required = true)
    private ContainerServiceVMDiagnostics vmDiagnostics;

    /**
     * Get the vmDiagnostics property: Profile for diagnostics on the container
     * service VMs.
     * 
     * @return the vmDiagnostics value.
     */
    public ContainerServiceVMDiagnostics vmDiagnostics() {
        return this.vmDiagnostics;
    }

    /**
     * Set the vmDiagnostics property: Profile for diagnostics on the container
     * service VMs.
     * 
     * @param vmDiagnostics the vmDiagnostics value to set.
     * @return the ContainerServiceDiagnosticsProfile object itself.
     */
    public ContainerServiceDiagnosticsProfile withVmDiagnostics(ContainerServiceVMDiagnostics vmDiagnostics) {
        this.vmDiagnostics = vmDiagnostics;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmDiagnostics() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property vmDiagnostics in model ContainerServiceDiagnosticsProfile"));
        } else {
            vmDiagnostics().validate();
        }
    }
}
