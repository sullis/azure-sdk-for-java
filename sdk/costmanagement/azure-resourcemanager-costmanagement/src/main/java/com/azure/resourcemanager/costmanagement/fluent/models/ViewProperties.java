// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.models.AccumulatedType;
import com.azure.resourcemanager.costmanagement.models.ChartType;
import com.azure.resourcemanager.costmanagement.models.KpiProperties;
import com.azure.resourcemanager.costmanagement.models.MetricType;
import com.azure.resourcemanager.costmanagement.models.PivotProperties;
import com.azure.resourcemanager.costmanagement.models.ReportConfigDataset;
import com.azure.resourcemanager.costmanagement.models.ReportConfigTimePeriod;
import com.azure.resourcemanager.costmanagement.models.ReportTimeframeType;
import com.azure.resourcemanager.costmanagement.models.ReportType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of the view. */
@Fluent
public final class ViewProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ViewProperties.class);

    /*
     * User input name of the view. Required.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Cost Management scope to save the view on. This includes
     * 'subscriptions/{subscriptionId}' for subscription scope,
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for
     * resourceGroup scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}'
     * for Department scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
     * for BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}'
     * for InvoiceSection scope,
     * 'providers/Microsoft.Management/managementGroups/{managementGroupId}'
     * for Management Group scope,
     * '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}'
     * for ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}'
     * for ExternalSubscription scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * Date the user created this view.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Date when the user last modified this view.
     */
    @JsonProperty(value = "modifiedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime modifiedOn;

    /*
     * Selected date range for viewing cost in.
     */
    @JsonProperty(value = "dateRange", access = JsonProperty.Access.WRITE_ONLY)
    private String dateRange;

    /*
     * Selected currency.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * Query body configuration. Required.
     */
    @JsonProperty(value = "query")
    private ReportConfigDefinition innerQuery;

    /*
     * Chart type of the main view in Cost Analysis. Required.
     */
    @JsonProperty(value = "chart")
    private ChartType chart;

    /*
     * Show costs accumulated over time.
     */
    @JsonProperty(value = "accumulated")
    private AccumulatedType accumulated;

    /*
     * Metric to use when displaying costs.
     */
    @JsonProperty(value = "metric")
    private MetricType metric;

    /*
     * List of KPIs to show in Cost Analysis UI.
     */
    @JsonProperty(value = "kpis")
    private List<KpiProperties> kpis;

    /*
     * Configuration of 3 sub-views in the Cost Analysis UI.
     */
    @JsonProperty(value = "pivots")
    private List<PivotProperties> pivots;

    /**
     * Get the displayName property: User input name of the view. Required.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: User input name of the view. Required.
     *
     * @param displayName the displayName value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the scope property: Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}'
     * for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     * scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group
     * scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     * ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription
     * scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}'
     * for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     * scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group
     * scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     * ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription
     * scope.
     *
     * @param scope the scope value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the createdOn property: Date the user created this view.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the modifiedOn property: Date when the user last modified this view.
     *
     * @return the modifiedOn value.
     */
    public OffsetDateTime modifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Get the dateRange property: Selected date range for viewing cost in.
     *
     * @return the dateRange value.
     */
    public String dateRange() {
        return this.dateRange;
    }

    /**
     * Get the currency property: Selected currency.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the innerQuery property: Query body configuration. Required.
     *
     * @return the innerQuery value.
     */
    private ReportConfigDefinition innerQuery() {
        return this.innerQuery;
    }

    /**
     * Get the chart property: Chart type of the main view in Cost Analysis. Required.
     *
     * @return the chart value.
     */
    public ChartType chart() {
        return this.chart;
    }

    /**
     * Set the chart property: Chart type of the main view in Cost Analysis. Required.
     *
     * @param chart the chart value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withChart(ChartType chart) {
        this.chart = chart;
        return this;
    }

    /**
     * Get the accumulated property: Show costs accumulated over time.
     *
     * @return the accumulated value.
     */
    public AccumulatedType accumulated() {
        return this.accumulated;
    }

    /**
     * Set the accumulated property: Show costs accumulated over time.
     *
     * @param accumulated the accumulated value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withAccumulated(AccumulatedType accumulated) {
        this.accumulated = accumulated;
        return this;
    }

    /**
     * Get the metric property: Metric to use when displaying costs.
     *
     * @return the metric value.
     */
    public MetricType metric() {
        return this.metric;
    }

    /**
     * Set the metric property: Metric to use when displaying costs.
     *
     * @param metric the metric value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withMetric(MetricType metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the kpis property: List of KPIs to show in Cost Analysis UI.
     *
     * @return the kpis value.
     */
    public List<KpiProperties> kpis() {
        return this.kpis;
    }

    /**
     * Set the kpis property: List of KPIs to show in Cost Analysis UI.
     *
     * @param kpis the kpis value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withKpis(List<KpiProperties> kpis) {
        this.kpis = kpis;
        return this;
    }

    /**
     * Get the pivots property: Configuration of 3 sub-views in the Cost Analysis UI.
     *
     * @return the pivots value.
     */
    public List<PivotProperties> pivots() {
        return this.pivots;
    }

    /**
     * Set the pivots property: Configuration of 3 sub-views in the Cost Analysis UI.
     *
     * @param pivots the pivots value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withPivots(List<PivotProperties> pivots) {
        this.pivots = pivots;
        return this;
    }

    /**
     * Get the type property: The type of the report. Usage represents actual usage, forecast represents forecasted data
     * and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     *
     * @return the type value.
     */
    public ReportType type() {
        return this.innerQuery() == null ? null : this.innerQuery().type();
    }

    /**
     * Set the type property: The type of the report. Usage represents actual usage, forecast represents forecasted data
     * and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     *
     * @param type the type value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withType(ReportType type) {
        if (this.innerQuery() == null) {
            this.innerQuery = new ReportConfigDefinition();
        }
        this.innerQuery().withType(type);
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     *
     * @return the timeframe value.
     */
    public ReportTimeframeType timeframe() {
        return this.innerQuery() == null ? null : this.innerQuery().timeframe();
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     *
     * @param timeframe the timeframe value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withTimeframe(ReportTimeframeType timeframe) {
        if (this.innerQuery() == null) {
            this.innerQuery = new ReportConfigDefinition();
        }
        this.innerQuery().withTimeframe(timeframe);
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the report.
     *
     * @return the timePeriod value.
     */
    public ReportConfigTimePeriod timePeriod() {
        return this.innerQuery() == null ? null : this.innerQuery().timePeriod();
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the report.
     *
     * @param timePeriod the timePeriod value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withTimePeriod(ReportConfigTimePeriod timePeriod) {
        if (this.innerQuery() == null) {
            this.innerQuery = new ReportConfigDefinition();
        }
        this.innerQuery().withTimePeriod(timePeriod);
        return this;
    }

    /**
     * Get the dataSet property: Has definition for data in this report config.
     *
     * @return the dataSet value.
     */
    public ReportConfigDataset dataSet() {
        return this.innerQuery() == null ? null : this.innerQuery().dataSet();
    }

    /**
     * Set the dataSet property: Has definition for data in this report config.
     *
     * @param dataSet the dataSet value to set.
     * @return the ViewProperties object itself.
     */
    public ViewProperties withDataSet(ReportConfigDataset dataSet) {
        if (this.innerQuery() == null) {
            this.innerQuery = new ReportConfigDefinition();
        }
        this.innerQuery().withDataSet(dataSet);
        return this;
    }

    /**
     * Get the includeMonetaryCommitment property: Include monetary commitment.
     *
     * @return the includeMonetaryCommitment value.
     */
    public Boolean includeMonetaryCommitment() {
        return this.innerQuery() == null ? null : this.innerQuery().includeMonetaryCommitment();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerQuery() != null) {
            innerQuery().validate();
        }
        if (kpis() != null) {
            kpis().forEach(e -> e.validate());
        }
        if (pivots() != null) {
            pivots().forEach(e -> e.validate());
        }
    }
}
