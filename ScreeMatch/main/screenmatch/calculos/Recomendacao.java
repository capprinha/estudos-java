package main.screenmatch.calculos;



public class Recomendacao  {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre ps preferidos no momento");
        }   else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloca na sua lista para assistir depois");
        }
    }
}
