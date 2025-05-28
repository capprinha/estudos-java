import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        

        Scanner leiaScanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito??");
        String filme = leiaScanner.nextLine();
        System.out.println(filme);

        System.out.println("Ano de lançamento do filme??");
        int anoDoFilme = leiaScanner.nextInt();

        System.out.println("Sua nota do filme??");
        double notaFilme = leiaScanner.nextDouble();

        System.out.println(String.format("Nome do filme: %s, Ano: %d, Nota: %.1f", filme, anoDoFilme, notaFilme));

    }
}
