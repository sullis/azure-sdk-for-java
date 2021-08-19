// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner;

/** An immutable client-side representation of VendorSku. */
public interface VendorSku {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the vendor sku sub resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the skuType property: The sku type.
     *
     * @return the skuType value.
     */
    SkuType skuType();

    /**
     * Gets the deploymentMode property: The sku deployment mode.
     *
     * @return the deploymentMode value.
     */
    SkuDeploymentMode deploymentMode();

    /**
     * Gets the networkFunctionType property: The network function type.
     *
     * @return the networkFunctionType value.
     */
    NetworkFunctionType networkFunctionType();

    /**
     * Gets the preview property: Indicates if the vendor sku is in preview mode.
     *
     * @return the preview value.
     */
    Boolean preview();

    /**
     * Gets the managedApplicationParameters property: The parameters for the managed application to be supplied by the
     * vendor.
     *
     * @return the managedApplicationParameters value.
     */
    Object managedApplicationParameters();

    /**
     * Gets the managedApplicationTemplate property: The template for the managed application deployment.
     *
     * @return the managedApplicationTemplate value.
     */
    Object managedApplicationTemplate();

    /**
     * Gets the networkFunctionTemplate property: The template definition of the network function.
     *
     * @return the networkFunctionTemplate value.
     */
    NetworkFunctionTemplate networkFunctionTemplate();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner object.
     *
     * @return the inner object.
     */
    VendorSkuInner innerModel();

