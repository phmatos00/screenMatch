package br.com.alura.screenmatch.calculos;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;



    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }



    //fazndo assim eu teria que criar um metdodo para filme e para qualquer outro TITULO e teria que escrever muito codigo.

   // public void inclui(Filme f) {
     //   tempoTotal += f.getDuracaoEmMinutos();



    // Aqui eu passo a superclasse desses que ja tem como herdeiros Filme e Serie, pq ambos são um Titulo.

    public void inclui (Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
