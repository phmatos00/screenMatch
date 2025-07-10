import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        // Filmes

        Filme filme1 = new Filme();
        filme1.setNome("Sem dor sem ganho");
        filme1.setAnoDeLancamento(2013);
        filme1.setDuracaoEmMinutos(130);

        filme1.fichaTecnica();
        filme1.passarAvaliacao(8);
        filme1.passarAvaliacao(5);
        filme1.passarAvaliacao(10);

        System.out.println("Quantas pessoas avaliaram o filme: " + filme1.getTotalDeAvaliacoes());

        //Usei o DACIMALFORMAT para diminuir as casa decimais da nota IMDB
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Nota IMDB: " + df.format(filme1.mediaDoFilme()));
        System.out.println();
        System.out.println();



         // Series

        Serie serie1 = new Serie();
        serie1.setNome("lost");
        serie1.setAnoDeLancamento(2000);
        serie1.setTemporadas(10);
        serie1.setNumeroDeEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodios(50);


        serie1.fichaTecnica();
        System.out.println("Duração em minutos: " + serie1.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

    }
}
