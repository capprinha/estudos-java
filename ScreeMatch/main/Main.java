package main;
import java.util.ArrayList;

import main.screenmatch.calculos.CalculadoraDeTempo;
import main.screenmatch.calculos.Recomendacao;
import main.screenmatch.modelos.Episodios;
import main.screenmatch.modelos.Filme;
import main.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1990);

        // meuFilme.setNome("Poderoso Chefão");
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaFilme();
        
        meuFilme.somaDasAvaliacao(9.9);
        meuFilme.somaDasAvaliacao(8.2);
        meuFilme.somaDasAvaliacao(6.9);

        System.out.println(meuFilme.retornaMediaAvaliacao());
        
        Serie lost = new Serie("Lost" ,2008);
        // lost.setNome("Lost");
        lost.setTemporadas(2);
        lost.setMinutosPorEpisodios(35);
        lost.setEspisodiosPorTemporada(22);
        System.out.println(lost.getDuracaoEmMinutos());

        Filme avatar = new Filme("Avatar", 2024);
        // avatar.setNome("Avatar");
        avatar.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);


        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        // filmeDoPaulo.setNome("Dogville");
        // filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.somaDasAvaliacao(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(avatar);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(meuFilme.toString());
        System.out.println(lost.toString());
    }
}
