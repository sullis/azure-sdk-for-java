// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import reactor.core.publisher.Mono;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LedgerEntriesTest extends ConfidentialLedgerClientTestBase {
    @Test
    public void testPostLedgerEntryTests() throws Exception {
        String ledgerId = Configuration.getGlobalConfiguration().get("LEDGERID", "emily-java-sdk-tests");
        // this is a built in test of getLedgerIdentity
        Response<BinaryData> ledgerIdentityWithResponse = confidentialLedgerCertificateClient
                .getLedgerIdentityWithResponse(ledgerId, null);
        BinaryData identityResponse = ledgerIdentityWithResponse.getValue();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(identityResponse.toBytes());
        String ledgerTslCertificate = jsonNode.get("ledgerTlsCertificate").asText();


        SslContext sslContext = SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(ledgerTslCertificate.getBytes(StandardCharsets.UTF_8))).build();
        reactor.netty.http.client.HttpClient reactorClient = reactor.netty.http.client.HttpClient.create()
                .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));
        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient).wiretap(true).build();

        if (getTestMode() == TestMode.PLAYBACK) {
            confidentialLedgerClientBuilder
                .httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            confidentialLedgerClientBuilder
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(httpClient)
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            confidentialLedgerClientBuilder
                .credential(new DefaultAzureCredentialBuilder().build())
                .httpClient(httpClient);
        }
        
        ConfidentialLedgerClient confidentialLedgerClient = confidentialLedgerClientBuilder.buildClient();
        
        BinaryData entry = BinaryData.fromString("{\"contents\":\"New ledger entry contents.\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = confidentialLedgerClient.createLedgerEntryWithResponse(entry, requestOptions);

        String transactionId = response.getHeaders().get("x-ms-ccf-transaction-id").getValue();

        BinaryData parsedResponse = response.getValue();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseBodyJson = null;

        try {
            
            responseBodyJson = objectMapper.readTree(parsedResponse.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }

        Assertions.assertEquals(responseBodyJson.get("collectionId").asText(), "subledger:0");

        Response<BinaryData> transactionResponse = confidentialLedgerClient.getTransactionStatusWithResponse(transactionId, requestOptions);

        JsonNode transactionResponseBodyJson = null;

        try {
            transactionResponseBodyJson = objectMapper.readTree(transactionResponse.getValue().toBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }

        Assertions.assertEquals(transactionResponseBodyJson.get("transactionId").asText(), transactionId);
        Assertions.assertTrue(200 == transactionResponse.getStatusCode() || 406 == transactionResponse.getStatusCode());

        Response<BinaryData> currentResponse = confidentialLedgerClient.getCurrentLedgerEntryWithResponse(requestOptions);

        JsonNode currentResponseBodyJson = null;

        try {
            
            currentResponseBodyJson = objectMapper.readTree(currentResponse.getValue().toBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }

        Assertions.assertTrue(200 == currentResponse.getStatusCode() || 406 == currentResponse.getStatusCode());

        if (200 == currentResponse.getStatusCode()) {
            // we assume no one else is using this test ledger
            Assertions.assertTrue(currentResponseBodyJson.get("transactionId").asDouble() <= Double.parseDouble(transactionId));
        }
    }

    @Test
    public void testGetCollectionIdsTests() throws Exception {
        String ledgerId = Configuration.getGlobalConfiguration().get("LEDGERID", "emily-java-sdk-tests");
        // this is a built in test of getLedgerIdentity
        Response<BinaryData> ledgerIdentityWithResponse = confidentialLedgerCertificateClient
                .getLedgerIdentityWithResponse(ledgerId, null);
        BinaryData identityResponse = ledgerIdentityWithResponse.getValue();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(identityResponse.toBytes());
        String ledgerTslCertificate = jsonNode.get("ledgerTlsCertificate").asText();


        SslContext sslContext = SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(ledgerTslCertificate.getBytes(StandardCharsets.UTF_8))).build();
        reactor.netty.http.client.HttpClient reactorClient = reactor.netty.http.client.HttpClient.create()
                .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));
        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient).wiretap(true).build();

        if (getTestMode() == TestMode.PLAYBACK) {
            confidentialLedgerClientBuilder
                .httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            confidentialLedgerClientBuilder
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(httpClient)
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            confidentialLedgerClientBuilder
                .credential(new DefaultAzureCredentialBuilder().build())
                .httpClient(httpClient);
        }
        
        ConfidentialLedgerClient confidentialLedgerClient = confidentialLedgerClientBuilder.buildClient();

        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> pagedIterableResponse = confidentialLedgerClient.listCollections(requestOptions);

        List<String> collectionKeys = new ArrayList<>();

        pagedIterableResponse.streamByPage().forEach(resp -> {
            Assertions.assertEquals(200, resp.getStatusCode());
            resp.getValue().forEach(item -> {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseBodyJson = null;

                try {
                    responseBodyJson = objectMapper.readTree(item.toBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                    Assertions.assertTrue(false);
                }

                Assertions.assertNotNull(responseBodyJson.get("collectionId"));
                collectionKeys.add(responseBodyJson.get("collectionId").asText());
            });

            collectionKeys.stream().anyMatch((item) -> item.contains("subledger:0"));
        });
    }
}

