// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for playing audio with call locator. */
@Fluent
public final class PlayAudioWithCallLocatorRequest {
    /*
     * The call locator.
     */
    @JsonProperty(value = "callLocator", required = true)
    private CallLocatorModel callLocator;

    /*
     * The request payload for playing audio.
     */
    @JsonProperty(value = "playAudioRequest", required = true)
    private PlayAudioRequest playAudioRequest;

    /**
     * Get the callLocator property: The call locator.
     *
     * @return the callLocator value.
     */
    public CallLocatorModel getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The call locator.
     *
     * @param callLocator the callLocator value to set.
     * @return the PlayAudioWithCallLocatorRequest object itself.
     */
    public PlayAudioWithCallLocatorRequest setCallLocator(CallLocatorModel callLocator) {
        this.callLocator = callLocator;
        return this;
    }

    /**
     * Get the playAudioRequest property: The request payload for playing audio.
     *
     * @return the playAudioRequest value.
     */
    public PlayAudioRequest getPlayAudioRequest() {
        return this.playAudioRequest;
    }

    /**
     * Set the playAudioRequest property: The request payload for playing audio.
     *
     * @param playAudioRequest the playAudioRequest value to set.
     * @return the PlayAudioWithCallLocatorRequest object itself.
     */
    public PlayAudioWithCallLocatorRequest setPlayAudioRequest(PlayAudioRequest playAudioRequest) {
        this.playAudioRequest = playAudioRequest;
        return this;
    }
}
