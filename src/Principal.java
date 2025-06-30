import br.com.alura.sreenmatch.modelos.Filme;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("Sem dor sem ganho");
        filme1.setAnoDeLancamento(2013);
        filme1.setDuracaoEmMinutos(130);
        filme1.setSinopse("""
                Daniel Lugo (Mark Wahlberg) adorava malhar e trabalhava como instrutor de fisiculturismo em uma pequena academia, na Flórida, mas ele sonhava grande e queria muito mais. 
                Disposto a realizar este sonho, convence seu fiel seguidor Adrian Doorbal (Anthony Mackie), e o ex-presidiário Paul Doyle (Dwayne Johnson) a participarem de um golpe. 
                A vítima será um dos alunos de Daniel na academia, Victor Kershaw (Tony Shalhoub), um cara cheio da grana.
                O plano até que deu mais ou menos certo,mas os caras queriam mais e um investigador aposentado chamado Ed Dubois (Ed Harris) começa uma perseguição para colocá-los atrás das grades.
                """);


        filme1.fichaTecnica();
        filme1.passarAvaliacao(8);
        filme1.passarAvaliacao(5);
        filme1.passarAvaliacao(10);

        System.out.println("Quantas pessoas avaliaram o filme: " + filme1.getTotalDeAvaliacoes());

        //Usei o DACIMALFORMAT para diminuir as casa decimais da nota IMDB
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Nota IMDB: " + df.format(filme1.mediaDoFilme()));



    }
}
