import br.com.screnMatch.calculation.CalculdoraDeTempo;
import br.com.screnMatch.calculation.FiltroRecomendacao;
import br.com.screnMatch.models.Epsodio;
import br.com.screnMatch.models.Movie;
import br.com.screnMatch.models.Serie;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Movie filme = new Movie();
        filme.setName("poderoso chefão")
                .setAnoDeLancamento(1970)
                .setDuracaoEmMinutos(120)
                .setIncluindoPLano(true)
                .setAvaliacao(8.0)
                .setTotalDeAvaliacoes(1)
                .setDuracaoEmMinutos(120);

        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.avalia(9.0);
        filme.avalia(7.0);
        filme.avalia(5.0);

        System.out.println(filme.pegaMedia());

        System.out.println(filme);

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporada(10);
        lost.setEpidsodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());


        CalculdoraDeTempo calculadora = new CalculdoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());

        Movie outroFilme = new Movie();
        outroFilme.setName("Matrix");
        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(200);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtroRecomendacao(filme);

        Epsodio epsodio = new Epsodio(1,"LOST",lost, 10);
        filtro.filtroRecomendacao(epsodio);

     }
}
