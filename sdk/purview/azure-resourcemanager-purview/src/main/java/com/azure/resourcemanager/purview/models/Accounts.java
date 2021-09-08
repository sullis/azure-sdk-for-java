// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Accounts. */
public interface Accounts {
    /**
     * List accounts in ResourceGroup.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of account resources.
     */
    PagedIterable<Account> listByResourceGroup(String resourceGroupName);

    /**
     * List accounts in ResourceGroup.
     *
     * @param resourceGroupName The resource group name.
     * @param skipToken The skip token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of account resources.
     */
    PagedIterable<Account> listByResourceGroup(String resourceGroupName, String skipToken, Context context);

    /**
     * List accounts in Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of account resources.
     */
    PagedIterable<Account> list();

    /**
     * List accounts in Subscription.
     *
     * @param skipToken The skip token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of account resources.
     */
    PagedIterable<Account> list(String skipToken, Context context);

    /**
     * Get an account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an account.
     */
    Account getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get an account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an account.
     */
    Response<Account> getByResourceGroupWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Deletes an account resource.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Deletes an account resource.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * List the authorization keys associated with this account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Account access keys.
     */
    AccessKeys listKeys(String resourceGroupName, String accountName);

    /**
     * List the authorization keys associated with this account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Account access keys.
     */
    Response<AccessKeys> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Add the administrator for root collection associated with this account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @param collectionAdminUpdate The collection admin update payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addRootCollectionAdmin(
        String resourceGroupName, String accountName, CollectionAdminUpdate collectionAdminUpdate);

    /**
     * Add the administrator for root collection associated with this account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName The name of the account.
     * @param collectionAdminUpdate The collection admin update payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> addRootCollectionAdminWithResponse(
        String resourceGroupName, String accountName, CollectionAdminUpdate collectionAdminUpdate, Context context);

    /**
     * Checks if account name is available.
     *
     * @param checkNameAvailabilityRequest The check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload for CheckNameAvailability API.
     */
    CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailabilityRequest checkNameAvailabilityRequest);

    /**
     * Checks if account name is available.
     *
     * @param checkNameAvailabilityRequest The check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload for CheckNameAvailability API.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context);

    /**
     * Get an account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an account.
     */
    Account getById(String id);

    /**
     * Get an account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an account.
     */
    Response<Account> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an account resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an account resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Account resource.
     *
     * @param name resource name.
     * @return the first stage of the new Account definition.
     */
    Account.DefinitionStages.Blank define(String name);
}
