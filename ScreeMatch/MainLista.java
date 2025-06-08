import java.util.ArrayList;
import java.util.Collections;

import main.screenmatch.modelos.Filme;
import main.screenmatch.modelos.Serie;
import main.screenmatch.modelos.Titulo;

public class MainLista {
    public static void main(String[] args) {
    
        Filme meuFilme = new Filme("Poderoso Chefão", 1990);
        meuFilme.somaDasAvaliacao(9);
        Serie lost = new Serie("Lost" ,2008);
        lost.somaDasAvaliacao(7);
        Filme avatar = new Filme("Avatar", 2024);
        avatar.somaDasAvaliacao(8);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.somaDasAvaliacao(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(avatar);
        lista.add(meuFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getClassificacao());
        }

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Paula");
        nomes.add("Augusto");
        nomes.add("Luana");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
