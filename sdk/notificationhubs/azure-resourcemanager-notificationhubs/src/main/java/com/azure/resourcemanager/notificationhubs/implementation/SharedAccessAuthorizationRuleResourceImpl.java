// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import com.azure.resourcemanager.notificationhubs.models.AccessRights;
import com.azure.resourcemanager.notificationhubs.models.PolicyKeyResource;
import com.azure.resourcemanager.notificationhubs.models.ResourceListKeys;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SharedAccessAuthorizationRuleResourceImpl implements SharedAccessAuthorizationRuleResource,
    SharedAccessAuthorizationRuleResource.Definition, SharedAccessAuthorizationRuleResource.Update {
    private SharedAccessAuthorizationRuleResourceInner innerObject;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<AccessRights> rights() {
        List<AccessRights> inner = this.innerModel().rights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public OffsetDateTime modifiedTime() {
        return this.innerModel().modifiedTime();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public String claimType() {
        return this.innerModel().claimType();
    }

    public String claimValue() {
        return this.innerModel().claimValue();
    }

    public Integer revision() {
        return this.innerModel().revision();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SharedAccessAuthorizationRuleResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String notificationHubName;

    private String authorizationRuleName;

    public SharedAccessAuthorizationRuleResourceImpl withExistingNotificationHub(String resourceGroupName,
        String namespaceName, String notificationHubName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.notificationHubName = notificationHubName;
        return this;
    }

    public SharedAccessAuthorizationRuleResource create() {
        this.innerObject
            = serviceManager
                .serviceClient().getNotificationHubs().createOrUpdateAuthorizationRuleWithResponse(resourceGroupName,
                    namespaceName, notificationHubName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getNotificationHubs()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, this.innerModel(), context)
            .getValue();
        return this;
    }

    SharedAccessAuthorizationRuleResourceImpl(String name,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerObject = new SharedAccessAuthorizationRuleResourceInner();
        this.serviceManager = serviceManager;
        this.authorizationRuleName = name;
    }

    public SharedAccessAuthorizationRuleResourceImpl update() {
        return this;
    }

    public SharedAccessAuthorizationRuleResource apply() {
        this.innerObject
            = serviceManager
                .serviceClient().getNotificationHubs().createOrUpdateAuthorizationRuleWithResponse(resourceGroupName,
                    namespaceName, notificationHubName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getNotificationHubs()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, this.innerModel(), context)
            .getValue();
        return this;
    }

    SharedAccessAuthorizationRuleResourceImpl(SharedAccessAuthorizationRuleResourceInner innerObject,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.notificationHubName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "notificationHubs");
        this.authorizationRuleName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "authorizationRules");
    }

    public SharedAccessAuthorizationRuleResource refresh() {
        this.innerObject
            = serviceManager.serviceClient().getNotificationHubs().getAuthorizationRuleWithResponse(resourceGroupName,
                namespaceName, notificationHubName, authorizationRuleName, Context.NONE).getValue();
        return this;
    }

    public SharedAccessAuthorizationRuleResource refresh(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getNotificationHubs().getAuthorizationRuleWithResponse(resourceGroupName,
                namespaceName, notificationHubName, authorizationRuleName, context).getValue();
        return this;
    }

    public Response<ResourceListKeys> listKeysWithResponse(Context context) {
        return serviceManager.notificationHubs().listKeysWithResponse(resourceGroupName, namespaceName,
            notificationHubName, authorizationRuleName, context);
    }

    public ResourceListKeys listKeys() {
        return serviceManager.notificationHubs().listKeys(resourceGroupName, namespaceName, notificationHubName,
            authorizationRuleName);
    }

    public Response<ResourceListKeys> regenerateKeysWithResponse(PolicyKeyResource parameters, Context context) {
        return serviceManager.notificationHubs().regenerateKeysWithResponse(resourceGroupName, namespaceName,
            notificationHubName, authorizationRuleName, parameters, context);
    }

    public ResourceListKeys regenerateKeys(PolicyKeyResource parameters) {
        return serviceManager.notificationHubs().regenerateKeys(resourceGroupName, namespaceName, notificationHubName,
            authorizationRuleName, parameters);
    }

    public SharedAccessAuthorizationRuleResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SharedAccessAuthorizationRuleResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SharedAccessAuthorizationRuleResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public SharedAccessAuthorizationRuleResourceImpl withRights(List<AccessRights> rights) {
        this.innerModel().withRights(rights);
        return this;
    }

    public SharedAccessAuthorizationRuleResourceImpl withPrimaryKey(String primaryKey) {
        this.innerModel().withPrimaryKey(primaryKey);
        return this;
    }

    public SharedAccessAuthorizationRuleResourceImpl withSecondaryKey(String secondaryKey) {
        this.innerModel().withSecondaryKey(secondaryKey);
        return this;
    }
}
