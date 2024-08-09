package org.azmod.zgamedb.util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Example of an interface for services
 */
public interface GameDB {
    public Connection getConnection() throws NoSuchFieldException, IllegalAccessException, SQLException;
}