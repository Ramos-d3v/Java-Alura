import java.util.Scanner;

public class OutroLoop {

        public static void main(String[] args) {
            Scanner s  = new Scanner(System.in);
            double nota = 0;
            double media = 0;
            int contadorNotas = 0;
            while (nota != -1) {
                System.out.println("Digite a avaliação do filme, ou -1 para encerrar");
                nota = s.nextDouble();
                if (nota < 0) {
                    break;
                }else {
                    media += nota;
                }
                contadorNotas++;
            }
            System.out.println("Media de avaliação é " + media/contadorNotas);
        }
}
