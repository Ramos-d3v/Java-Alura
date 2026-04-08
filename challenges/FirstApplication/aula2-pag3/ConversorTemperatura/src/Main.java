import br.com.conversor.entities.Temperaturas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador  = 0;
        Temperaturas T = new Temperaturas();

        System.out.println("Coloque o valor em FAhrenheit: ");
        T.setGruasFahrenheit(s.nextInt());
        System.out.println("Coloque o valor em celisos");
        T.setGrausCelcius(s.nextInt());

        while (true){
            if (contador > 0){
                System.out.println("""
                        1: Se deseja contimuar
                        2: Para sair
                        -> Resposta:
                        """);
                int continuar = s.nextInt();
                if (continuar == 1) System.out.println("seguindo...");
                else break;
            }
            contador++;
            System.out.println(
                    """
                            O que deseja fazer? 
                            1: Transformar de celsios para farenheit
                            2: Transformar de farenheit para celsios
                            DIGITE AQUI->
                            """
            );
            int resposta = s.nextInt();

            switch (resposta){
                case 1:
                    System.out.println("O valor ficara de: " + T.toCelsios(T.getGruasFahrenheit()) + " graus Celsios");
                    break;
                case 2:
                    System.out.println("o valor ficara de: " + T.toFahrenheit(T.getGrausCelcius()) + " graus Fareheit");
                    break;


                default:
                    System.out.println("Digite 1 ou 2!!!");
            }


        }

    }
}