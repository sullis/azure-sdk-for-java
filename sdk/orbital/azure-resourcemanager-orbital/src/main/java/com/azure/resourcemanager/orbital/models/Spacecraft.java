// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.orbital.fluent.models.SpacecraftInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Spacecraft. */
public interface Spacecraft {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The current state of the resource's creation, deletion, or modification.
     *
     * @return the provisioningState value.
     */
    SpacecraftsPropertiesProvisioningState provisioningState();

    /**
     * Gets the noradId property: NORAD ID of the spacecraft.
     *
     * @return the noradId value.
     */
    String noradId();

    /**
     * Gets the titleLine property: Title line of the two-line element set (TLE).
     *
     * @return the titleLine value.
     */
    String titleLine();

    /**
     * Gets the tleLine1 property: Line 1 of the two-line element set (TLE).
     *
     * @return the tleLine1 value.
     */
    String tleLine1();

    /**
     * Gets the tleLine2 property: Line 2 of the two-line element set (TLE).
     *
     * @return the tleLine2 value.
     */
    String tleLine2();

    /**
     * Gets the links property: Immutable list of Spacecraft links.
     *
     * @return the links value.
     */
    List<SpacecraftLink> links();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.orbital.fluent.models.SpacecraftInner object.
     *
     * @return the inner object.
     */
    SpacecraftInner innerModel();

    /** The entirety of the Spacecraft definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithTitleLine,
            DefinitionStages.WithTleLine1,
            DefinitionStages.WithTleLine2,
            DefinitionStages.WithLinks,
            DefinitionStages.WithCreate {
    }
    /** The Spacecraft definition stages. */
    interface DefinitionStages {
        /** The first stage of the Spacecraft definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Spacecraft definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Spacecraft definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithTitleLine withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Spacecraft definition allowing to specify titleLine. */
        interface WithTitleLine {
            /**
             * Specifies the titleLine property: Title line of the two-line element set (TLE)..
             *
             * @param titleLine Title line of the two-line element set (TLE).
             * @return the next definition stage.
             */
            WithTleLine1 withTitleLine(String titleLine);
        }
        /** The stage of the Spacecraft definition allowing to specify tleLine1. */
        interface WithTleLine1 {
            /**
             * Specifies the tleLine1 property: Line 1 of the two-line element set (TLE)..
             *
             * @param tleLine1 Line 1 of the two-line element set (TLE).
             * @return the next definition stage.
             */
            WithTleLine2 withTleLine1(String tleLine1);
        }
        /** The stage of the Spacecraft definition allowing to specify tleLine2. */
        interface WithTleLine2 {
            /**
             * Specifies the tleLine2 property: Line 2 of the two-line element set (TLE)..
             *
             * @param tleLine2 Line 2 of the two-line element set (TLE).
             * @return the next definition stage.
             */
            WithLinks withTleLine2(String tleLine2);
        }
        /** The stage of the Spacecraft definition allowing to specify links. */
        interface WithLinks {
            /**
             * Specifies the links property: Immutable list of Spacecraft links..
             *
             * @param links Immutable list of Spacecraft links.
             * @return the next definition stage.
             */
            WithCreate withLinks(List<SpacecraftLink> links);
        }
        /**
         * The stage of the Spacecraft definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithProvisioningState, DefinitionStages.WithNoradId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Spacecraft create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Spacecraft create(Context context);
        }
        /** The stage of the Spacecraft definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Spacecraft definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The current state of the resource's creation, deletion, or
             * modification..
             *
             * @param provisioningState The current state of the resource's creation, deletion, or modification.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(SpacecraftsPropertiesProvisioningState provisioningState);
        }
        /** The stage of the Spacecraft definition allowing to specify noradId. */
        interface WithNoradId {
            /**
             * Specifies the noradId property: NORAD ID of the spacecraft..
             *
             * @param noradId NORAD ID of the spacecraft.
             * @return the next definition stage.
             */
            WithCreate withNoradId(String noradId);
        }
    }
    /**
     * Begins update for the Spacecraft resource.
     *
     * @return the stage of resource update.
     */
    Spacecraft.Update update();

    /** The template for Spacecraft update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Spacecraft apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Spacecraft apply(Context context);
    }
    /** The Spacecraft update stages. */
    interface UpdateStages {
        /** The stage of the Spacecraft update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Spacecraft refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Spacecraft refresh(Context context);

    /**
     * Returns list of available contacts. A contact is available if the spacecraft is visible from the ground station
     * for more than the minimum viable contact duration provided in the contact profile.
     *
     * @param parameters The parameters to provide for the contacts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListAvailableContacts API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableContacts> listAvailableContacts(ContactParameters parameters);

    /**
     * Returns list of available contacts. A contact is available if the spacecraft is visible from the ground station
     * for more than the minimum viable contact duration provided in the contact profile.
     *
     * @param parameters The parameters to provide for the contacts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListAvailableContacts API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableContacts> listAvailableContacts(ContactParameters parameters, Context context);
}
