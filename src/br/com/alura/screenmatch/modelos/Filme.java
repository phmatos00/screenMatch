package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Construtor: Repassa os dados para a classe mãe (Titulo)
    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Método da interface Classificavel: Define como o Filme é classificado (estrelas)nao
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    // Opcional: toString específico para Filme, se quiser diferenciar de Titulo
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}