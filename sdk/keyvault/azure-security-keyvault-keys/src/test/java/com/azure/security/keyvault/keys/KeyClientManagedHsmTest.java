// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.keyvault.keys;

import com.azure.core.http.HttpClient;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.security.keyvault.keys.models.KeyType;
import com.azure.security.keyvault.keys.models.KeyVaultKey;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;

import static com.azure.security.keyvault.keys.cryptography.TestHelper.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyClientManagedHsmTest extends KeyClientTest {
    public KeyClientManagedHsmTest() {
        this.isManagedHsmTest = Configuration.getGlobalConfiguration().get("AZURE_MANAGEDHSM_ENDPOINT") != null;
    }

    @Override
    protected void beforeTest() {
        Assumptions.assumeTrue(isManagedHsmTest || getTestMode() == TestMode.PLAYBACK);

        super.beforeTest();
    }

    /**
     * Tests that an RSA key with a public exponent can be created in the key vault.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getTestParameters")
    public void createRsaKeyWithPublicExponent(HttpClient httpClient, KeyServiceVersion serviceVersion) {
        createKeyClient(httpClient, serviceVersion);
        createRsaKeyWithPublicExponentRunner((createRsaKeyOptions) -> {
            KeyVaultKey rsaKey = client.createRsaKey(createRsaKeyOptions);

            assertEquals(createRsaKeyOptions.getName(), rsaKey.getName());
            assertEquals(KeyType.RSA_HSM, rsaKey.getKey().getKeyType());
            assertEquals(createRsaKeyOptions.getExpiresOn(), rsaKey.getProperties().getExpiresOn());
            assertEquals(createRsaKeyOptions.getNotBefore(), rsaKey.getProperties().getNotBefore());
            assertEquals(createRsaKeyOptions.getTags(), rsaKey.getProperties().getTags());
            assertEquals(BigInteger.valueOf(createRsaKeyOptions.getPublicExponent()),
                toBigInteger(rsaKey.getKey().getE()));
            assertEquals(createRsaKeyOptions.getKeySize(), rsaKey.getKey().getN().length * 8);
        });
    }

    /**
     * Tests that a symmetric key is created.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getTestParameters")
    public void createOctKey(HttpClient httpClient, KeyServiceVersion serviceVersion) {
        createKeyClient(httpClient, serviceVersion);
        createOctKeyRunner((createOctKeyOptions) -> {
            KeyVaultKey octKey = client.createOctKey(createOctKeyOptions);

            assertEquals(createOctKeyOptions.getName(), octKey.getName());
            assertEquals(KeyType.OCT_HSM, octKey.getKey().getKeyType());
            assertEquals(createOctKeyOptions.getExpiresOn(), octKey.getProperties().getExpiresOn());
            assertEquals(createOctKeyOptions.getNotBefore(), octKey.getProperties().getNotBefore());
            assertEquals(createOctKeyOptions.getTags(), octKey.getProperties().getTags());
        });
    }
}
