package br.com.caelum.jdbc.br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Contato;

import java.util.Calendar;

/**
 * Created by cleyton on 25/04/16.
 */
public class TestaRemoveC {
    public static void main(String[] args) {
        // pronto para gravar
        Contato contato = new Contato();
        contato.setId(5L);

        // Remova nessa conexão!!!
        ContatoDao dao = new ContatoDao();

        // método elegante
        dao.remove(contato);

        System.out.println("Removido!");
    }
}
