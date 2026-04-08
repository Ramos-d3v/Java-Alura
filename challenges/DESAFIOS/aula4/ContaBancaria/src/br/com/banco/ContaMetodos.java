package br.com.banco;

public class ContaMetodos {
    public double receber(double valorConta, double valorReceber) {
        double valorTotal = valorConta + valorReceber;
        System.out.println("O valor na sua conta é de " + valorTotal);
        return valorTotal;
    }

    public double transferir(double valorConta, double valorTransferir){
        double valorTotal = valorConta - valorTransferir;
        System.out.println("O valor na sua conta é de " + valorTotal);
        return valorTotal;
    }

    public void verSaldo(double valorConta){
        System.out.println("O valor na sua conta é de " + valorConta);
    }
}
