public class Main {
    public static void main() {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        String nomeFilme = "Top Gun: Maverick";
        int anoTopGun = 2022;
        System.out.println("Ano de lançamento: " + anoTopGun);
        boolean incluidoNoPlano = true;
        double notaTopGun = 8.1;

        double media = (notaTopGun + 9.1 + 6.3) / 3;
        System.out.println(media);

        String sinopse = "Filme de ação";

        System.out.println(String.format("Nome do filme: %s, Ano de lançamento: %d, Nota do filme: %.1f",nomeFilme, anoTopGun, notaTopGun ));
        
        int classficacao = (int) (media / 2);
        System.out.println(classficacao);
    
    } 
}
    