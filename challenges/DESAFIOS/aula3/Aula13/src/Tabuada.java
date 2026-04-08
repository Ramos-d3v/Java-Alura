import java.util.Scanner;

public class Tabuada {
    public static String parOuImpar(int numero){
        if (numero % 2 == 0){
            return "par";
        }else {
            return "impar";
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual numero deseja ver a tabuada");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        System.out.println("Digite um numero para ver se é par ou impar");
        numero = input.nextInt();

        System.out.println(parOuImpar(numero));


    }
}
