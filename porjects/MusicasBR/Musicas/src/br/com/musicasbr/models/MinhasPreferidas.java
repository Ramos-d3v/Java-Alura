package br.com.musicasbr.models;

public class MinhasPreferidas {

    public void inclui(Audio a){
        if (a.getClassficacao() > 8){
            System.out.println(a.getTitulo() + "é considerado uma otima música");
        }else {
            System.out.println("Exelente opçao para ouvir depois!!!");
        }
    }

}
