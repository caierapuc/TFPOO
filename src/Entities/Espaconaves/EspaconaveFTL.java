package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoEspaconave;

public class EspaconaveFTL extends Espaconave {
    private double capacidadePC;

    public EspaconaveFTL(TipoEspaconave tipo,String nome, EspacoPorto espacoPortoAtual, double velocidade, double capacidadePC) {
        super(tipo, nome, espacoPortoAtual, velocidade);
        this.capacidadePC = capacidadePC;
    }

    public double getCapacidadePC() {
        return capacidadePC;
    }
}