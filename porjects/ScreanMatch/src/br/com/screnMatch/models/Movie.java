package br.com.screnMatch.models;

import br.com.screnMatch.calculation.Classificavel;

public class Movie extends Titulo implements Classificavel {


    public Movie() {
    }

    public Movie(String diretor) {
        this.diretor = diretor;
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2 ;
    }
}
