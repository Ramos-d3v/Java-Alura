package br.com.banco;

public class ContaBancaria {
    private String nome;
    private String tipo;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nome, String tipo, double saldo) {
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public ContaBancaria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public ContaBancaria setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public String toString() {
        return """
                =====================
                    Nome: %s
                    Tipo conta: %s
                    Saldo bancario: %.2f
                =====================
                """.formatted(nome, tipo, saldo);
    }
}
