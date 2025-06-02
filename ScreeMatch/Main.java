import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.Recomendacao;
import screenmatch.modelos.Episodios;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaFilme();
        
        meuFilme.somaDasAvaliacao(9.9);
        meuFilme.somaDasAvaliacao(8.2);
        meuFilme.somaDasAvaliacao(6.9);

        System.out.println(meuFilme.retornaMediaAvaliacao());
        
        Serie lost = new Serie();

        lost.setTemporadas(2);
        lost.setMinutosPorEpisodios(35);
        lost.setEspisodiosPorTemporada(22);
        System.out.println(lost.getDuracaoEmMinutos());

        Filme avatar = new Filme();
        avatar.setNome("Avatar");
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
    }
}
