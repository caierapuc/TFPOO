package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoEspaconave;
import javafx.scene.control.TextField;

public class EspaconaveFTL extends Espaconave {
    private double capacidadePC;

    public EspaconaveFTL(String nome, EspacoPorto espacoPortoAtual, double velocidade, double capacidadePC) {
        super(TipoEspaconave.FTL, nome, espacoPortoAtual, velocidade);
        this.capacidadePC = capacidadePC;
    }

    public EspaconaveFTL(TextField nomeFTL, TextField espacoPortoFTL, TextField velocidadeNaveF,
            TextField capacidadeNave) {
    }

    public double getCapacidadePC() {
        return capacidadePC;
    }
}