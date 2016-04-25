package br.com.caelum.jdbc.br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Contato;

import java.util.Calendar;

/**
 * Created by cleyton on 25/04/16.
 */
public class TestaAlteraC {
    public static void main(String[] args) {
        // pronto para gravar
        Contato contato = new Contato();
        contato.setNome("novo meu");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj57");
        contato.setDataNascimento(Calendar.getInstance());
        contato.setId(4L);

        // grave nessa conexão!!!
        ContatoDao dao = new ContatoDao();

        // método elegante
        dao.altera(contato);

        System.out.println("Alterado!");
    }
}
