public class desafio {
    public static void main(){
        // desafio 1
        double notaUm = 8.1;
        double notaDois = 5.9;
        double mediaNotas = (notaUm + notaDois) / 2;
        System.out.println(mediaNotas);
        
        //desafio 2
        double x = 4.9;
        int y = (int) x;
        System.out.println(y);

        //desafio 3
        char esclamacao = '!';
        String saudacao = "Olá, mundo";
        System.out.println(saudacao + esclamacao);

        //desafio 4
        double precoProduto = 59.99;
        int quantidade = 3;
        System.out.println(precoProduto * quantidade);

        //desafio 5
        double valorEmDolar = precoProduto;
        double dolarEmReal = 4.94;
        double conversaoDolarReal = valorEmDolar * dolarEmReal;
        System.out.println(String.format("$ %.2f equivale a R$ %.2f",valorEmDolar, conversaoDolarReal));
        
        //desafio 6
        double precoOriginal = 150.0;
        double desconto = 10.0;
        double valorComDesconto = (desconto / 100.0) * precoOriginal;
        double precoComDesconto = precoOriginal - valorComDesconto;
        System.out.println(valorComDesconto);
        System.out.println(precoComDesconto);
    }
}
