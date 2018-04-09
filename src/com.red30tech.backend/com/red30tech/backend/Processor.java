package com.red30tech.backend;

// import com.red30tech.cache.api.Cache;
import com.red30tech.database.api.*;

public class Processor {
    public static void main(String[] args) {
        Database db = DatabaseFactory.getDatabase();
        try {
            db = com.red30tech.cache.api.Cache(db);
        } catch (Exception ex) {

        }
        System.out.println("db.get is " + db.get(1));
    }
}