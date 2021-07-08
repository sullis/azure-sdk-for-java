// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request payload for typing notifications. */
@Fluent
public final class TypingNotificationOptions {
    /*
     * The display name of the typing notification sender. This property is
     * used to populate sender name for push notifications.
     */
    @JsonProperty(value = "senderDisplayName")
    private String senderDisplayName;

    /**
     * Get the senderDisplayName property: The display name of the typing notification sender. This property is used to
     * populate sender name for push notifications.
     *
     * @return the senderDisplayName value.
     */
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the typing notification sender. This property is used to
     * populate sender name for push notifications.
     *
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the TypingNotificationOptions object itself.
     */
    public TypingNotificationOptions setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }
}
