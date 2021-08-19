// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner;

/** An instance of this class provides access to all the operations defined in VendorSkusClient. */
public interface VendorSkusClient {
    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String vendorName, String skuName);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String vendorName, String skuName, Context context);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vendorName, String skuName);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vendorName, String skuName, Context context);

    /**
     * Gets information about the specified sku.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorSkuInner get(String vendorName, String skuName);

    /**
     * Gets information about the specified sku.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VendorSkuInner> getWithResponse(String vendorName, String skuName, Context context);

    /**
     * Creates or updates a sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param parameters Parameters supplied to the create or update sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sku sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VendorSkuInner>, VendorSkuInner> beginCreateOrUpdate(
        String vendorName, String skuName, VendorSkuInner parameters);

    /**
     * Creates or updates a sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param parameters Parameters supplied to the create or update sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sku sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VendorSkuInner>, VendorSkuInner> beginCreateOrUpdate(
        String vendorName, String skuName, VendorSkuInner parameters, Context context);

    /**
     * Creates or updates a sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param parameters Parameters supplied to the create or update sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sku sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorSkuInner createOrUpdate(String vendorName, String skuName, VendorSkuInner parameters);

    /**
     * Creates or updates a sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param parameters Parameters supplied to the create or update sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sku sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorSkuInner createOrUpdate(String vendorName, String skuName, VendorSkuInner parameters, Context context);

    /**
     * Lists all the skus of a vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list vendor sku API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorSkuInner> list(String vendorName);

    /**
     * Lists all the skus of a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list vendor sku API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorSkuInner> list(String vendorName, Context context);
}
