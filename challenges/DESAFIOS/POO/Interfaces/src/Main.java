import br.com.desafiosPOO.models.Produto;
import br.com.desafiosPOO.models.Servico;

public class Main {
    public static void main(String[] args) {
        //String nome, double precoUnitario, int quantidade
        Produto p = new Produto("Chuteira", 130, 40);
        //String tipo, double preco, int horasTrahbalhadas
        Servico s = new Servico("PJ",45,8);


        System.out.println("O preço do produto é: " + p.aplicarDesconto());
        System.out.println("O preço do serviço é: " + s.aplicarDesconto());



    }
}
