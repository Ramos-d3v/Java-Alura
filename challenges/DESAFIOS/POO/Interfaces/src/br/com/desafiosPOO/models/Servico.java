package br.com.desafiosPOO.models;

import br.com.desafiosPOO.calculator.Vendavel;

public class Servico implements Vendavel {
    private String tipo;
    private double preco;
    private int horasTrahbalhadas;

    public Servico() {
    }

    public Servico(String tipo, double preco, int horasTrahbalhadas) {
        this.tipo = tipo;
        this.preco = preco;
        this.horasTrahbalhadas = horasTrahbalhadas;
    }

    public int getHorasTrahbalhadas() {
        return horasTrahbalhadas;
    }

    public void setHorasTrahbalhadas(int horasTrahbalhadas) {
        this.horasTrahbalhadas = horasTrahbalhadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return preco * horasTrahbalhadas;
    }

    @Override
    public double aplicarDesconto() {
        if (horasTrahbalhadas <= 6) {
            return calcularPreco();
        } else {
            return  calcularPreco() * 0.9;
        }
    }

    @Override
    public String toString() {
        return  "Servico{" +
                "\ntipo='" + tipo + '\'' +
                ", \npreco=" + preco +
                ", \nhorasTrahbalhadas=" + horasTrahbalhadas +
                '}';


    }
}