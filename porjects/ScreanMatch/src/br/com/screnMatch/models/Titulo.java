package br.com.screnMatch.models;

public class Titulo {

    private String name;
    private int anoDeLancamento;
    private boolean incluindoPLano;
    private double SomaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluindo plano: " + incluindoPLano);
        System.out.println("Avaliação: " + SomaAvaliacao);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    public void avalia(double nota){
        SomaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return SomaAvaliacao / totalDeAvaliacoes;
    }


    public Titulo() {
    }

    public String getName() {
        return name;
    }

    public Titulo setName(String name) {
        this.name = name;
        return this;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Titulo setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        return this;
    }

    public boolean isIncluindoPLano() {
        return incluindoPLano;
    }

    public Titulo setIncluindoPLano(boolean incluindoPLano) {
        this.incluindoPLano = incluindoPLano;
        return this;
    }

    public double getAvaliacao() {
        return SomaAvaliacao;
    }

    public Titulo setAvaliacao(double SomaAvaliacao) {
        this.SomaAvaliacao = SomaAvaliacao;
        return this;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public Titulo setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        return this;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Titulo setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        return this;
    }

}
