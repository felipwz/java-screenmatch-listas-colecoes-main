package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        Serie minhaSerie = new Serie("The Last of Us", 2023);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmePreferido = new Filme("Ilha do medo", 2013);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(minhaSerie);
        lista.add(outroFilme);
        lista.add(filmePreferido);


    }
}
