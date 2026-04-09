package br.com.screnMatch.calculation;

import br.com.screnMatch.models.Titulo;

public class CalculdoraDeTempo {
    private int tempoTotal;
    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void incluiFilme(Movie m){
//        this.tempoTotalFilme += m.getDuracaoEmMinutos();
//    }
//
//    public void incluiSerie(Serie s){
//        this.tempoTotalSerie += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionadno a duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}


