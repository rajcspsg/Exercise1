package com.red30tech.database.api;

public interface Database {
    public void create(Object o);
    public Object get(int id);
    public Object retreive(int id);
    public boolean delete(int id);
}
