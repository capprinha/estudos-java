public class Aula2 {
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


        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sadado";
                break;
            default:
                nomeDia = "dia invalido";
                break;
        
            }
        System.out.println(String.format("O dia é %d, %s", dia, nomeDia));

    }
}
