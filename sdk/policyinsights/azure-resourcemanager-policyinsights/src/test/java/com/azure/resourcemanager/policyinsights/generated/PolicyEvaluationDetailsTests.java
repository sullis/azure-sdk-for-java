// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.ExpressionEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.IfNotExistsEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.PolicyEvaluationDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PolicyEvaluationDetailsTests {
    @Test
    public void testDeserialize() {
        PolicyEvaluationDetails model =
            BinaryData
                .fromString(
                    "{\"evaluatedExpressions\":[{\"result\":\"nbbelda\",\"expression\":\"zbaliourqha\",\"expressionKind\":\"uhashsfwx\",\"path\":\"owzxcu\",\"operator\":\"ooxdjebwpuc\"}],\"ifNotExistsDetails\":{\"resourceId\":\"vo\",\"totalResources\":1748456219}}")
                .toObject(PolicyEvaluationDetails.class);
        Assertions.assertEquals("nbbelda", model.evaluatedExpressions().get(0).result());
        Assertions.assertEquals("zbaliourqha", model.evaluatedExpressions().get(0).expression());
        Assertions.assertEquals("owzxcu", model.evaluatedExpressions().get(0).path());
        Assertions.assertEquals("ooxdjebwpuc", model.evaluatedExpressions().get(0).operator());
        Assertions.assertEquals("vo", model.ifNotExistsDetails().resourceId());
        Assertions.assertEquals(1748456219, model.ifNotExistsDetails().totalResources());
    }

    @Test
    public void testSerialize() {
        PolicyEvaluationDetails model =
            new PolicyEvaluationDetails()
                .withEvaluatedExpressions(
                    Arrays
                        .asList(
                            new ExpressionEvaluationDetails()
                                .withResult("nbbelda")
                                .withExpression("zbaliourqha")
                                .withPath("owzxcu")
                                .withOperator("ooxdjebwpuc")))
                .withIfNotExistsDetails(
                    new IfNotExistsEvaluationDetails().withResourceId("vo").withTotalResources(1748456219));
        model = BinaryData.fromObject(model).toObject(PolicyEvaluationDetails.class);
        Assertions.assertEquals("nbbelda", model.evaluatedExpressions().get(0).result());
        Assertions.assertEquals("zbaliourqha", model.evaluatedExpressions().get(0).expression());
        Assertions.assertEquals("owzxcu", model.evaluatedExpressions().get(0).path());
        Assertions.assertEquals("ooxdjebwpuc", model.evaluatedExpressions().get(0).operator());
        Assertions.assertEquals("vo", model.ifNotExistsDetails().resourceId());
        Assertions.assertEquals(1748456219, model.ifNotExistsDetails().totalResources());
    }
}
