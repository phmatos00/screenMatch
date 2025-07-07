package br.com.alura.sreenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int numeroDeEpisodios;
    private boolean ativa;
    private int minutosPorEpisodios;



    // Getters


    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }



    // Setters


    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
}
