package esanto.lucas.continumn.models;

import esanto.lucas.continumn.calc.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome) {
        super(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "F: " + this.getNome() + " | " + this.getAnoDeLancamento();
    }
}