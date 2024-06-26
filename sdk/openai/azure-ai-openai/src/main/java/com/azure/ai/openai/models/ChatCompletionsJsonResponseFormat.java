// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A response format for Chat Completions that restricts responses to emitting valid JSON objects.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = ChatCompletionsJsonResponseFormat.class,
    visible = true)
@JsonTypeName("json_object")
@Immutable
public final class ChatCompletionsJsonResponseFormat extends ChatCompletionsResponseFormat {

    /**
     * Creates an instance of ChatCompletionsJsonResponseFormat class.
     */
    @Generated
    public ChatCompletionsJsonResponseFormat() {
    }

    /*
     * The discriminated type for the response format.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private String type = "json_object";

    /**
     * Get the type property: The discriminated type for the response format.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }
}
