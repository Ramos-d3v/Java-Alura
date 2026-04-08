import br.com.banco.ContaBancaria;
import br.com.banco.ContaMetodos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContaBancaria enzo = new ContaBancaria("Enzo", "Poupança", 1000.00);
    ContaMetodos metodos = new ContaMetodos();
    Scanner ler = new Scanner(System.in);
    boolean sair = false;
        while (!sair) {
            System.out.println("""
                    O que deseja fazer?
                    1: Consultar valores
                    2: Receber valores
                    3: Transferir valores
                    4: Sair
                    """);
            int escolha = ler.nextByte();

            try {
                switch (escolha) {
                    case 1:
                        metodos.verSaldo(enzo.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite o valor que deseja receber");
                        double valorReceber = ler.nextDouble();
                        enzo.setSaldo(metodos.receber(enzo.getSaldo(), valorReceber));
                        break;
                    case 3:
                        System.out.println("Digite o valor qye deseja transferir");
                        double valorTransferir = ler.nextDouble();
                        enzo.setSaldo(metodos.transferir(enzo.getSaldo(), valorTransferir));
                        break;
                    case 4:
                        System.out.println("Saindo do sistema...");
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número de 1 a 4.");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Erro ao digitar número");
            }
        }
}
