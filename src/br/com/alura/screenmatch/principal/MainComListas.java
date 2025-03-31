package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O podeoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisUmFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filmeF && filmeF.getClassificacao() > 2) {
                System.out.println(filmeF.getClassificacao());
            }
        }

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Pedro");
        listaDeNomes.add("Gabriel");
        listaDeNomes.add("Mateus");
        listaDeNomes.add("Marcio");
        listaDeNomes.add("Giulia");

        System.out.println(listaDeNomes);
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }

}