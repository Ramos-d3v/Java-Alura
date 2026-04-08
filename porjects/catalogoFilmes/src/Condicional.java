public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoPlano = true;
        double notaDofilme = 8.1;
        String tipoPLano = "plus";

        if(anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme antigo");
        }

        if(incluidoPlano || tipoPLano.equals("plus")){
            System.out.println("Pode assitir");
        }else {
            System.out.println("Deve pagar a locação");
        }

    }


}
