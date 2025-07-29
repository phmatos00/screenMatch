package br.com.alura.sreenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    // Atributos
    private String diretor;


    //Getters e setters

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;

    }

    // Interface

    @Override
    public int getClassificacao() {
        return (int) mediaDoFilme() / 2;
    }
}
