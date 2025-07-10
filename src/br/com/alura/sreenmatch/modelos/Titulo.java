package br.com.alura.sreenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;




    // Getters: Usa-se para acessar um atributo privado, apenas o expõe para cosnulta.

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public String getNome() {

        return nome;
    }

    public int getAnoDeLancamento() {

        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }




    // Setters:  Permite modificar o valor do atributo de um objeto.

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }




    // Metodos

    public void fichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Tempo de filme: " + duracaoEmMinutos + "Min");
    }

    public void passarAvaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double mediaDoFilme() {
        return somaDasAvaliacoes / totalDeAvaliacoes;


    }
}
