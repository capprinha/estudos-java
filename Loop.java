import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        Scanner leiaScanner = new Scanner(System.in);
        double nota = 0;
        double notas = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("Diga sua nota do filme:");
        //     nota = leiaScanner.nextDouble();
        //     mediaAvaliacao += nota;
        // }
        // System.out.println(mediaAvaliacao / 5);

        while (nota != -1) {
            System.out.println("Diga sua notas do filmes ou digite -1 para encerrar");
            nota = leiaScanner.nextDouble();
            if(nota != -1){
                notas += nota;
                totalDeNotas++;
                mediaAvaliacao = notas / totalDeNotas;
            } else{
                System.out.println("Encerrado");
            }

        }
        System.out.println(mediaAvaliacao);
    }
}
