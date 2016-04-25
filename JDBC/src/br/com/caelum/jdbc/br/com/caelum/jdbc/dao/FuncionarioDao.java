package br.com.caelum.jdbc.br.com.caelum.jdbc.dao;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by cleyton on 25/04/16.
 */
public class FuncionarioDao {
    private Connection connection;

    public FuncionarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "insert into funcionario" + "(nome,user,pass)" + "values (?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getUser());
            stmt.setString(3,funcionario.getPass());

            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Funcionario> getLista() {
        try {
            List<Funcionario> funcionarios = new ArrayList<>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Funcionario
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getLong("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setUser(rs.getString("user"));
                funcionario.setPass(rs.getString("pass"));

                // adicionando o objeto à lista
                funcionarios.add(funcionario);
            }
            rs.close();
            stmt.close();
            return funcionarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(Funcionario funcionario) {
        String sql = "update funcionario set nome=?, user=?, pass=?," + "where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getUser());
            stmt.setString(3, funcionario.getPass());
            stmt.setLong(5, funcionario.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Funcionario funcionario) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from funcionario where id=?");
            stmt.setLong(1, funcionario.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
