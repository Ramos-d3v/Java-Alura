//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("esse é o Screen Match");

        System.out.println("Filme: TOp Gun: maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano d lançameto: "+ anoDeLancamento);

        boolean incluidoPlano = true;
        double notaDofilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse = """
                Filme de 
                aventura com 
                galã dos anos: 80
                """;
        System.out.println(media);
        System.out.println(sinopse);


        int classificacao;
        classificacao = (int) media/2;

        System.out.println(classificacao);

    }
}