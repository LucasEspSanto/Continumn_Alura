package esanto.lucas.continumn.calc;

public class FiltroRecomendado {
    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Em Alta!");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Bem Avaliado");
        } else {
            System.out.println("Assistir Depois...");
        }
    }
}
