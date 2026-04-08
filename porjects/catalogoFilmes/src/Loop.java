import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para o " + i + " filme");
            nota = s.nextDouble();
            media += nota;

        }
        System.out.println("Media de avaliação é " + media/3);
    }
}
