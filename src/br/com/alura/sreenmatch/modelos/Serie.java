package br.com.alura.sreenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int numeroDeEpisodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodios;


    // Reescrevi o metodo fichaTecnica
    @Override
    public void fichaTecnica() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + numeroDeEpisodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodios);
        System.out.println("Duração total da série em minutos: " + getDuracaoEmMinutos());
        System.out.println("Está ativa? " + (ativa ? "Sim" : "Não"));
    }




    // Getters


    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public int getNumeroDeEpisodiosPorTemporada() {
        return numeroDeEpisodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * numeroDeEpisodiosPorTemporada * minutosPorEpisodios;
    }






    // Setters


    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setNumeroDeEpisodiosPorTemporada(int numeroDeEpisodiosPorTemporada) {
        this.numeroDeEpisodiosPorTemporada = numeroDeEpisodiosPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
}
