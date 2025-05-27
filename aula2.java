public class aula2 {
    public static void main(){
        int anoDelancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoDoPlano = "normal";
        double notaDoFilme = 8.1;

        if(anoDelancamento >= 2022 || notaDoFilme > 7.0){
            System.out.println("Lançamentos que os clientes estão curtindo!!");
        } else{
            System.out.println("Filme retro que vale a pena assistir!!");
        }

        if(incluidoNoPlano && tipoDoPlano.equals("plus")){
            System.out.println("Filme liderado!!");
        } else {
            System.out.println("Deve fazer parte de algum plano!!");
        }

    }
}
