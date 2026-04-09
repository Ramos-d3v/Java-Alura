package br.com.screnMatch.models;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int epidsodioPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpidsodioPorTemporada() {
        return epidsodioPorTemporada;
    }

    public void setEpidsodioPorTemporada(int epidsodioPorTemporada) {
        this.epidsodioPorTemporada = epidsodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getTemporada() * getEpidsodioPorTemporada() * getMinutosPorEpisodio();
    }

    @Override
    public String toString() {
        return "====Serie Informações==== ";

    }
}
