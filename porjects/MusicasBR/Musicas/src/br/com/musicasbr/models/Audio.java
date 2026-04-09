package br.com.musicasbr.models;

public class Audio {
    private String titulo;
    private int reproducaoes;
    private int curtidas;
    private int classficacao;

    public Audio() {
    }

    public Audio(String titulo, int reproducaoes, int curtidas, int classficacao) {
        this.titulo = titulo;
        this.reproducaoes = reproducaoes;
        this.curtidas = curtidas;
        this.classficacao = classficacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getReproducaoes() {
        return reproducaoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassficacao() {
        return classficacao;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducaoes++;
    }

    @Override
    public String toString() {
        return "Audio" +
                "\ntitulo='" + titulo + '\'' +
                ", \nreproducaoes=" + reproducaoes +
                ", \ncurtidas=" + curtidas +
                ", \nclassficacao='" + classficacao + '\'';

    }



}
