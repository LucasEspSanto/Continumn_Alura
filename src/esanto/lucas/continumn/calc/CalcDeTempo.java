package esanto.lucas.continumn.calc;

import esanto.lucas.continumn.models.Filme;
import esanto.lucas.continumn.models.Serie;
import esanto.lucas.continumn.models.Titulo;

public class CalcDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f || Serie s) {
//        tempoTotal += f.getDuracao();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracao();
//    }
    public void inclui(Titulo t){ // POLIMOSPHISM
        tempoTotal += t.getDuracao();
    }
}
