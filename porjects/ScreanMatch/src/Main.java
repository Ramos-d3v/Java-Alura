public class Main {
    public static void main(String[] args) {
        Movie filme = new Movie();

        filme.setName("poderoso chefão")
                .setAnoDeLancamento(1970)
                .setDuracaoEmMinutos(120)
                .setIncluindoPLano(true)
                .setAvaliacao(8.0)
                .setTotalDeAvaliacoes(1);


        filme.avalia(9.0);
        filme.avalia(7.0);
        filme.avalia(5.0);

        System.out.println(filme.pegaMedia());

        System.out.println(filme);
    }
}
