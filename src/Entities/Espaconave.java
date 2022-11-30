package Entities;

public class Espaconave {
    private String nome;
    private double valocidade;
    private EspacoPorto portoAtual = new EspacoPorto(1, "Terra", 0, 0, 0);

    public Espaconave(String nome, EspacoPorto espacoPortoAtual, double velocidade) {
        this.nome = nome;
        this.portoAtual = espacoPortoAtual;
        this.valocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public EspacoPorto getPortoAtual() {
        return portoAtual;
    }

    public double getValocidade() {
        return valocidade;
    }
}