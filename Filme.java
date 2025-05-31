public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    void exibirFichaFilme(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    void somaDasAvaliacao(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;
    }
    double retornaMediaAvaliacao(){
        return somaDasAvaliacao / totalDeAvaliacao;
    }
}
