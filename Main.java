public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaFilme();
        
        meuFilme.somaDasAvaliacao(9.9);
        meuFilme.somaDasAvaliacao(8.2);
        meuFilme.somaDasAvaliacao(6.9);

        System.out.println(meuFilme.retornaMediaAvaliacao());
        
    }
}
