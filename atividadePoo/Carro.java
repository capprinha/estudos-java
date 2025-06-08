public class Carro {
    
    String modelo;
    int ano;
    String cor;
    int idade ;

    void exibeFichaCarro(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int idadeCarro(int anoAtual){
        return idade = anoAtual - ano;
    }
}
