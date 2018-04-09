package com.red30tech.database.api.impl;

import com.red30tech.database.api.Database;

public class InMemoryDatabase implements Database {

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
