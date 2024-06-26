// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.models.Timeseries;
import com.azure.resourcemanager.frontdoor.models.TimeseriesAggregationInterval;
import com.azure.resourcemanager.frontdoor.models.TimeseriesType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsGetTimeseriesWithResponseMockTests {
    @Test
    public void testGetTimeseriesWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"endpoint\":\"c\",\"startDateTimeUTC\":\"ulehurqlr\",\"endDateTimeUTC\":\"fawey\",\"aggregationInterval\":\"Daily\",\"timeseriesType\":\"MeasurementCounts\",\"country\":\"jdxravjuqdbrx\",\"timeseriesData\":[{\"dateTimeUTC\":\"hbapxkiyf\",\"value\":36.266453},{\"dateTimeUTC\":\"ajb\",\"value\":46.209423},{\"dateTimeUTC\":\"duusioycblevpmcl\",\"value\":38.790684}]},\"location\":\"xkyxlzgs\",\"tags\":{\"fhbzffovwmbjlzq\":\"zzlt\",\"owftptnuwjtks\":\"czpgvdwnapfdq\",\"cgqyhleseyq\":\"h\"},\"id\":\"hvyeldotj\",\"name\":\"dkwisw\",\"type\":\"kukjtasb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Timeseries response = manager.reports()
            .getTimeseriesWithResponse("zhomewjjstliu", "qawmoaianc", "nvodrrs",
                OffsetDateTime.parse("2021-05-12T12:02:35Z"), OffsetDateTime.parse("2021-04-13T01:02:19Z"),
                TimeseriesAggregationInterval.HOURLY, TimeseriesType.LATENCY_P50, "dkxrxvvbxi", "kgfbqljnqkhy",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("xkyxlzgs", response.location());
        Assertions.assertEquals("zzlt", response.tags().get("fhbzffovwmbjlzq"));
        Assertions.assertEquals("c", response.endpoint());
        Assertions.assertEquals("ulehurqlr", response.startDateTimeUtc());
        Assertions.assertEquals("fawey", response.endDateTimeUtc());
        Assertions.assertEquals(AggregationInterval.DAILY, response.aggregationInterval());
        Assertions.assertEquals(TimeseriesType.MEASUREMENT_COUNTS, response.timeseriesType());
        Assertions.assertEquals("jdxravjuqdbrx", response.country());
        Assertions.assertEquals("hbapxkiyf", response.timeseriesData().get(0).dateTimeUtc());
        Assertions.assertEquals(36.266453F, response.timeseriesData().get(0).value());
    }
}
