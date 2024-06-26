// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupInner;
import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupsInner;
import com.azure.resourcemanager.security.models.ConfigurationStatus;
import com.azure.resourcemanager.security.models.EnforcementMode;
import com.azure.resourcemanager.security.models.EnforcementSupport;
import com.azure.resourcemanager.security.models.FileType;
import com.azure.resourcemanager.security.models.PathRecommendation;
import com.azure.resourcemanager.security.models.ProtectionMode;
import com.azure.resourcemanager.security.models.PublisherInfo;
import com.azure.resourcemanager.security.models.RecommendationAction;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.UserRecommendation;
import com.azure.resourcemanager.security.models.VmRecommendation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AdaptiveApplicationControlGroupsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdaptiveApplicationControlGroupsInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"enforcementMode\":\"Enforce\",\"protectionMode\":{\"exe\":\"Audit\",\"msi\":\"None\",\"script\":\"None\",\"executable\":\"Audit\"},\"configurationStatus\":\"InProgress\",\"recommendationStatus\":\"NoStatus\",\"issues\":[{\"issue\":\"ViolationsBlocked\",\"numberOfVms\":90.65406}],\"sourceSystem\":\"NonAzure_AuditD\",\"vmRecommendations\":[{\"configurationStatus\":\"Failed\",\"recommendationAction\":\"Remove\",\"resourceId\":\"fsbw\",\"enforcementSupport\":\"Unknown\"}],\"pathRecommendations\":[{\"path\":\"zipbwxgoooxzp\",\"action\":\"Add\",\"type\":\"IoT_ACRAuthentication\",\"publisherInfo\":{},\"common\":true,\"userSids\":[\"dgzigjsugswhgs\",\"odkwwnbafocto\",\"zhaquvwsxb\",\"nvkervq\"],\"usernames\":[{},{},{}],\"fileType\":\"Exe\",\"configurationStatus\":\"Configured\"}]},\"location\":\"xq\",\"id\":\"z\",\"name\":\"spabdsrgfa\",\"type\":\"glzrs\"},{\"properties\":{\"enforcementMode\":\"Enforce\",\"protectionMode\":{\"exe\":\"Audit\",\"msi\":\"Audit\",\"script\":\"None\",\"executable\":\"Enforce\"},\"configurationStatus\":\"NoStatus\",\"recommendationStatus\":\"NotRecommended\",\"issues\":[{\"issue\":\"MsiAndScriptViolationsAudited\",\"numberOfVms\":15.221012}],\"sourceSystem\":\"NonAzure_AuditD\",\"vmRecommendations\":[{\"configurationStatus\":\"Configured\",\"recommendationAction\":\"Remove\",\"resourceId\":\"xv\",\"enforcementSupport\":\"Unknown\"}],\"pathRecommendations\":[{\"path\":\"w\",\"action\":\"Add\",\"type\":\"IoT_EdgeLoggingOptions\",\"publisherInfo\":{},\"common\":false,\"userSids\":[\"upwtz\",\"pak\",\"ozkxbzrpejplss\"],\"usernames\":[{}],\"fileType\":\"Script\",\"configurationStatus\":\"Failed\"},{\"path\":\"s\",\"action\":\"Remove\",\"type\":\"IoT_SharedCredentials\",\"publisherInfo\":{},\"common\":false,\"userSids\":[\"jhboyikebhuhks\"],\"usernames\":[{},{},{},{}],\"fileType\":\"Dll\",\"configurationStatus\":\"NotConfigured\"}]},\"location\":\"eoijyzcqypzqzufg\",\"id\":\"yfejyvdwtf\",\"name\":\"ptpqayamkn\",\"type\":\"fgybmxs\"},{\"properties\":{\"enforcementMode\":\"Enforce\",\"protectionMode\":{\"exe\":\"Enforce\",\"msi\":\"Audit\",\"script\":\"None\",\"executable\":\"Enforce\"},\"configurationStatus\":\"Configured\",\"recommendationStatus\":\"Recommended\",\"issues\":[{\"issue\":\"MsiAndScriptViolationsBlocked\",\"numberOfVms\":83.47664},{\"issue\":\"MsiAndScriptViolationsBlocked\",\"numberOfVms\":32.04338},{\"issue\":\"ViolationsBlocked\",\"numberOfVms\":44.41558},{\"issue\":\"ViolationsAudited\",\"numberOfVms\":96.23886}],\"sourceSystem\":\"NonAzure_AuditD\",\"vmRecommendations\":[{\"configurationStatus\":\"InProgress\",\"recommendationAction\":\"Add\",\"resourceId\":\"hbj\",\"enforcementSupport\":\"NotSupported\"},{\"configurationStatus\":\"NoStatus\",\"recommendationAction\":\"Remove\",\"resourceId\":\"sfpyxx\",\"enforcementSupport\":\"Supported\"}],\"pathRecommendations\":[{\"path\":\"cominxojjluxx\",\"action\":\"Recommended\",\"type\":\"IoT_SharedCredentials\",\"publisherInfo\":{},\"common\":false,\"userSids\":[\"jmueza\"],\"usernames\":[{},{},{}],\"fileType\":\"Script\",\"configurationStatus\":\"InProgress\"},{\"path\":\"otokhtvwtaznk\",\"action\":\"Remove\",\"type\":\"IoT_PermissiveFirewallPolicy\",\"publisherInfo\":{},\"common\":true,\"userSids\":[\"gwhnkbtlwlj\",\"smctsn\",\"dkpwolgisub\",\"bteogfg\"],\"usernames\":[{}],\"fileType\":\"Unknown\",\"configurationStatus\":\"NoStatus\"}]},\"location\":\"lefksxq\",\"id\":\"eazfpxgnmqvzvlu\",\"name\":\"q\",\"type\":\"aiossscyvaifp\"}]}")
            .toObject(AdaptiveApplicationControlGroupsInner.class);
        Assertions.assertEquals(EnforcementMode.ENFORCE, model.value().get(0).enforcementMode());
        Assertions.assertEquals(EnforcementMode.AUDIT, model.value().get(0).protectionMode().exe());
        Assertions.assertEquals(EnforcementMode.NONE, model.value().get(0).protectionMode().msi());
        Assertions.assertEquals(EnforcementMode.NONE, model.value().get(0).protectionMode().script());
        Assertions.assertEquals(EnforcementMode.AUDIT, model.value().get(0).protectionMode().executable());
        Assertions.assertEquals(ConfigurationStatus.FAILED,
            model.value().get(0).vmRecommendations().get(0).configurationStatus());
        Assertions.assertEquals(RecommendationAction.REMOVE,
            model.value().get(0).vmRecommendations().get(0).recommendationAction());
        Assertions.assertEquals("fsbw", model.value().get(0).vmRecommendations().get(0).resourceId());
        Assertions.assertEquals(EnforcementSupport.UNKNOWN,
            model.value().get(0).vmRecommendations().get(0).enforcementSupport());
        Assertions.assertEquals("zipbwxgoooxzp", model.value().get(0).pathRecommendations().get(0).path());
        Assertions.assertEquals(RecommendationAction.ADD, model.value().get(0).pathRecommendations().get(0).action());
        Assertions.assertEquals(RecommendationType.IO_T_ACRAUTHENTICATION,
            model.value().get(0).pathRecommendations().get(0).type());
        Assertions.assertEquals(true, model.value().get(0).pathRecommendations().get(0).common());
        Assertions.assertEquals("dgzigjsugswhgs", model.value().get(0).pathRecommendations().get(0).userSids().get(0));
        Assertions.assertEquals(FileType.EXE, model.value().get(0).pathRecommendations().get(0).fileType());
        Assertions.assertEquals(ConfigurationStatus.CONFIGURED,
            model.value().get(0).pathRecommendations().get(0).configurationStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdaptiveApplicationControlGroupsInner model
            = new AdaptiveApplicationControlGroupsInner()
                .withValue(Arrays.asList(
                    new AdaptiveApplicationControlGroupInner().withEnforcementMode(EnforcementMode.ENFORCE)
                        .withProtectionMode(
                            new ProtectionMode().withExe(EnforcementMode.AUDIT).withMsi(EnforcementMode.NONE)
                                .withScript(EnforcementMode.NONE).withExecutable(EnforcementMode.AUDIT))
                        .withVmRecommendations(
                            Arrays.asList(new VmRecommendation().withConfigurationStatus(ConfigurationStatus.FAILED)
                                .withRecommendationAction(RecommendationAction.REMOVE).withResourceId("fsbw")
                                .withEnforcementSupport(EnforcementSupport.UNKNOWN)))
                        .withPathRecommendations(Arrays.asList(new PathRecommendation().withPath("zipbwxgoooxzp")
                            .withAction(RecommendationAction.ADD).withType(RecommendationType.IO_T_ACRAUTHENTICATION)
                            .withPublisherInfo(new PublisherInfo()).withCommon(true)
                            .withUserSids(Arrays.asList("dgzigjsugswhgs", "odkwwnbafocto", "zhaquvwsxb", "nvkervq"))
                            .withUsernames(Arrays.asList(new UserRecommendation(), new UserRecommendation(),
                                new UserRecommendation()))
                            .withFileType(FileType.EXE).withConfigurationStatus(ConfigurationStatus.CONFIGURED))),
                    new AdaptiveApplicationControlGroupInner().withEnforcementMode(EnforcementMode.ENFORCE)
                        .withProtectionMode(new ProtectionMode().withExe(EnforcementMode.AUDIT)
                            .withMsi(EnforcementMode.AUDIT).withScript(EnforcementMode.NONE).withExecutable(
                                EnforcementMode.ENFORCE))
                        .withVmRecommendations(
                            Arrays
                                .asList(
                                    new VmRecommendation().withConfigurationStatus(ConfigurationStatus.CONFIGURED)
                                        .withRecommendationAction(
                                            RecommendationAction.REMOVE)
                                        .withResourceId("xv").withEnforcementSupport(EnforcementSupport.UNKNOWN)))
                        .withPathRecommendations(Arrays.asList(new PathRecommendation().withPath("w")
                            .withAction(RecommendationAction.ADD).withType(RecommendationType.IO_T_EDGE_LOGGING_OPTIONS)
                            .withPublisherInfo(new PublisherInfo()).withCommon(false)
                            .withUserSids(Arrays.asList("upwtz", "pak", "ozkxbzrpejplss"))
                            .withUsernames(Arrays.asList(new UserRecommendation())).withFileType(FileType.SCRIPT)
                            .withConfigurationStatus(ConfigurationStatus.FAILED),
                            new PathRecommendation().withPath("s").withAction(RecommendationAction.REMOVE)
                                .withType(RecommendationType.IO_T_SHARED_CREDENTIALS)
                                .withPublisherInfo(new PublisherInfo()).withCommon(false)
                                .withUserSids(Arrays.asList("jhboyikebhuhks"))
                                .withUsernames(Arrays.asList(new UserRecommendation(), new UserRecommendation(),
                                    new UserRecommendation(), new UserRecommendation()))
                                .withFileType(FileType.DLL)
                                .withConfigurationStatus(ConfigurationStatus.NOT_CONFIGURED))),
                    new AdaptiveApplicationControlGroupInner().withEnforcementMode(EnforcementMode.ENFORCE)
                        .withProtectionMode(new ProtectionMode().withExe(EnforcementMode.ENFORCE)
                            .withMsi(EnforcementMode.AUDIT).withScript(EnforcementMode.NONE).withExecutable(
                                EnforcementMode.ENFORCE))
                        .withVmRecommendations(
                            Arrays
                                .asList(
                                    new VmRecommendation().withConfigurationStatus(ConfigurationStatus.IN_PROGRESS)
                                        .withRecommendationAction(RecommendationAction.ADD).withResourceId("hbj")
                                        .withEnforcementSupport(EnforcementSupport.NOT_SUPPORTED),
                                    new VmRecommendation().withConfigurationStatus(ConfigurationStatus.NO_STATUS)
                                        .withRecommendationAction(
                                            RecommendationAction.REMOVE)
                                        .withResourceId("sfpyxx").withEnforcementSupport(EnforcementSupport.SUPPORTED)))
                        .withPathRecommendations(Arrays.asList(
                            new PathRecommendation().withPath("cominxojjluxx")
                                .withAction(RecommendationAction.RECOMMENDED)
                                .withType(RecommendationType.IO_T_SHARED_CREDENTIALS)
                                .withPublisherInfo(new PublisherInfo()).withCommon(false)
                                .withUserSids(Arrays.asList("jmueza"))
                                .withUsernames(Arrays.asList(new UserRecommendation(), new UserRecommendation(),
                                    new UserRecommendation()))
                                .withFileType(FileType.SCRIPT).withConfigurationStatus(ConfigurationStatus.IN_PROGRESS),
                            new PathRecommendation().withPath("otokhtvwtaznk").withAction(RecommendationAction.REMOVE)
                                .withType(RecommendationType.IO_T_PERMISSIVE_FIREWALL_POLICY)
                                .withPublisherInfo(new PublisherInfo()).withCommon(true)
                                .withUserSids(Arrays.asList("gwhnkbtlwlj", "smctsn", "dkpwolgisub", "bteogfg"))
                                .withUsernames(Arrays.asList(new UserRecommendation())).withFileType(FileType.UNKNOWN)
                                .withConfigurationStatus(ConfigurationStatus.NO_STATUS)))));
        model = BinaryData.fromObject(model).toObject(AdaptiveApplicationControlGroupsInner.class);
        Assertions.assertEquals(EnforcementMode.ENFORCE, model.value().get(0).enforcementMode());
        Assertions.assertEquals(EnforcementMode.AUDIT, model.value().get(0).protectionMode().exe());
        Assertions.assertEquals(EnforcementMode.NONE, model.value().get(0).protectionMode().msi());
        Assertions.assertEquals(EnforcementMode.NONE, model.value().get(0).protectionMode().script());
        Assertions.assertEquals(EnforcementMode.AUDIT, model.value().get(0).protectionMode().executable());
        Assertions.assertEquals(ConfigurationStatus.FAILED,
            model.value().get(0).vmRecommendations().get(0).configurationStatus());
        Assertions.assertEquals(RecommendationAction.REMOVE,
            model.value().get(0).vmRecommendations().get(0).recommendationAction());
        Assertions.assertEquals("fsbw", model.value().get(0).vmRecommendations().get(0).resourceId());
        Assertions.assertEquals(EnforcementSupport.UNKNOWN,
            model.value().get(0).vmRecommendations().get(0).enforcementSupport());
        Assertions.assertEquals("zipbwxgoooxzp", model.value().get(0).pathRecommendations().get(0).path());
        Assertions.assertEquals(RecommendationAction.ADD, model.value().get(0).pathRecommendations().get(0).action());
        Assertions.assertEquals(RecommendationType.IO_T_ACRAUTHENTICATION,
            model.value().get(0).pathRecommendations().get(0).type());
        Assertions.assertEquals(true, model.value().get(0).pathRecommendations().get(0).common());
        Assertions.assertEquals("dgzigjsugswhgs", model.value().get(0).pathRecommendations().get(0).userSids().get(0));
        Assertions.assertEquals(FileType.EXE, model.value().get(0).pathRecommendations().get(0).fileType());
        Assertions.assertEquals(ConfigurationStatus.CONFIGURED,
            model.value().get(0).pathRecommendations().get(0).configurationStatus());
    }
}
