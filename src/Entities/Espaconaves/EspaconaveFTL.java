package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoEspaconave;

public class EspaconaveFTL extends Espaconave {
    private double capacidadePC;

    public EspaconaveFTL(String nome, EspacoPorto espacoPortoAtual, double velocidade, double capacidadePC) {
        super(TipoEspaconave.FTL, nome, espacoPortoAtual, velocidade);
        this.capacidadePC = capacidadePC;
    }

    public double getCapacidadePC() {
        return capacidadePC;
    }
}