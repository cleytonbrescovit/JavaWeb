package br.com.caelum.jdbc.br.com.caelum.jdbc.modelo;

/**
 * Created by cleyton on 25/04/16.
 */
public class Funcionario {
    private Long id;
    private String nome;
    private String user;
    private String pass;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }



}
