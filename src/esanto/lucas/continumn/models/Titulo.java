package esanto.lucas.continumn.models;

import com.google.gson.annotations.SerializedName;
import esanto.lucas.continumn.exeptions.TitleNotFoundExepion;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int numeroDeAvaliacoes;
    @SerializedName("Genre")
    private String genero;
    private double duracao;

    public Titulo(TituloOmdb t) {
        if (t.title() == null) {
            throw new TitleNotFoundExepion("Este titulo não existe ou não temos em nosso catalogo");
        } else {
            this.nome = t.title();
        }
        this.genero = t.genre();
        this.anoDeLancamento = Integer.parseInt(t.year());
        this.duracao = Double.parseDouble(t.runtime().replaceAll("[^0-9.]", ""));
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / numeroDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
