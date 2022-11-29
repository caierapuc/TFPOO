public class EspaconaveFTL extends Espaconave {

    private double velocidadeMaximaWarp;
    private double capacidadePC;

    public EspaconaveFTL(String nome, EspacoPorto espacoPortoAtual, double velocidadeMaxima, double capacidadePC) {
        super(nome, espacoPortoAtual);
        this.velocidadeMaximaWarp = velocidadeMaxima;
        this.capacidadePC = capacidadePC;
    }

    public double getVelocidadeMaximaWarp() {
        return velocidadeMaximaWarp;
    }

    public double getCapacidadePC() {
        return capacidadePC;
    }

}
