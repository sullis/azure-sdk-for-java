// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.Remediation;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RemediationsListForResourceMockTests {
    @Test
    public void testListForResource() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"policyAssignmentId\":\"jslb\",\"policyDefinitionReferenceId\":\"kojgcyzts\",\"resourceDiscoveryMode\":\"ExistingNonCompliant\",\"provisioningState\":\"baeqphc\",\"createdOn\":\"2021-04-12T00:44:34Z\",\"lastUpdatedOn\":\"2021-07-05T05:19:11Z\",\"filters\":{\"locations\":[]},\"deploymentStatus\":{\"totalDeployments\":995408685,\"successfulDeployments\":1909534369,\"failedDeployments\":550390162},\"statusMessage\":\"qgaifmviklbydv\",\"correlationId\":\"bejdznxcv\",\"resourceCount\":929609340,\"parallelDeployments\":986033506,\"failureThreshold\":{\"percentage\":31.331556}},\"id\":\"lvtno\",\"name\":\"qfzgemjdftul\",\"type\":\"ltducea\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Remediation> response =
            manager.remediations().listForResource("eacvl", 1877895410, "ygdyftumrtw", Context.NONE);

        Assertions.assertEquals("jslb", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("kojgcyzts", response.iterator().next().policyDefinitionReferenceId());
        Assertions
            .assertEquals(
                ResourceDiscoveryMode.EXISTING_NON_COMPLIANT, response.iterator().next().resourceDiscoveryMode());
        Assertions.assertEquals(929609340, response.iterator().next().resourceCount());
        Assertions.assertEquals(986033506, response.iterator().next().parallelDeployments());
        Assertions.assertEquals(31.331556F, response.iterator().next().failureThreshold().percentage());
    }
}
