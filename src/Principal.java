import esanto.lucas.continumn.calc.CalcDeTempo;
import esanto.lucas.continumn.calc.FiltroRecomendado;
import esanto.lucas.continumn.models.Episodio;
import esanto.lucas.continumn.models.Filme;
import esanto.lucas.continumn.models.Serie;
import esanto.lucas.continumn.models.Titulo;

public class Principal {
    public static void main(String[] args) {

        Filme f1 = new Filme();

        f1.setNome("F1: The Movie");
        f1.setAnoDeLancamento(2025);
        f1.setGenero("Ação");
        f1.setDuracao(130);
        f1.setIncluidoNoPlano(true);

        f1.avalia(8.2);
        f1.avalia(7.6);
        f1.avalia(6.8);

            System.out.println("(" + f1.getAnoDeLancamento() + ") "+ f1.getNome() + " " + f1.getDuracao());
            System.out.println("Genero: " + f1.getGenero());
            System.out.println(f1.pegaMedia() + "/10");
            if(f1.getIncluidoNoPlano()){
                System.out.println("Assistir agora");
            }else{
                System.out.println("Assinar Plus");
            }

        Serie d = new Serie();
        d.setNome("Dark");
        d.setAtiva(true);
        d.setTemporadas(5);
        d.setEpisodiosPorTemporada(15);
        d.setGenero("Suspense");
        d.setMinutosPorEpisodio(90);
        d.setIncluidoNoPlano(true);
        d.setAnoDeLancamento(2013);

        d.avalia(8.9);
        d.avalia(9.1);
        d.avalia(9.6);

            System.out.println("(" + d.getAnoDeLancamento() + ") "+ d.getNome() + " " + d.getTemporadas());
            System.out.println("Genero: " + d.getGenero());
            System.out.println(d.pegaMedia() + "/10");
            if(d.getIncluidoNoPlano()){
                System.out.println("Assistir agora");
            }else{
                System.out.println("Assinar Plus");
            }
        CalcDeTempo calc = new CalcDeTempo();

            calc.inclui(f1);
            calc.inclui(d);

        System.out.println("Tempo para assitir tudo: " + calc.getTempoTotal());

        FiltroRecomendado filtro = new FiltroRecomendado();
        filtro.filtra(f1);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(d);
        ep.setNome("Piloto");




    }
}
