package br.com.caelum.jdbc.br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Funcionario;

/**
 * Created by cleyton on 25/04/16.
 */
public class TesteInsereF {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Cleyton");
        funcionario.setUser("cbpj");
        funcionario.setPass("123");

        FuncionarioDao dao = new FuncionarioDao();

        dao.adiciona(funcionario);

        System.out.println("Os dados do Funcionario " + funcionario.getNome() + " Gravados: "+ funcionario.getUser() + " | " + funcionario.getPass());
    }

}
