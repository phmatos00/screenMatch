package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPablo = new Filme("Dogviile", 2003);
        filmeDoPablo.avalia(10);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8); // Adicionando uma avaliação para a série

        // Usando a lista como tipo genérico Titulo (Polimorfismo!)
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPablo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        // Exemplo de lista secundária para demonstração de Collections.sort
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("AlPachino");
        buscaPorArtista.add("Mark Walberg");
        buscaPorArtista.add("Jona Hill");

        System.out.println("--- Artistas Desordenados ---");
        System.out.println(buscaPorArtista);

        // Ordena a lista de artistas
        Collections.sort(buscaPorArtista);

        System.out.println("\n--- Artistas Ordenados ---");
        System.out.println(buscaPorArtista);

        // Percorrendo a lista principal de Títulos (for-each)
        System.out.println("\n--- Fichas Técnicas ---");
        for (Titulo item : lista) {
            System.out.println("Título: " + item.getNome());

            // Verificação de tipo usando Pattern Matching (instanceof)
            if (item instanceof Filme filme) {
                System.out.println("Classificação (Filme): " + filme.getClassificacao());
            }
        } // FIM DO LOOP!

        // AQUI FORA DO LOOP: Ordenação e Impressão da lista principal (sem erro!)
        System.out.println("\n--- Lista de Títulos Ordenados ---");
        Collections.sort(lista);
        System.out.println(lista);
    }
}