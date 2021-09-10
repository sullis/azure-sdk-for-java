// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayAutoscaleConfiguration;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendHttpSettings;
import com.azure.resourcemanager.network.models.ApplicationGatewayCustomError;
import com.azure.resourcemanager.network.models.ApplicationGatewayFrontendIpConfiguration;
import com.azure.resourcemanager.network.models.ApplicationGatewayFrontendPort;
import com.azure.resourcemanager.network.models.ApplicationGatewayHttpListener;
import com.azure.resourcemanager.network.models.ApplicationGatewayOperationalState;
import com.azure.resourcemanager.network.models.ApplicationGatewayRewriteRuleSet;
import com.azure.resourcemanager.network.models.ApplicationGatewaySku;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslPolicy;
import com.azure.resourcemanager.network.models.ApplicationGatewayTrustedRootCertificate;
import com.azure.resourcemanager.network.models.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Application gateway resource.
 */
@Fluent
public final class ApplicationGatewayInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayInner.class);

    /*
     * Properties of the application gateway.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The identity of the application gateway, if configured.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the application gateway.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the
     * resource needs to come from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the
     * resource needs to come from.
     * 
     * @param zones the zones value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identity property: The identity of the application gateway, if
     * configured.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the application gateway, if
     * configured.
     * 
     * @param identity the identity value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the sku property: SKU of the application gateway resource.
     * 
     * @return the sku value.
     */
    public ApplicationGatewaySku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: SKU of the application gateway resource.
     * 
     * @param sku the sku value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSku(ApplicationGatewaySku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the sslPolicy property: SSL policy of the application gateway
     * resource.
     * 
     * @return the sslPolicy value.
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().sslPolicy();
    }

    /**
     * Set the sslPolicy property: SSL policy of the application gateway
     * resource.
     * 
     * @param sslPolicy the sslPolicy value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withSslPolicy(sslPolicy);
        return this;
    }

    /**
     * Get the operationalState property: Operational state of the application
     * gateway resource.
     * 
     * @return the operationalState value.
     */
    public ApplicationGatewayOperationalState operationalState() {
        return this.innerProperties() == null ? null : this.innerProperties().operationalState();
    }

    /**
     * Get the gatewayIpConfigurations property: Subnets of application the
     * gateway resource.
     * 
     * @return the gatewayIpConfigurations value.
     */
    public List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayIpConfigurations();
    }

    /**
     * Set the gatewayIpConfigurations property: Subnets of application the
     * gateway resource.
     * 
     * @param gatewayIpConfigurations the gatewayIpConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withGatewayIpConfigurations(List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withGatewayIpConfigurations(gatewayIpConfigurations);
        return this;
    }

    /**
     * Get the authenticationCertificates property: Authentication certificates
     * of the application gateway resource.
     * 
     * @return the authenticationCertificates value.
     */
    public List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationCertificates();
    }

    /**
     * Set the authenticationCertificates property: Authentication certificates
     * of the application gateway resource.
     * 
     * @param authenticationCertificates the authenticationCertificates value
     * to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAuthenticationCertificates(List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withAuthenticationCertificates(authenticationCertificates);
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Trusted Root certificates of
     * the application gateway resource.
     * 
     * @return the trustedRootCertificates value.
     */
    public List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedRootCertificates();
    }

    /**
     * Set the trustedRootCertificates property: Trusted Root certificates of
     * the application gateway resource.
     * 
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withTrustedRootCertificates(List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withTrustedRootCertificates(trustedRootCertificates);
        return this;
    }

    /**
     * Get the sslCertificates property: SSL certificates of the application
     * gateway resource.
     * 
     * @return the sslCertificates value.
     */
    public List<ApplicationGatewaySslCertificateInner> sslCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().sslCertificates();
    }

    /**
     * Set the sslCertificates property: SSL certificates of the application
     * gateway resource.
     * 
     * @param sslCertificates the sslCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslCertificates(List<ApplicationGatewaySslCertificateInner> sslCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withSslCertificates(sslCertificates);
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Frontend IP addresses of the
     * application gateway resource.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfigurations();
    }

    /**
     * Set the frontendIpConfigurations property: Frontend IP addresses of the
     * application gateway resource.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to
     * set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendIpConfigurations(List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfigurations(frontendIpConfigurations);
        return this;
    }

    /**
     * Get the frontendPorts property: Frontend ports of the application
     * gateway resource.
     * 
     * @return the frontendPorts value.
     */
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPorts();
    }

    /**
     * Set the frontendPorts property: Frontend ports of the application
     * gateway resource.
     * 
     * @param frontendPorts the frontendPorts value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withFrontendPorts(frontendPorts);
        return this;
    }

    /**
     * Get the probes property: Probes of the application gateway resource.
     * 
     * @return the probes value.
     */
    public List<ApplicationGatewayProbeInner> probes() {
        return this.innerProperties() == null ? null : this.innerProperties().probes();
    }

    /**
     * Set the probes property: Probes of the application gateway resource.
     * 
     * @param probes the probes value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProbes(List<ApplicationGatewayProbeInner> probes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withProbes(probes);
        return this;
    }

    /**
     * Get the backendAddressPools property: Backend address pool of the
     * application gateway resource.
     * 
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPools();
    }

    /**
     * Set the backendAddressPools property: Backend address pool of the
     * application gateway resource.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withBackendAddressPools(backendAddressPools);
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection property: Backend http settings of
     * the application gateway resource.
     * 
     * @return the backendHttpSettingsCollection value.
     */
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().backendHttpSettingsCollection();
    }

    /**
     * Set the backendHttpSettingsCollection property: Backend http settings of
     * the application gateway resource.
     * 
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection
     * value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withBackendHttpSettingsCollection(backendHttpSettingsCollection);
        return this;
    }

    /**
     * Get the httpListeners property: Http listeners of the application
     * gateway resource.
     * 
     * @return the httpListeners value.
     */
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.innerProperties() == null ? null : this.innerProperties().httpListeners();
    }

    /**
     * Set the httpListeners property: Http listeners of the application
     * gateway resource.
     * 
     * @param httpListeners the httpListeners value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withHttpListeners(httpListeners);
        return this;
    }

    /**
     * Get the urlPathMaps property: URL path map of the application gateway
     * resource.
     * 
     * @return the urlPathMaps value.
     */
    public List<ApplicationGatewayUrlPathMapInner> urlPathMaps() {
        return this.innerProperties() == null ? null : this.innerProperties().urlPathMaps();
    }

    /**
     * Set the urlPathMaps property: URL path map of the application gateway
     * resource.
     * 
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withUrlPathMaps(List<ApplicationGatewayUrlPathMapInner> urlPathMaps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withUrlPathMaps(urlPathMaps);
        return this;
    }

    /**
     * Get the requestRoutingRules property: Request routing rules of the
     * application gateway resource.
     * 
     * @return the requestRoutingRules value.
     */
    public List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().requestRoutingRules();
    }

    /**
     * Set the requestRoutingRules property: Request routing rules of the
     * application gateway resource.
     * 
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withRequestRoutingRules(requestRoutingRules);
        return this;
    }

    /**
     * Get the rewriteRuleSets property: Rewrite rules for the application
     * gateway resource.
     * 
     * @return the rewriteRuleSets value.
     */
    public List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().rewriteRuleSets();
    }

    /**
     * Set the rewriteRuleSets property: Rewrite rules for the application
     * gateway resource.
     * 
     * @param rewriteRuleSets the rewriteRuleSets value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRewriteRuleSets(List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withRewriteRuleSets(rewriteRuleSets);
        return this;
    }

    /**
     * Get the redirectConfigurations property: Redirect configurations of the
     * application gateway resource.
     * 
     * @return the redirectConfigurations value.
     */
    public List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().redirectConfigurations();
    }

    /**
     * Set the redirectConfigurations property: Redirect configurations of the
     * application gateway resource.
     * 
     * @param redirectConfigurations the redirectConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRedirectConfigurations(List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withRedirectConfigurations(redirectConfigurations);
        return this;
    }

    /**
     * Get the webApplicationFirewallConfiguration property: Web application
     * firewall configuration.
     * 
     * @return the webApplicationFirewallConfiguration value.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().webApplicationFirewallConfiguration();
    }

    /**
     * Set the webApplicationFirewallConfiguration property: Web application
     * firewall configuration.
     * 
     * @param webApplicationFirewallConfiguration the
     * webApplicationFirewallConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withWebApplicationFirewallConfiguration(ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withWebApplicationFirewallConfiguration(webApplicationFirewallConfiguration);
        return this;
    }

    /**
     * Get the enableHttp2 property: Whether HTTP2 is enabled on the
     * application gateway resource.
     * 
     * @return the enableHttp2 value.
     */
    public Boolean enableHttp2() {
        return this.innerProperties() == null ? null : this.innerProperties().enableHttp2();
    }

    /**
     * Set the enableHttp2 property: Whether HTTP2 is enabled on the
     * application gateway resource.
     * 
     * @param enableHttp2 the enableHttp2 value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableHttp2(Boolean enableHttp2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withEnableHttp2(enableHttp2);
        return this;
    }

    /**
     * Get the enableFips property: Whether FIPS is enabled on the application
     * gateway resource.
     * 
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFips();
    }

    /**
     * Set the enableFips property: Whether FIPS is enabled on the application
     * gateway resource.
     * 
     * @param enableFips the enableFips value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableFips(Boolean enableFips) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withEnableFips(enableFips);
        return this;
    }

    /**
     * Get the autoscaleConfiguration property: Autoscale Configuration.
     * 
     * @return the autoscaleConfiguration value.
     */
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().autoscaleConfiguration();
    }

    /**
     * Set the autoscaleConfiguration property: Autoscale Configuration.
     * 
     * @param autoscaleConfiguration the autoscaleConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAutoscaleConfiguration(ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withAutoscaleConfiguration(autoscaleConfiguration);
        return this;
    }

    /**
     * Get the resourceGuid property: Resource GUID property of the application
     * gateway resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Set the resourceGuid property: Resource GUID property of the application
     * gateway resource.
     * 
     * @param resourceGuid the resourceGuid value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withResourceGuid(String resourceGuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withResourceGuid(resourceGuid);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the
     * application gateway resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the
     * application gateway resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations
     * of the application gateway resource.
     * 
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().customErrorConfigurations();
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations
     * of the application gateway resource.
     * 
     * @param customErrorConfigurations the customErrorConfigurations value to
     * set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPropertiesFormat();
        }
        this.innerProperties().withCustomErrorConfigurations(customErrorConfigurations);
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
