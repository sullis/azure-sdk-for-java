// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.DatabaseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Database;

public final class DatabaseImpl implements Database, Database.Definition {
    private DatabaseInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    DatabaseImpl(
        DatabaseInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String charset() {
        return this.innerModel().charset();
    }

    public String collation() {
        return this.innerModel().collation();
    }

    public DatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    public DatabaseImpl withExistingFlexibleServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public Database create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .create(resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public Database create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .create(resourceGroupName, serverName, databaseName, this.innerModel(), context);
        return this;
    }

    DatabaseImpl(String name, com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = new DatabaseInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public Database refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public Database refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public DatabaseImpl withCharset(String charset) {
        this.innerModel().withCharset(charset);
        return this;
    }

    public DatabaseImpl withCollation(String collation) {
        this.innerModel().withCollation(collation);
        return this;
    }
}
