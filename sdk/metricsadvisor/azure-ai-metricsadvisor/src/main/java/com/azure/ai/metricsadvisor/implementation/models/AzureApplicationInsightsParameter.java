// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureApplicationInsightsParameter model. */
@Fluent
public final class AzureApplicationInsightsParameter {
    /*
     * The Azure cloud that this Azure Application Insights in
     */
    @JsonProperty(value = "azureCloud")
    private String azureCloud;

    /*
     * The application id of this Azure Application Insights
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * The API Key that can access this Azure Application Insights
     */
    @JsonProperty(value = "apiKey")
    private String apiKey;

    /*
     * The statement to query this Azure Application Insights
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /**
     * Get the azureCloud property: The Azure cloud that this Azure Application Insights in.
     *
     * @return the azureCloud value.
     */
    public String getAzureCloud() {
        return this.azureCloud;
    }

    /**
     * Set the azureCloud property: The Azure cloud that this Azure Application Insights in.
     *
     * @param azureCloud the azureCloud value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setAzureCloud(String azureCloud) {
        this.azureCloud = azureCloud;
        return this;
    }

    /**
     * Get the applicationId property: The application id of this Azure Application Insights.
     *
     * @return the applicationId value.
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application id of this Azure Application Insights.
     *
     * @param applicationId the applicationId value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the apiKey property: The API Key that can access this Azure Application Insights.
     *
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The API Key that can access this Azure Application Insights.
     *
     * @param apiKey the apiKey value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the query property: The statement to query this Azure Application Insights.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The statement to query this Azure Application Insights.
     *
     * @param query the query value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setQuery(String query) {
        this.query = query;
        return this;
    }
}
