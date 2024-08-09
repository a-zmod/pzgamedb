package org.azmod.zgamedb.util;

import zombie.network.ServerWorldDatabase;

import java.lang.reflect.Field;
import java.sql.*;

public class GameDBUtil implements GameDB {

    public Connection getConnection() throws SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException {

        Class<?> clazz = ServerWorldDatabase.instance.getClass();
        Field f = clazz.getDeclaredField("conn"); //Note, this can throw an exception if the field doesn't exist.
        f.setAccessible(true);

        Connection con = (java.sql.Connection) f.get(ServerWorldDatabase.instance);

        return con;
    }

    public static boolean isNullOrEmpty(String v) {
        return v == null || v.isEmpty();
    }

    public void test() throws SQLException, NoSuchFieldException, IllegalAccessException {
        Connection conn = this.getConnection();
    }

}
