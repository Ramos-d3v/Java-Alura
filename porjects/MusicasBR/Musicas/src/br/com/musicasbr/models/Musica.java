package br.com.musicasbr.models;

import java.lang.invoke.StringConcatFactory;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public Musica() {
    }

    public Musica(String titulo, int reproducaoes, int curtidas, int classficacao, String album, String artista, String genero) {
        super(titulo, reproducaoes, curtidas, classficacao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public int getClassficacao() {
        if (this.getReproducaoes() > 2000){
            return 10;
        }else {
            return 7;
        }
    }

    @Override
    public String toString() {
        return "\nMusica" +
                "\nTitulo='" + getTitulo() + '\'' +
                ", \nreproducaoes=" + getReproducaoes() +
                "\ncurtidas=" + getCurtidas();
    }
}
