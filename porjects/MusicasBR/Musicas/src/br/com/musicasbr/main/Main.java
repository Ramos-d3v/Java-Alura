package br.com.musicasbr.main;

import br.com.musicasbr.models.MinhasPreferidas;
import br.com.musicasbr.models.Musica;
import br.com.musicasbr.models.Podcast;

public class Main {
    static void main() {

        Musica m1 = new Musica();
        m1.setTitulo("666-777");
        m1.setAlbum("Maquina do tempo");
        m1.setArtista("Matue");
        m1.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            m1.reproduzir();

        }
        for (int i = 0; i < 50; i++){
            m1.curtir();
        }
        System.out.println(m1);

        Podcast p1 = new Podcast();

        for (int i = 0; i < 5000 ; i++) {
            p1.reproduzir();
        }
        for (int i = 0; i < 2000; i++){
            p1.curtir();
        }

        System.out.println(p1);

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(m1);
        preferidas.inclui(p1);


        System.out.println(preferidas);
    }
}
