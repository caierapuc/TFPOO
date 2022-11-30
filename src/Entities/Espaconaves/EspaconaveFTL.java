package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;

public class EspaconaveFTL extends Espaconave {
    private double capacidadePC;

    public EspaconaveFTL(String nome, EspacoPorto espacoPortoAtual, double velocidade, double capacidadePC) {
        super(nome, espacoPortoAtual, velocidade);
        this.capacidadePC = capacidadePC;
    }

    public double getCapacidadePC() {
        return capacidadePC;
    }
}