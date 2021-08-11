// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ContainerRegistryAudience;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.http.HttpClient;
import com.azure.core.test.TestMode;
import com.azure.core.util.Context;
import com.azure.identity.AzureAuthorityHosts;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.LATEST_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_1;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT_PLAYBACK;
import static com.azure.containers.containerregistry.TestUtils.V1_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V2_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V3_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V4_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.getAuthority;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContainerRegistryClientIntegrationTests extends ContainerRegistryClientsTestBase {

    private ContainerRegistryAsyncClient registryAsyncClient;
    private ContainerRegistryClient registryClient;

    private ContainerRegistryAsyncClient getContainerRegistryAsyncClient(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient).buildAsyncClient();
    }

    private ContainerRegistryClient getContainerRegistryClient(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient).buildClient();
    }

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(getTestMode(), HELLO_WORLD_REPOSITORY_NAME, Arrays.asList("latest", "v1", "v2", "v3", "v4"));
        TestUtils.importImage(
            getTestMode(),
            ALPINE_REPOSITORY_NAME,
            Arrays.asList(
                LATEST_TAG_NAME,
                V1_TAG_NAME,
                V2_TAG_NAME,
                V3_TAG_NAME,
                V4_TAG_NAME));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoryNames(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        StepVerifier.create(registryAsyncClient.listRepositoryNames())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(this::validateRepositories)
            .verifyComplete();

        List<String> repositories = registryClient.listRepositoryNames().stream().collect(Collectors.toList());
        validateRepositories(repositories);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoryNamesWithPageSize(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        StepVerifier.create(registryAsyncClient.listRepositoryNames().byPage(PAGESIZE_1))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(this::validateRepositoriesByPage)
            .verifyComplete();

        ArrayList<String> repositories = new ArrayList<>();
        registryClient.listRepositoryNames().iterableByPage(PAGESIZE_1)
            .forEach(res -> repositories.addAll(res.getValue()));
        validateRepositories(repositories);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoryNamesWithInvalidPageSize(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        ArrayList<String> repositories = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> registryClient.listRepositoryNames().iterableByPage(-1)
            .forEach(res -> repositories.addAll(res.getValue())));

        StepVerifier.create(registryAsyncClient.listRepositoryNames().byPage(-1))
            .verifyError(IllegalArgumentException.class);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void deleteRepositoryWithResponseThrows(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        StepVerifier.create(registryAsyncClient.deleteRepositoryWithResponse(null))
            .verifyError(NullPointerException.class);

        assertThrows(NullPointerException.class, () -> registryClient.deleteRepository(null));

        assertThrows(NullPointerException.class, () -> registryClient.deleteRepositoryWithResponse(null, Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getContainerRepository(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        ContainerRepositoryAsync repositoryAsync = registryAsyncClient.getRepository(HELLO_WORLD_REPOSITORY_NAME);
        assertNotNull(repositoryAsync);
        StepVerifier.create(repositoryAsync.getProperties())
            .assertNext(this::validateProperties)
            .verifyComplete();

        ContainerRepository repository = registryClient.getRepository(HELLO_WORLD_REPOSITORY_NAME);
        assertNotNull(repository);
        validateProperties(repository.getProperties());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getArtifactRegistry(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        RegistryArtifactAsync registryArtifactAsync = registryAsyncClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, LATEST_TAG_NAME);
        assertNotNull(registryArtifactAsync);
        StepVerifier.create(registryArtifactAsync.getManifestProperties())
            .assertNext(res -> validateManifestProperties(res, true, false))
            .verifyComplete();

        RegistryArtifact registryArtifact = registryClient.getArtifact(HELLO_WORLD_REPOSITORY_NAME, LATEST_TAG_NAME);
        assertNotNull(registryArtifact);
        validateManifestProperties(registryArtifact.getManifestProperties(), true, false);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void convenienceProperties(HttpClient httpClient) {
        registryAsyncClient = getContainerRegistryAsyncClient(httpClient);
        registryClient = getContainerRegistryClient(httpClient);

        String registryEndpoint = REGISTRY_ENDPOINT;
        if (getTestMode() == TestMode.PLAYBACK) {
            registryEndpoint = REGISTRY_ENDPOINT_PLAYBACK;
        }

        assertEquals(registryEndpoint, registryAsyncClient.getEndpoint());
        assertEquals(registryEndpoint, registryClient.getEndpoint());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void audienceTest(HttpClient httpClient) {
        Assumptions.assumeFalse(getTestMode().equals(TestMode.PLAYBACK));
        Assumptions.assumeFalse(REGISTRY_ENDPOINT == null);
        Assumptions.assumeTrue(getAuthority(REGISTRY_ENDPOINT).equals(AzureAuthorityHosts.AZURE_PUBLIC_CLOUD));
        ContainerRegistryClient registryClient = getContainerRegistryBuilder(httpClient)
            .audience(ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_PUBLIC_CLOUD)
            .buildClient();

        List<String> repositories = registryClient.listRepositoryNames().stream().collect(Collectors.toList());
        validateRepositories(repositories);

        ContainerRegistryClient throwableRegistryClient = getContainerRegistryBuilder(httpClient)
            .audience(ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_GOVERNMENT)
            .buildClient();
        assertThrows(ClientAuthenticationException.class, () -> throwableRegistryClient.listRepositoryNames().stream().collect(Collectors.toList()));
    }
}

