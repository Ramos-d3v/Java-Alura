package br.com.musicasbr.models;

import java.awt.font.TextHitInfo;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public Podcast() {
    }

    public Podcast(String titulo, int reproducaoes, int curtidas, int classficacao, String host, String descricao) {
        super(titulo, reproducaoes, curtidas, classficacao);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassficacao() {
        if (this.getCurtidas() > 1000){
            return 10;
        }
        else return 8;
    }

    @Override
    public String toString() {
        return "\nPodcast" +
                "\ntitulo='" + getTitulo() + '\'' +
                ", \nreproducaoes=" + getReproducaoes();

    }
}
