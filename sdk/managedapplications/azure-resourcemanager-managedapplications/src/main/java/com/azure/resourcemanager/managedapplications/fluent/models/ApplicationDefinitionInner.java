// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedapplications.models.ApplicationAuthorization;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinitionArtifact;
import com.azure.resourcemanager.managedapplications.models.ApplicationDeploymentPolicy;
import com.azure.resourcemanager.managedapplications.models.ApplicationLockLevel;
import com.azure.resourcemanager.managedapplications.models.ApplicationManagementPolicy;
import com.azure.resourcemanager.managedapplications.models.ApplicationNotificationPolicy;
import com.azure.resourcemanager.managedapplications.models.ApplicationPackageLockingPolicyDefinition;
import com.azure.resourcemanager.managedapplications.models.ApplicationPolicy;
import com.azure.resourcemanager.managedapplications.models.GenericResource;
import com.azure.resourcemanager.managedapplications.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Information about managed application definition. */
@Fluent
public final class ApplicationDefinitionInner extends GenericResource {
    /*
     * The managed application definition properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ApplicationDefinitionProperties innerProperties = new ApplicationDefinitionProperties();

    /** Creates an instance of ApplicationDefinitionInner class. */
    public ApplicationDefinitionInner() {
    }

    /**
     * Get the innerProperties property: The managed application definition properties.
     *
     * @return the innerProperties value.
     */
    private ApplicationDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationDefinitionInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationDefinitionInner withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationDefinitionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationDefinitionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the lockLevel property: The managed application lock level.
     *
     * @return the lockLevel value.
     */
    public ApplicationLockLevel lockLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().lockLevel();
    }

    /**
     * Set the lockLevel property: The managed application lock level.
     *
     * @param lockLevel the lockLevel value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withLockLevel(ApplicationLockLevel lockLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withLockLevel(lockLevel);
        return this;
    }

    /**
     * Get the displayName property: The managed application definition display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The managed application definition display name.
     *
     * @param displayName the displayName value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the isEnabled property: A value indicating whether the package is enabled or not.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
    }

    /**
     * Set the isEnabled property: A value indicating whether the package is enabled or not.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withIsEnabled(Boolean isEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Get the authorizations property: The managed application provider authorizations.
     *
     * @return the authorizations value.
     */
    public List<ApplicationAuthorization> authorizations() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizations();
    }

    /**
     * Set the authorizations property: The managed application provider authorizations.
     *
     * @param authorizations the authorizations value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withAuthorizations(List<ApplicationAuthorization> authorizations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withAuthorizations(authorizations);
        return this;
    }

    /**
     * Get the artifacts property: The collection of managed application artifacts. The portal will use the files
     * specified as artifacts to construct the user experience of creating a managed application from a managed
     * application definition.
     *
     * @return the artifacts value.
     */
    public List<ApplicationDefinitionArtifact> artifacts() {
        return this.innerProperties() == null ? null : this.innerProperties().artifacts();
    }

    /**
     * Set the artifacts property: The collection of managed application artifacts. The portal will use the files
     * specified as artifacts to construct the user experience of creating a managed application from a managed
     * application definition.
     *
     * @param artifacts the artifacts value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withArtifacts(List<ApplicationDefinitionArtifact> artifacts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withArtifacts(artifacts);
        return this;
    }

    /**
     * Get the description property: The managed application definition description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The managed application definition description.
     *
     * @param description the description value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the packageFileUri property: The managed application definition package file Uri. Use this element.
     *
     * @return the packageFileUri value.
     */
    public String packageFileUri() {
        return this.innerProperties() == null ? null : this.innerProperties().packageFileUri();
    }

    /**
     * Set the packageFileUri property: The managed application definition package file Uri. Use this element.
     *
     * @param packageFileUri the packageFileUri value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withPackageFileUri(String packageFileUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withPackageFileUri(packageFileUri);
        return this;
    }

    /**
     * Get the storageAccountId property: The storage account id for bring your own storage scenario.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountId();
    }

    /**
     * Set the storageAccountId property: The storage account id for bring your own storage scenario.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withStorageAccountId(String storageAccountId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withStorageAccountId(storageAccountId);
        return this;
    }

    /**
     * Get the mainTemplate property: The inline main template json which has resources to be provisioned. It can be a
     * JObject or well-formed JSON string.
     *
     * @return the mainTemplate value.
     */
    public Object mainTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().mainTemplate();
    }

    /**
     * Set the mainTemplate property: The inline main template json which has resources to be provisioned. It can be a
     * JObject or well-formed JSON string.
     *
     * @param mainTemplate the mainTemplate value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withMainTemplate(Object mainTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withMainTemplate(mainTemplate);
        return this;
    }

    /**
     * Get the createUiDefinition property: The createUiDefinition json for the backing template with
     * Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     *
     * @return the createUiDefinition value.
     */
    public Object createUiDefinition() {
        return this.innerProperties() == null ? null : this.innerProperties().createUiDefinition();
    }

    /**
     * Set the createUiDefinition property: The createUiDefinition json for the backing template with
     * Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     *
     * @param createUiDefinition the createUiDefinition value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withCreateUiDefinition(Object createUiDefinition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withCreateUiDefinition(createUiDefinition);
        return this;
    }

    /**
     * Get the notificationPolicy property: The managed application notification policy.
     *
     * @return the notificationPolicy value.
     */
    public ApplicationNotificationPolicy notificationPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().notificationPolicy();
    }

    /**
     * Set the notificationPolicy property: The managed application notification policy.
     *
     * @param notificationPolicy the notificationPolicy value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withNotificationPolicy(ApplicationNotificationPolicy notificationPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withNotificationPolicy(notificationPolicy);
        return this;
    }

    /**
     * Get the lockingPolicy property: The managed application locking policy.
     *
     * @return the lockingPolicy value.
     */
    public ApplicationPackageLockingPolicyDefinition lockingPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().lockingPolicy();
    }

    /**
     * Set the lockingPolicy property: The managed application locking policy.
     *
     * @param lockingPolicy the lockingPolicy value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withLockingPolicy(ApplicationPackageLockingPolicyDefinition lockingPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withLockingPolicy(lockingPolicy);
        return this;
    }

    /**
     * Get the deploymentPolicy property: The managed application deployment policy.
     *
     * @return the deploymentPolicy value.
     */
    public ApplicationDeploymentPolicy deploymentPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentPolicy();
    }

    /**
     * Set the deploymentPolicy property: The managed application deployment policy.
     *
     * @param deploymentPolicy the deploymentPolicy value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDeploymentPolicy(ApplicationDeploymentPolicy deploymentPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withDeploymentPolicy(deploymentPolicy);
        return this;
    }

    /**
     * Get the managementPolicy property: The managed application management policy that determines publisher's access
     * to the managed resource group.
     *
     * @return the managementPolicy value.
     */
    public ApplicationManagementPolicy managementPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().managementPolicy();
    }

    /**
     * Set the managementPolicy property: The managed application management policy that determines publisher's access
     * to the managed resource group.
     *
     * @param managementPolicy the managementPolicy value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withManagementPolicy(ApplicationManagementPolicy managementPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withManagementPolicy(managementPolicy);
        return this;
    }

    /**
     * Get the policies property: The managed application provider policies.
     *
     * @return the policies value.
     */
    public List<ApplicationPolicy> policies() {
        return this.innerProperties() == null ? null : this.innerProperties().policies();
    }

    /**
     * Set the policies property: The managed application provider policies.
     *
     * @param policies the policies value to set.
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withPolicies(List<ApplicationPolicy> policies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationDefinitionProperties();
        }
        this.innerProperties().withPolicies(policies);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ApplicationDefinitionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationDefinitionInner.class);
}
