import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // DEsafio, gerar um número aleatorio de 0 a 100
        // Usuario tem 5 chances
        //Deve iformar o usuario se for menor ou maior
        Scanner s = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);

        int contador = 0;
        while (true){
            if (contador >= 5){
                System.out.println("numero de tentativas esgotadas");
                break;
            }
            System.out.println("Tente adivinhar o numero:");
            int tentativa = s.nextInt();
            if (tentativa == numeroSorteado){
                System.out.println("Parabens voce acertou!");
                break;
            } else if (tentativa < numeroSorteado) {
                System.out.println("O " + tentativa + " é menor que o numero sorteado");

            }else {
                System.out.println("O " + tentativa + " é maior que o numero sorteado");
            }
            contador ++;


        }
    }
}