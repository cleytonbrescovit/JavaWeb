package br.com.caelum.jdbc.br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.br.com.caelum.jdbc.modelo.Contato;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by cleyton on 25/04/16.
 */
public class TestaListaC {
    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();

        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());

            String dataFormatada = new SimpleDateFormat("dd/mm/yyyy").format(contato.getDataNascimento().getTime());

            System.out.println("Data de Nascimento: " + dataFormatada + "\n");
        }
    }
}
