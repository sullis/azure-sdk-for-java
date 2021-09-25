// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.CallRecordingState;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The call recording state change event. */
@Fluent
public final class CallRecordingStateChangeEventInternal {
    /*
     * The call recording id
     */
    @JsonProperty(value = "recordingId")
    private String recordingId;

    /*
     * The state of the recording
     */
    @JsonProperty(value = "state", required = true)
    private CallRecordingState state;

    /*
     * The time of the recording started
     */
    @JsonProperty(value = "startDateTime", required = true)
    private OffsetDateTime startDateTime;

    /*
     * The locator used for joining or taking action on a call.
     */
    @JsonProperty(value = "callLocator")
    private CallLocatorModel callLocator;

    /**
     * Get the recordingId property: The call recording id.
     *
     * @return the recordingId value.
     */
    public String getRecordingId() {
        return this.recordingId;
    }

    /**
     * Set the recordingId property: The call recording id.
     *
     * @param recordingId the recordingId value to set.
     * @return the CallRecordingStateChangeEventInternal object itself.
     */
    public CallRecordingStateChangeEventInternal setRecordingId(String recordingId) {
        this.recordingId = recordingId;
        return this;
    }

    /**
     * Get the state property: The state of the recording.
     *
     * @return the state value.
     */
    public CallRecordingState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the recording.
     *
     * @param state the state value to set.
     * @return the CallRecordingStateChangeEventInternal object itself.
     */
    public CallRecordingStateChangeEventInternal setState(CallRecordingState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the startDateTime property: The time of the recording started.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The time of the recording started.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the CallRecordingStateChangeEventInternal object itself.
     */
    public CallRecordingStateChangeEventInternal setStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the callLocator property: The locator used for joining or taking action on a call.
     *
     * @return the callLocator value.
     */
    public CallLocatorModel getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The locator used for joining or taking action on a call.
     *
     * @param callLocator the callLocator value to set.
     * @return the CallRecordingStateChangeEventInternal object itself.
     */
    public CallRecordingStateChangeEventInternal setCallLocator(CallLocatorModel callLocator) {
        this.callLocator = callLocator;
        return this;
    }
}
