public class Movie {
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


    public Movie() {
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Movie setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        return this;
    }

    public boolean isIncluindoPLano() {
        return incluindoPLano;
    }

    public Movie setIncluindoPLano(boolean incluindoPLano) {
        this.incluindoPLano = incluindoPLano;
        return this;
    }

    public double getAvaliacao() {
        return SomaAvaliacao;
    }

    public Movie setAvaliacao(double SomaAvaliacao) {
        this.SomaAvaliacao = SomaAvaliacao;
        return this;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public Movie setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        return this;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Movie setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "\nname='" + name + '\'' +
                ", \nanoDeLancamento=" + anoDeLancamento +
                ", \nincluindoPLano=" + incluindoPLano +
                ", \nSomaAvaliacao=" + SomaAvaliacao +
                ", \ntotalDeAvaliacoes=" + totalDeAvaliacoes +
                ", \nduracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
