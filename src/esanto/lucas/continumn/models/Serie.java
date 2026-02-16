package esanto.lucas.continumn.models;

import esanto.lucas.continumn.calc.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private double minutosPorEpisodio;

    public double getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    @Override
    public double getDuracao() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
