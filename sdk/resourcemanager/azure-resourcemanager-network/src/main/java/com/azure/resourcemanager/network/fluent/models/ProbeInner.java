// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProbeProtocol;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A load balancer probe.
 */
@Fluent
public final class ProbeInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ProbeInner.class);

    /*
     * Properties of load balancer probe.
     */
    @JsonProperty(value = "properties")
    private ProbePropertiesFormat innerProperties;

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of load balancer probe.
     * 
     * @return the innerProperties value.
     */
    private ProbePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProbeInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the loadBalancingRules property: The load balancer rules that use
     * this probe.
     * 
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingRules();
    }

    /**
     * Get the protocol property: The protocol of the end point. Possible
     * values are: 'Http', 'Tcp', or 'Https'. If 'Tcp' is specified, a received
     * ACK is required for the probe to be successful. If 'Http' or 'Https' is
     * specified, a 200 OK response from the specifies URI is required for the
     * probe to be successful.
     * 
     * @return the protocol value.
     */
    public ProbeProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol of the end point. Possible
     * values are: 'Http', 'Tcp', or 'Https'. If 'Tcp' is specified, a received
     * ACK is required for the probe to be successful. If 'Http' or 'Https' is
     * specified, a 200 OK response from the specifies URI is required for the
     * probe to be successful.
     * 
     * @param protocol the protocol value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withProtocol(ProbeProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the port property: The port for communicating the probe. Possible
     * values range from 1 to 65535, inclusive.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The port for communicating the probe. Possible
     * values range from 1 to 65535, inclusive.
     * 
     * @param port the port value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the intervalInSeconds property: The interval, in seconds, for how
     * frequently to probe the endpoint for health status. Typically, the
     * interval is slightly less than half the allocated timeout period (in
     * seconds) which allows two full probes before taking the instance out of
     * rotation. The default value is 15, the minimum value is 5.
     * 
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().intervalInSeconds();
    }

    /**
     * Set the intervalInSeconds property: The interval, in seconds, for how
     * frequently to probe the endpoint for health status. Typically, the
     * interval is slightly less than half the allocated timeout period (in
     * seconds) which allows two full probes before taking the instance out of
     * rotation. The default value is 15, the minimum value is 5.
     * 
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withIntervalInSeconds(Integer intervalInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * Get the numberOfProbes property: The number of probes where if no
     * response, will result in stopping further traffic from being delivered
     * to the endpoint. This values allows endpoints to be taken out of
     * rotation faster or slower than the typical times used in Azure.
     * 
     * @return the numberOfProbes value.
     */
    public Integer numberOfProbes() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfProbes();
    }

    /**
     * Set the numberOfProbes property: The number of probes where if no
     * response, will result in stopping further traffic from being delivered
     * to the endpoint. This values allows endpoints to be taken out of
     * rotation faster or slower than the typical times used in Azure.
     * 
     * @param numberOfProbes the numberOfProbes value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withNumberOfProbes(Integer numberOfProbes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withNumberOfProbes(numberOfProbes);
        return this;
    }

    /**
     * Get the requestPath property: The URI used for requesting health status
     * from the VM. Path is required if a protocol is set to http. Otherwise,
     * it is not allowed. There is no default value.
     * 
     * @return the requestPath value.
     */
    public String requestPath() {
        return this.innerProperties() == null ? null : this.innerProperties().requestPath();
    }

    /**
     * Set the requestPath property: The URI used for requesting health status
     * from the VM. Path is required if a protocol is set to http. Otherwise,
     * it is not allowed. There is no default value.
     * 
     * @param requestPath the requestPath value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withRequestPath(String requestPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withRequestPath(requestPath);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProbePropertiesFormat();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
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
