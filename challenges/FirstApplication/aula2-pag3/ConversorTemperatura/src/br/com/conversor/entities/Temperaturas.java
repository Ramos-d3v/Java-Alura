package br.com.conversor.entities;

public class Temperaturas {
    private int grausCelcius;
    private int gruasFahrenheit;

    public Temperaturas() {
    }

    public Temperaturas(int grausCelcius, int gruasFahrenheit) {
        this.grausCelcius = grausCelcius;
        this.gruasFahrenheit = gruasFahrenheit;
    }


    public int getGrausCelcius() {
        return grausCelcius;
    }

    public void setGrausCelcius(int grausCelcius) {
        this.grausCelcius = grausCelcius;
    }

    public int getGruasFahrenheit() {
        return gruasFahrenheit;
    }

    public void setGruasFahrenheit(int gruasFahrenheit) {
        this.gruasFahrenheit = gruasFahrenheit;
    }

    public int toFahrenheit(int grausCelcius){
        return (int)(grausCelcius * 1.8) + 32;
    }

    public int toCelsios(int gruasFahrenheit){
        return (int)(gruasFahrenheit - 32) * 5/9;
    }



    @Override
    public String toString() {
        return "======Temperaturas informações=====" +
                "\ngrausCelcius=" + grausCelcius +
                ", \ngruasFahrenheit=" + gruasFahrenheit;
    }
}
