// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.BackendAuthorizationHeaderCredentials;
import com.azure.resourcemanager.apimanagement.models.BackendCredentialsContract;
import com.azure.resourcemanager.apimanagement.models.BackendProperties;
import com.azure.resourcemanager.apimanagement.models.BackendProtocol;
import com.azure.resourcemanager.apimanagement.models.BackendProxyContract;
import com.azure.resourcemanager.apimanagement.models.BackendServiceFabricClusterProperties;
import com.azure.resourcemanager.apimanagement.models.BackendTlsProperties;
import com.azure.resourcemanager.apimanagement.models.X509CertificateName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Backend CreateOrUpdate. */
public final class BackendCreateOrUpdateSamples {
    /*
     * operationId: Backend_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateBackendServiceFabric
     */
    /**
     * Sample code: ApiManagementCreateBackendServiceFabric.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateBackendServiceFabric(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .backends()
            .define("sfbackend")
            .withExistingService("rg1", "apimService1")
            .withUrl("fabric:/mytestapp/mytestservice")
            .withProtocol(BackendProtocol.HTTP)
            .withDescription("Service Fabric Test App 1")
            .withProperties(
                new BackendProperties()
                    .withServiceFabricCluster(
                        new BackendServiceFabricClusterProperties()
                            .withClientCertificateId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/certificates/cert1")
                            .withMaxPartitionResolutionRetries(5)
                            .withManagementEndpoints(Arrays.asList("https://somecluster.com"))
                            .withServerX509Names(
                                Arrays
                                    .asList(
                                        new X509CertificateName()
                                            .withName("ServerCommonName1")
                                            .withIssuerCertificateThumbprint("IssuerCertificateThumbprint1")))))
            .create();
    }

    /*
     * operationId: Backend_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateBackendProxyBackend
     */
    /**
     * Sample code: ApiManagementCreateBackendProxyBackend.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateBackendProxyBackend(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .backends()
            .define("proxybackend")
            .withExistingService("rg1", "apimService1")
            .withUrl("https://backendname2644/")
            .withProtocol(BackendProtocol.HTTP)
            .withDescription("description5308")
            .withCredentials(
                new BackendCredentialsContract()
                    .withQuery(mapOf("sv", Arrays.asList("xx", "bb", "cc")))
                    .withHeaderProperty(mapOf("x-my-1", Arrays.asList("val1", "val2")))
                    .withAuthorization(
                        new BackendAuthorizationHeaderCredentials().withScheme("Basic").withParameter("opensesma")))
            .withProxy(
                new BackendProxyContract()
                    .withUrl("http://192.168.1.1:8080")
                    .withUsername("Contoso\\admin")
                    .withPassword("<password>"))
            .withTls(new BackendTlsProperties().withValidateCertificateChain(true).withValidateCertificateName(true))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
