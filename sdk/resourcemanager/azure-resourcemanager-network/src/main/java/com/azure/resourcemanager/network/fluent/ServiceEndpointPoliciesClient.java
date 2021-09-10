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
import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyInner;
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
 * ServiceEndpointPoliciesClient.
 */
public interface ServiceEndpointPoliciesClient extends InnerSupportsGet<ServiceEndpointPolicyInner>, InnerSupportsListing<ServiceEndpointPolicyInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceEndpointPolicyName, Context context);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceEndpointPolicyName, Context context);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServiceEndpointPolicyInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, String expand);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyInner> getByResourceGroupAsync(String resourceGroupName, String serviceEndpointPolicyName, String expand);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyInner> getByResourceGroupAsync(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyInner getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceEndpointPolicyInner> getByResourceGroupWithResponse(String resourceGroupName, String serviceEndpointPolicyName, String expand, Context context);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginCreateOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginCreateOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters, Context context);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyInner> createOrUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyInner createOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters);

    /**
     * Creates or updates a service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to the create or update service endpoint policy operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyInner createOrUpdate(String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicyInner parameters, Context context);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginUpdateAsync(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginUpdate(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServiceEndpointPolicyInner>, ServiceEndpointPolicyInner> beginUpdate(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters, Context context);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyInner> updateAsync(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyInner update(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters);

    /**
     * Updates service Endpoint Policies.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Parameters supplied to update service endpoint policy tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyInner update(String resourceGroupName, String serviceEndpointPolicyName, TagsObject parameters, Context context);

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServiceEndpointPolicyInner> listAsync();

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyInner> list();

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyInner> list(Context context);

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServiceEndpointPolicyInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyInner> listByResourceGroup(String resourceGroupName, Context context);
}
