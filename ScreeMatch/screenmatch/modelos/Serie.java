package screenmatch.modelos;

public class Serie extends Filme {
    private int temporadas;
    private int espisodiosPorTemporada;
    private boolean estaAtiva;
    private int minutosPorEpisodios;

    public int getTemporadas(){
        return temporadas;
    }
    public int getEspisodiosPorTemporada(){
        return espisodiosPorTemporada;
    }
    public boolean getEstaAtiva(){
        return estaAtiva;
    }
    public int getMinutosPorEpisodios(){
        return minutosPorEpisodios;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas; 
    }
    public void setEspisodiosPorTemporada(int espisodiosPorTemporada){
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }
    public void setEstaAtivo(boolean estaAtiva){
        this.estaAtiva = estaAtiva;
    }
    public void setMinutosPorEpisodios( int minutosPorEpisodios){
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * espisodiosPorTemporada * minutosPorEpisodios;
    }
}
