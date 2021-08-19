// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import java.util.List;

/** An immutable client-side representation of IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse. */
public interface IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse {
    /**
     * Gets the value property: The list of outbound network dependency endpoints.
     *
     * @return the value value.
     */
    List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value();

    /**
     * Gets the inner
     * com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner
     * object.
     *
     * @return the inner object.
     */
    IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner innerModel();
}
