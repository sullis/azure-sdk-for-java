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
import com.azure.resourcemanager.network.fluent.models.RouteFilterInner;
import com.azure.resourcemanager.network.models.PatchRouteFilter;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import com.fasterxml.jackson.core.type.TypeReference;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RouteFiltersClient.
 */
public interface RouteFiltersClient extends InnerSupportsGet<RouteFilterInner>, InnerSupportsListing<RouteFilterInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String routeFilterName);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String routeFilterName);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeFilterName);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeFilterName, Context context);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String routeFilterName);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeFilterName);

    /**
     * Deletes the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeFilterName, Context context);

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param expand Expands referenced express route bgp peering resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteFilterInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String routeFilterName, String expand);

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param expand Expands referenced express route bgp peering resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterInner> getByResourceGroupAsync(String resourceGroupName, String routeFilterName, String expand);

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterInner> getByResourceGroupAsync(String resourceGroupName, String routeFilterName);

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterInner getByResourceGroup(String resourceGroupName, String routeFilterName);

    /**
     * Gets the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param expand Expands referenced express route bgp peering resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RouteFilterInner> getByResourceGroupWithResponse(String resourceGroupName, String routeFilterName, String expand, Context context);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteFilterInner>, RouteFilterInner> beginCreateOrUpdateAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterInner>, RouteFilterInner> beginCreateOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterInner>, RouteFilterInner> beginCreateOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters, Context context);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterInner> createOrUpdateAsync(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterInner createOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters);

    /**
     * Creates or updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the create or update route filter operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterInner createOrUpdate(String resourceGroupName, String routeFilterName, RouteFilterInner routeFilterParameters, Context context);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteFilterInner>, RouteFilterInner> beginUpdateAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterInner>, RouteFilterInner> beginUpdate(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterInner>, RouteFilterInner> beginUpdate(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters, Context context);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterInner> updateAsync(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterInner update(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters);

    /**
     * Updates a route filter in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Parameters supplied to the update route filter operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterInner update(String resourceGroupName, String routeFilterName, PatchRouteFilter routeFilterParameters, Context context);

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteFilterInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all route filters in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all route filters in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteFilterInner> listAsync();

    /**
     * Gets all route filters in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterInner> list();

    /**
     * Gets all route filters in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterInner> list(Context context);
}
