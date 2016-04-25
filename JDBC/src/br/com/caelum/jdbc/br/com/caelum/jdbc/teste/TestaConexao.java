package br.com.caelum.jdbc.br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by cleyton on 25/04/16.
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
}
