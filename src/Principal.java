public class Principal {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.nome = "F1: The Movie";
        f1.anoDeLancamento = 2025;
        f1.genero = "Açao";
        f1.duracao = 2.35;
        f1.incluidoNoPlano = true;

        f1.avalia(8.2);
        f1.avalia(7.6);
        f1.avalia(6.8);

        f1.exiberFicha();

    }
}
