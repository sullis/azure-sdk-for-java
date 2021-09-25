// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The remove participant by identifier request. */
@Fluent
public final class RemoveParticipantRequest {
    /*
     * The identifier of the participant to be removed from the call.
     */
    @JsonProperty(value = "identifier", required = true)
    private CommunicationIdentifierModel identifier;

    /**
     * Get the identifier property: The identifier of the participant to be removed from the call.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier of the participant to be removed from the call.
     *
     * @param identifier the identifier value to set.
     * @return the RemoveParticipantRequest object itself.
     */
    public RemoveParticipantRequest setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }
}
