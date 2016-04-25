package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cleyton on 25/04/16.
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/ilegrajt","root","@Ilegra1290");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
