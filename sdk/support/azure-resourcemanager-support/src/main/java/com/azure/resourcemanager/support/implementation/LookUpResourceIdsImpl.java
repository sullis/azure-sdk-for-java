// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.LookUpResourceIdsClient;
import com.azure.resourcemanager.support.fluent.models.LookUpResourceIdResponseInner;
import com.azure.resourcemanager.support.models.LookUpResourceIdRequest;
import com.azure.resourcemanager.support.models.LookUpResourceIdResponse;
import com.azure.resourcemanager.support.models.LookUpResourceIds;

public final class LookUpResourceIdsImpl implements LookUpResourceIds {
    private static final ClientLogger LOGGER = new ClientLogger(LookUpResourceIdsImpl.class);

    private final LookUpResourceIdsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public LookUpResourceIdsImpl(LookUpResourceIdsClient innerClient,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LookUpResourceIdResponse> postWithResponse(LookUpResourceIdRequest lookUpResourceIdRequest,
        Context context) {
        Response<LookUpResourceIdResponseInner> inner
            = this.serviceClient().postWithResponse(lookUpResourceIdRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LookUpResourceIdResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LookUpResourceIdResponse post(LookUpResourceIdRequest lookUpResourceIdRequest) {
        LookUpResourceIdResponseInner inner = this.serviceClient().post(lookUpResourceIdRequest);
        if (inner != null) {
            return new LookUpResourceIdResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LookUpResourceIdsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
