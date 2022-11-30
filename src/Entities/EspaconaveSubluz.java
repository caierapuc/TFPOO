package Entities;
public class EspaconaveSubluz extends Espaconave {

    private double velocidadeMaxima;
    private String combustivel;

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public EspaconaveSubluz(String nome, EspacoPorto espacoPortoAtual) {
        super(nome, espacoPortoAtual);
    }
    
}