    /** The entirety of the VendorSku definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The VendorSku definition stages. */
    interface DefinitionStages {
        /** The first stage of the VendorSku definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the VendorSku definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies vendorName.
             *
             * @param vendorName The name of the vendor.
             * @return the next definition stage.
             */
            WithCreate withExistingVendor(String vendorName);
        }
        /**
         * The stage of the VendorSku definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithSkuType,
                DefinitionStages.WithDeploymentMode,
                DefinitionStages.WithNetworkFunctionType,
                DefinitionStages.WithPreview,
                DefinitionStages.WithManagedApplicationParameters,
                DefinitionStages.WithManagedApplicationTemplate,
                DefinitionStages.WithNetworkFunctionTemplate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VendorSku create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VendorSku create(Context context);
        }
        /** The stage of the VendorSku definition allowing to specify skuType. */
        interface WithSkuType {
            /**
             * Specifies the skuType property: The sku type..
             *
             * @param skuType The sku type.
             * @return the next definition stage.
             */
            WithCreate withSkuType(SkuType skuType);
        }
        /** The stage of the VendorSku definition allowing to specify deploymentMode. */
        interface WithDeploymentMode {
            /**
             * Specifies the deploymentMode property: The sku deployment mode..
             *
             * @param deploymentMode The sku deployment mode.
             * @return the next definition stage.
             */
            WithCreate withDeploymentMode(SkuDeploymentMode deploymentMode);
        }
        /** The stage of the VendorSku definition allowing to specify networkFunctionType. */
        interface WithNetworkFunctionType {
            /**
             * Specifies the networkFunctionType property: The network function type..
             *
             * @param networkFunctionType The network function type.
             * @return the next definition stage.
             */
            WithCreate withNetworkFunctionType(NetworkFunctionType networkFunctionType);
        }
        /** The stage of the VendorSku definition allowing to specify preview. */
        interface WithPreview {
            /**
             * Specifies the preview property: Indicates if the vendor sku is in preview mode..
             *
             * @param preview Indicates if the vendor sku is in preview mode.
             * @return the next definition stage.
             */
            WithCreate withPreview(Boolean preview);
        }
        /** The stage of the VendorSku definition allowing to specify managedApplicationParameters. */
        interface WithManagedApplicationParameters {
            /**
             * Specifies the managedApplicationParameters property: The parameters for the managed application to be
             * supplied by the vendor..
             *
             * @param managedApplicationParameters The parameters for the managed application to be supplied by the
             *     vendor.
             * @return the next definition stage.
             */
            WithCreate withManagedApplicationParameters(Object managedApplicationParameters);
        }
        /** The stage of the VendorSku definition allowing to specify managedApplicationTemplate. */
        interface WithManagedApplicationTemplate {
            /**
             * Specifies the managedApplicationTemplate property: The template for the managed application deployment..
             *
             * @param managedApplicationTemplate The template for the managed application deployment.
             * @return the next definition stage.
             */
            WithCreate withManagedApplicationTemplate(Object managedApplicationTemplate);
        }
        /** The stage of the VendorSku definition allowing to specify networkFunctionTemplate. */
        interface WithNetworkFunctionTemplate {
            /**
             * Specifies the networkFunctionTemplate property: The template definition of the network function..
             *
             * @param networkFunctionTemplate The template definition of the network function.
             * @return the next definition stage.
             */
            WithCreate withNetworkFunctionTemplate(NetworkFunctionTemplate networkFunctionTemplate);
        }
    }
    /**
     * Begins update for the VendorSku resource.
     *
     * @return the stage of resource update.
     */
    VendorSku.Update update();

    /** The template for VendorSku update. */
    interface Update
        extends UpdateStages.WithSkuType,
            UpdateStages.WithDeploymentMode,
            UpdateStages.WithNetworkFunctionType,
            UpdateStages.WithPreview,
            UpdateStages.WithManagedApplicationParameters,
            UpdateStages.WithManagedApplicationTemplate,
            UpdateStages.WithNetworkFunctionTemplate {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VendorSku apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VendorSku apply(Context context);
    }
    /** The VendorSku update stages. */
    interface UpdateStages {
        /** The stage of the VendorSku update allowing to specify skuType. */
        interface WithSkuType {
            /**
             * Specifies the skuType property: The sku type..
             *
             * @param skuType The sku type.
             * @return the next definition stage.
             */
            Update withSkuType(SkuType skuType);
        }
        /** The stage of the VendorSku update allowing to specify deploymentMode. */
        interface WithDeploymentMode {
            /**
             * Specifies the deploymentMode property: The sku deployment mode..
             *
             * @param deploymentMode The sku deployment mode.
             * @return the next definition stage.
             */
            Update withDeploymentMode(SkuDeploymentMode deploymentMode);
        }
        /** The stage of the VendorSku update allowing to specify networkFunctionType. */
        interface WithNetworkFunctionType {
            /**
             * Specifies the networkFunctionType property: The network function type..
             *
             * @param networkFunctionType The network function type.
             * @return the next definition stage.
             */
            Update withNetworkFunctionType(NetworkFunctionType networkFunctionType);
        }
        /** The stage of the VendorSku update allowing to specify preview. */
        interface WithPreview {
            /**
             * Specifies the preview property: Indicates if the vendor sku is in preview mode..
             *
             * @param preview Indicates if the vendor sku is in preview mode.
             * @return the next definition stage.
             */
            Update withPreview(Boolean preview);
        }
        /** The stage of the VendorSku update allowing to specify managedApplicationParameters. */
        interface WithManagedApplicationParameters {
            /**
             * Specifies the managedApplicationParameters property: The parameters for the managed application to be
             * supplied by the vendor..
             *
             * @param managedApplicationParameters The parameters for the managed application to be supplied by the
             *     vendor.
             * @return the next definition stage.
             */
            Update withManagedApplicationParameters(Object managedApplicationParameters);
        }
        /** The stage of the VendorSku update allowing to specify managedApplicationTemplate. */
        interface WithManagedApplicationTemplate {
            /**
             * Specifies the managedApplicationTemplate property: The template for the managed application deployment..
             *
             * @param managedApplicationTemplate The template for the managed application deployment.
             * @return the next definition stage.
             */
            Update withManagedApplicationTemplate(Object managedApplicationTemplate);
        }
        /** The stage of the VendorSku update allowing to specify networkFunctionTemplate. */
        interface WithNetworkFunctionTemplate {
            /**
             * Specifies the networkFunctionTemplate property: The template definition of the network function..
             *
             * @param networkFunctionTemplate The template definition of the network function.
             * @return the next definition stage.
             */
            Update withNetworkFunctionTemplate(NetworkFunctionTemplate networkFunctionTemplate);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VendorSku refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VendorSku refresh(Context context);
}
