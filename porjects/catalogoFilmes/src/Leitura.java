import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = s.nextLine();
        System.out.println("Seu filme favorito é " + filme);
        System.out.println("Digite o ano de lancamento");
        int anoDeLancamento = s.nextInt();
        System.out.println("O ano de lancamento é " + anoDeLancamento);
        System.out.println("Digite a sua avaliação para o filme");
        double avaliacao = s.nextDouble();

    }
}
