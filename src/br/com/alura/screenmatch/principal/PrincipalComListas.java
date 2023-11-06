package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.sql.SQLOutput;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        Serie lost = new Serie("Lost", 2000);

        meuFilme.avalia(7);
        outroFilme.avalia(8);
        filmeDoPaulo.avalia(1);

        //Criando ArrayList
        //ArrayList<Titulo> lista = new ArrayList<>();

        //Maneira mais comum de se criar instanciar uma lista:
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        /* item é o nome da variável do tipo Titulo que receberá o item do arraylist chamado lista:
        // Maneira comum porém com mais códigos de exibir itens de um arraylist:
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
        }
        */

        // segunda maneira de exibir itens de um arraylist:
        //lista.forEach(item -> System.out.println(item));

        //terceira maneira de exibir itens de um arraylist:
        //lista.forEach(System.out::println);

        for(Titulo item : lista) {
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        //ArrayList<String> buscaPorArtista = new ArrayList<>();
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Felipe");
        buscaPorArtista.add("Batata");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Titulos Ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);


        //Método Comparator para ordenação:
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
