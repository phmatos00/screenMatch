import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        // Filmes

        Filme filme = new Filme();
        filme.setNome("Sem dor sem ganho");
        filme.setAnoDeLancamento(2013);
        filme.setDuracaoEmMinutos(130);

        filme.fichaTecnica();
        filme.passarAvaliacao(8);
        filme.passarAvaliacao(5);
        filme.passarAvaliacao(10);

        System.out.println("Quantas pessoas avaliaram o filme: " + filme.getTotalDeAvaliacoes());

        //Usei o DACIMALFORMAT para diminuir as casa decimais da nota IMDB
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Nota IMDB: " + df.format(filme.mediaDoFilme()));
        System.out.println();
        System.out.println();



         // Series

        Serie serie = new Serie();
        serie.setNome("lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setNumeroDeEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodios(50);


        serie.fichaTecnica();
        System.out.println("Duração em minutos: " + serie.getDuracaoEmMinutos());






    }
}
