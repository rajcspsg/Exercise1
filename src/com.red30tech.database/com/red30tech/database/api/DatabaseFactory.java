package com.red30tech.database.api;

import com.red30tech.database.*;
import com.red30tech.database.api.impl.*;

public class DatabaseFactory {

    public static Database getDatabase() {
        return new InMemoryDatabase();
    }
}
