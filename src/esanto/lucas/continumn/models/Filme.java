package esanto.lucas.continumn.models;

public class Filme {
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


    public void exiberFicha() {
        System.out.println("(" + anoDeLancamento + ") "+ nome + " " + duracao);
        System.out.println("Genero: " + genero);
        System.out.println(pegaMedia() + "/10");
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / numeroDeAvaliacoes;
    }
}
