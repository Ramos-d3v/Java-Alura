package br.com.desafiosPOO.models;

import br.com.desafiosPOO.calculator.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;
    private int quantidade;


    public Produto() {
    }

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPreco() {
        return (int) (getPrecoUnitario() * getQuantidade());
    }

    @Override
    public double aplicarDesconto() {
        if (quantidade <= 5){
            return  calcularPreco();
        }else  {
            return calcularPreco() * 0.9;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "\nnome='" + nome + '\'' +
                ", \nprecoUnitario=" + precoUnitario +
                ", \nquantidade=" + quantidade +
                '}';
    }
}
