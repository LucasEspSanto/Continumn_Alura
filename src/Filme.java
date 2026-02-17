public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
private double somaAvaliacoes;
private int numeroDeAvaliacoes;
    String genero;
    double duracao;
    

    void exiberFicha() {
        System.out.println("(" + anoDeLancamento + ") "+ nome + " " + duracao);
        System.out.println("Genero: " + genero);
        System.out.println(pegaMedia() + "/10");
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / numeroDeAvaliacoes;
    }
}
