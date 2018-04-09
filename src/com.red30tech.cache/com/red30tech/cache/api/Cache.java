package com.red30tech.cache.api;

import com.red30tech.database.api.Database;

public class Cache implements Database {
    Database db;

    public Cache(Database db) {
        this.db = db;
    }

    public void create(Object o) {
        return;
    }

    public Object get(int id) {
        return new Object();
    }

    public Object retreive(int id) {
        return new Object();
    }

    public boolean delete(int id) {
        return true;
    }

}