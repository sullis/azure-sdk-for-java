// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.TransportProtocol;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Inbound NAT rule of the load balancer.
 */
@Fluent
public final class InboundNatRuleInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(InboundNatRuleInner.class);

    /*
     * Properties of load balancer inbound nat rule.
     */
    @JsonProperty(value = "properties")
    private InboundNatRulePropertiesFormatInner innerProperties;

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
     * Get the innerProperties property: Properties of load balancer inbound
     * nat rule.
     * 
     * @return the innerProperties value.
     */
    private InboundNatRulePropertiesFormatInner innerProperties() {
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
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withName(String name) {
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
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboundNatRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the frontendIpConfiguration property: A reference to frontend IP
     * addresses.
     * 
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfiguration();
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP
     * addresses.
     * 
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    /**
     * Get the backendIpConfiguration property: A reference to a private IP
     * address defined on a network interface of a VM. Traffic sent to the
     * frontend port of each of the frontend IP configurations is forwarded to
     * the backend IP.
     * 
     * @return the backendIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner backendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().backendIpConfiguration();
    }

    /**
     * Get the protocol property: The transport protocol for the endpoint.
     * Possible values are 'Udp' or 'Tcp' or 'All'.
     * 
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The transport protocol for the endpoint.
     * Possible values are 'Udp' or 'Tcp' or 'All'.
     * 
     * @param protocol the protocol value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withProtocol(TransportProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the frontendPort property: The port for the external endpoint. Port
     * numbers for each rule must be unique within the Load Balancer.
     * Acceptable values range from 1 to 65534.
     * 
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPort();
    }

    /**
     * Set the frontendPort property: The port for the external endpoint. Port
     * numbers for each rule must be unique within the Load Balancer.
     * Acceptable values range from 1 to 65534.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendPort(Integer frontendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withFrontendPort(frontendPort);
        return this;
    }

    /**
     * Get the backendPort property: The port used for the internal endpoint.
     * Acceptable values range from 1 to 65535.
     * 
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().backendPort();
    }

    /**
     * Set the backendPort property: The port used for the internal endpoint.
     * Acceptable values range from 1 to 65535.
     * 
     * @param backendPort the backendPort value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withBackendPort(Integer backendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withBackendPort(backendPort);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle
     * connection. The value can be set between 4 and 30 minutes. The default
     * value is 4 minutes. This element is only used when the protocol is set
     * to TCP.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle
     * connection. The value can be set between 4 and 30 minutes. The default
     * value is 4 minutes. This element is only used when the protocol is set
     * to TCP.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's
     * endpoint for the floating IP capability required to configure a SQL
     * AlwaysOn Availability Group. This setting is required when using the SQL
     * AlwaysOn Availability Groups in SQL server. This setting can't be
     * changed after you create the endpoint.
     * 
     * @return the enableFloatingIp value.
     */
    public Boolean enableFloatingIp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFloatingIp();
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's
     * endpoint for the floating IP capability required to configure a SQL
     * AlwaysOn Availability Group. This setting is required when using the SQL
     * AlwaysOn Availability Groups in SQL server. This setting can't be
     * changed after you create the endpoint.
     * 
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableFloatingIp(Boolean enableFloatingIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withEnableFloatingIp(enableFloatingIp);
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP
     * flow idle timeout or unexpected connection termination. This element is
     * only used when the protocol is set to TCP.
     * 
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTcpReset();
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP
     * flow idle timeout or unexpected connection termination. This element is
     * only used when the protocol is set to TCP.
     * 
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
        }
        this.innerProperties().withEnableTcpReset(enableTcpReset);
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
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatRulePropertiesFormatInner();
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
