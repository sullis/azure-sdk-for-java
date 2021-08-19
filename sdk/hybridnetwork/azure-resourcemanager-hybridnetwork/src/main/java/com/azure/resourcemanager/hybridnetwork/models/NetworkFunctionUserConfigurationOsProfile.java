// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the operating system settings for the role instance. */
@Fluent
public final class NetworkFunctionUserConfigurationOsProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFunctionUserConfigurationOsProfile.class);

    /*
     * Specifies a base-64 encoded string of custom data. The base-64 encoded
     * string is decoded to a binary array that is saved as a file on the
     * virtual machine. The maximum length of the binary array is 65535 bytes.
     * <br><br> **Note: Do not pass any secrets or passwords in customData
     * property** <br><br> This property cannot be updated after the VM is
     * created. <br><br> customData is passed to the VM to be saved as a file.
     * For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/)
     * <br><br> For using cloud-init for your Linux VM, see [Using cloud-init
     * to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     */
    @JsonProperty(value = "customData")
    private String customData;

    /**
     * Get the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property**
     * &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is
     * passed to the VM to be saved as a file. For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt;
     * For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property**
     * &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is
     * passed to the VM to be saved as a file. For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt;
     * For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param customData the customData value to set.
     * @return the NetworkFunctionUserConfigurationOsProfile object itself.
     */
    public NetworkFunctionUserConfigurationOsProfile withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
