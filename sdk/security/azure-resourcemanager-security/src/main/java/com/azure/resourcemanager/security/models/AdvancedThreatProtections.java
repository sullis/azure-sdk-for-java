// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AdvancedThreatProtections. */
public interface AdvancedThreatProtections {
    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    AdvancedThreatProtectionSetting get(String resourceId);

    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    Response<AdvancedThreatProtectionSetting> getWithResponse(String resourceId, Context context);

    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    AdvancedThreatProtectionSetting getById(String id);

    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    Response<AdvancedThreatProtectionSetting> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AdvancedThreatProtectionSetting resource.
     *
     * @return the first stage of the new AdvancedThreatProtectionSetting definition.
     */
    AdvancedThreatProtectionSetting.DefinitionStages.Blank define();
}
