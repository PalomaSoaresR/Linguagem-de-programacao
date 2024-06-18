package com.tarefa5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private DbConfigure dbConfig;

    public DbConnection() {
        dbConfig = new DbConfigure();
    }

    public Connection getConnection() throws SQLException {
        String url = dbConfig.getUrlBd() + dbConfig.getNameBd();
        return
        DriverManager.getConnection(url, dbConfig.getUserBd(), dbConfig.getPasswordBd());
    }

    public void disconnect(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
