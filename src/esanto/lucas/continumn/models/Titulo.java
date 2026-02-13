package esanto.lucas.continumn.models;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int numeroDeAvaliacoes;
    private String genero;
    private double duracao;

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
}
