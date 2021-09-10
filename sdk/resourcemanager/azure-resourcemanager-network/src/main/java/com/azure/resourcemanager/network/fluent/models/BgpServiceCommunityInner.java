// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.BgpCommunity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Service Community Properties.
 */
@Fluent
public final class BgpServiceCommunityInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(BgpServiceCommunityInner.class);

    /*
     * Properties of Service Community.
     */
    @JsonProperty(value = "properties")
    private BgpServiceCommunityPropertiesFormat innerProperties;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of Service Community.
     * 
     * @return the innerProperties value.
     */
    private BgpServiceCommunityPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BgpServiceCommunityInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BgpServiceCommunityInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the serviceName property: The name of the bgp community. e.g. Skype.
     * 
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceName();
    }

    /**
     * Set the serviceName property: The name of the bgp community. e.g. Skype.
     * 
     * @param serviceName the serviceName value to set.
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withServiceName(String serviceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpServiceCommunityPropertiesFormat();
        }
        this.innerProperties().withServiceName(serviceName);
        return this;
    }

    /**
     * Get the bgpCommunities property: Get a list of bgp communities.
     * 
     * @return the bgpCommunities value.
     */
    public List<BgpCommunity> bgpCommunities() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpCommunities();
    }

    /**
     * Set the bgpCommunities property: Get a list of bgp communities.
     * 
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withBgpCommunities(List<BgpCommunity> bgpCommunities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpServiceCommunityPropertiesFormat();
        }
        this.innerProperties().withBgpCommunities(bgpCommunities);
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
