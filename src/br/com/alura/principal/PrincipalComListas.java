package br.com.alura.principal;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
                Filme meuFilme = new Filme("O poderoso chefão", 1970);
                meuFilme.avalia(6);
                Filme outroFilme = new Filme("Avatar", 2023);
                outroFilme.avalia(6);
                var filmeDoPablo = new Filme("Dogviile", 2003);
                filmeDoPablo.avalia(10);
                Serie lost = new Serie("Lost", 2000);

                ArrayList<Titulo> lista = new ArrayList<>();
                lista.add(filmeDoPablo);
                lista.add(meuFilme);
                lista.add(outroFilme);
                lista.add(lost);


                //O "for-each" é usado para percorrer a lista de títulos (lista) e imprimir o nome de cada título.
                for (Titulo item: lista){

                    System.out.println(item.getNome());
                    //O instanceof serve para verificar se um objeto é uma instância de uma determinada classe ou de uma de suas subclasses.
                    if (item instanceof Filme filme) {
                        System.out.println("Classificação " + filme.getClassificacao());

                    }

                    //Filme filme = (Filme)item; //(type casting): Em termos simples, você está dizendo ao compilador: "Eu sei que item é um Titulo, mas neste caso específico, eu tenho certeza que ele é um Filme. Então, trate-o como um Filme e atribua-o à variável filme."

                }




            }
        }


