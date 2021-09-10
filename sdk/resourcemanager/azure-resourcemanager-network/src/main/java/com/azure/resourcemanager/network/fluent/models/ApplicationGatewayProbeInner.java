// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayProbeHealthResponseMatch;
import com.azure.resourcemanager.network.models.ApplicationGatewayProtocol;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Probe of the application gateway.
 */
@Fluent
public final class ApplicationGatewayProbeInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayProbeInner.class);

    /*
     * Properties of probe of an application gateway.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayProbePropertiesFormat innerProperties;

    /*
     * Name of the probe that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the innerProperties property: Properties of probe of an application
     * gateway.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayProbePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the probe that is unique within an
     * Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the probe that is unique within an
     * Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withName(String name) {
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
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayProbeInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the protocol property: The protocol used for the probe. Possible
     * values are 'Http' and 'Https'.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol used for the probe. Possible
     * values are 'Http' and 'Https'.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withProtocol(ApplicationGatewayProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the host property: Host name to send the probe to.
     * 
     * @return the host value.
     */
    public String host() {
        return this.innerProperties() == null ? null : this.innerProperties().host();
    }

    /**
     * Set the host property: Host name to send the probe to.
     * 
     * @param host the host value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withHost(String host) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withHost(host);
        return this;
    }

    /**
     * Get the path property: Relative path of probe. Valid path starts from
     * '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Relative path of probe. Valid path starts from
     * '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @param path the path value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the interval property: The probing interval in seconds. This is the
     * time interval between two consecutive probes. Acceptable values are from
     * 1 second to 86400 seconds.
     * 
     * @return the interval value.
     */
    public Integer interval() {
        return this.innerProperties() == null ? null : this.innerProperties().interval();
    }

    /**
     * Set the interval property: The probing interval in seconds. This is the
     * time interval between two consecutive probes. Acceptable values are from
     * 1 second to 86400 seconds.
     * 
     * @param interval the interval value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withInterval(Integer interval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withInterval(interval);
        return this;
    }

    /**
     * Get the timeout property: the probe timeout in seconds. Probe marked as
     * failed if valid response is not received with this timeout period.
     * Acceptable values are from 1 second to 86400 seconds.
     * 
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Set the timeout property: the probe timeout in seconds. Probe marked as
     * failed if valid response is not received with this timeout period.
     * Acceptable values are from 1 second to 86400 seconds.
     * 
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withTimeout(Integer timeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the unhealthyThreshold property: The probe retry count. Backend
     * server is marked down after consecutive probe failure count reaches
     * UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
     * @return the unhealthyThreshold value.
     */
    public Integer unhealthyThreshold() {
        return this.innerProperties() == null ? null : this.innerProperties().unhealthyThreshold();
    }

    /**
     * Set the unhealthyThreshold property: The probe retry count. Backend
     * server is marked down after consecutive probe failure count reaches
     * UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
     * @param unhealthyThreshold the unhealthyThreshold value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withUnhealthyThreshold(Integer unhealthyThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withUnhealthyThreshold(unhealthyThreshold);
        return this;
    }

    /**
     * Get the pickHostnameFromBackendHttpSettings property: Whether the host
     * header should be picked from the backend http settings. Default value is
     * false.
     * 
     * @return the pickHostnameFromBackendHttpSettings value.
     */
    public Boolean pickHostnameFromBackendHttpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().pickHostnameFromBackendHttpSettings();
    }

    /**
     * Set the pickHostnameFromBackendHttpSettings property: Whether the host
     * header should be picked from the backend http settings. Default value is
     * false.
     * 
     * @param pickHostnameFromBackendHttpSettings the
     * pickHostnameFromBackendHttpSettings value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPickHostnameFromBackendHttpSettings(Boolean pickHostnameFromBackendHttpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPickHostnameFromBackendHttpSettings(pickHostnameFromBackendHttpSettings);
        return this;
    }

    /**
     * Get the minServers property: Minimum number of servers that are always
     * marked healthy. Default value is 0.
     * 
     * @return the minServers value.
     */
    public Integer minServers() {
        return this.innerProperties() == null ? null : this.innerProperties().minServers();
    }

    /**
     * Set the minServers property: Minimum number of servers that are always
     * marked healthy. Default value is 0.
     * 
     * @param minServers the minServers value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMinServers(Integer minServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withMinServers(minServers);
        return this;
    }

    /**
     * Get the match property: Criterion for classifying a healthy probe
     * response.
     * 
     * @return the match value.
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.innerProperties() == null ? null : this.innerProperties().match();
    }

    /**
     * Set the match property: Criterion for classifying a healthy probe
     * response.
     * 
     * @param match the match value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withMatch(match);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend
     * http settings resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend
     * http settings resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
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
