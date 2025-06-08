public class Musica {
    
    String titulo;
    String artista;
    int anoLancamento;
    double somaDeAvaliacao;
    double avaliacao;
    int numeroDeAvaliacao;


    void exibeFicha(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }

    void avaliarMusica(double nota){
        somaDeAvaliacao += nota;
        numeroDeAvaliacao++;
    }
    double mediaAvaliacao(){
        return avaliacao = somaDeAvaliacao / numeroDeAvaliacao;
    }
}
