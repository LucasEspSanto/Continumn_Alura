import esanto.lucas.continumn.models.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme f1 = new Filme();

        f1.setNome("F1: The Movie");
        f1.setAnoDeLancamento(2025);
        f1.setGenero("Ação");
        f1.setDuracao(2.35);
        f1.setIncluidoNoPlano(true);

        f1.avalia(8.2);
        f1.avalia(7.6);
        f1.avalia(6.8);

        f1.exiberFicha();

    }
}
