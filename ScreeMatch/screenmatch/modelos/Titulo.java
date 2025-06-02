package screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluindoNoPlano(boolean incluindoNoPlano){
        this.incluindoNoPlano = incluindoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public void exibirFichaFilme(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void somaDasAvaliacao(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;
    }
    public double retornaMediaAvaliacao(){
        return somaDasAvaliacao / totalDeAvaliacao;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
}


