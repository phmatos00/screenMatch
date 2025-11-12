package br.com.alura.principal;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
                Filme meuFilme = new Filme("O poderoso chefão", 1970);
                Filme outroFilme = new Filme("Avatar", 2023);
                var filmeDoPablo = new Filme("Dogviile", 2003);
                Serie lost = new Serie("Lost", 2000);

                ArrayList<Titulo> lista = new ArrayList<>();
                lista.add(filmeDoPablo);
                lista.add(meuFilme);
                lista.add(outroFilme);
                lista.add(lost);


                //O "for-each" é usado para percorrer a lista de títulos (lista) e imprimir o nome de cada título.
                for (Titulo item: lista){

                }




            }
        }


