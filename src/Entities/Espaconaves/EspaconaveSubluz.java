package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;
import Enums.Combustiveis;
import Enums.TipoEspaconave;

public class EspaconaveSubluz extends Espaconave {
    private Combustiveis combustivel;
    
        public EspaconaveSubluz(TipoEspaconave tipo,String nome, EspacoPorto espacoPortoAtual, double velocidade, Combustiveis combustivel) {
            super(tipo, nome, espacoPortoAtual, velocidade);
            this.combustivel = combustivel;
        }

    public Combustiveis getCombustivel() {
        return combustivel;
    }
}
