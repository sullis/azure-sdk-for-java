// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import com.fasterxml.jackson.core.type.TypeReference;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualNetworkTapsClient.
 */
public interface VirtualNetworkTapsClient extends InnerSupportsGet<VirtualNetworkTapInner>, InnerSupportsListing<VirtualNetworkTapInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String tapName);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String tapName);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String tapName);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String tapName, Context context);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String tapName);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String tapName);

    /**
     * Deletes the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String tapName, Context context);

    /**
     * Gets information about the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified virtual network tap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VirtualNetworkTapInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String tapName);

    /**
     * Gets information about the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified virtual network tap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkTapInner> getByResourceGroupAsync(String resourceGroupName, String tapName);

    /**
     * Gets information about the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of virtual network tap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified virtual network tap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkTapInner getByResourceGroup(String resourceGroupName, String tapName);

    /**
     * Gets information about the specified virtual network tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of virtual network tap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified virtual network tap.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworkTapInner> getByResourceGroupWithResponse(String resourceGroupName, String tapName, Context context);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginCreateOrUpdateAsync(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginCreateOrUpdate(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginCreateOrUpdate(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters, Context context);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkTapInner> createOrUpdateAsync(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkTapInner createOrUpdate(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters);

    /**
     * Creates or updates a Virtual Network Tap.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the virtual network tap.
     * @param parameters Parameters supplied to the create or update virtual network tap operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkTapInner createOrUpdate(String resourceGroupName, String tapName, VirtualNetworkTapInner parameters, Context context);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String tapName, TagsObject tapParameters);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginUpdateTagsAsync(String resourceGroupName, String tapName, TagsObject tapParameters);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginUpdateTags(String resourceGroupName, String tapName, TagsObject tapParameters);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkTapInner>, VirtualNetworkTapInner> beginUpdateTags(String resourceGroupName, String tapName, TagsObject tapParameters, Context context);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkTapInner> updateTagsAsync(String resourceGroupName, String tapName, TagsObject tapParameters);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkTapInner updateTags(String resourceGroupName, String tapName, TagsObject tapParameters);

    /**
     * Updates an VirtualNetworkTap tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param tapName The name of the tap.
     * @param tapParameters Parameters supplied to update VirtualNetworkTap tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network Tap resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkTapInner updateTags(String resourceGroupName, String tapName, TagsObject tapParameters, Context context);

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualNetworkTapInner> listAsync();

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkTapInner> list();

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkTapInner> list(Context context);

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualNetworkTapInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkTapInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the VirtualNetworkTaps in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the VirtualNetworkTaps in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkTapInner> listByResourceGroup(String resourceGroupName, Context context);
}
