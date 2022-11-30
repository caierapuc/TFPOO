package Entities;

import Enums.Combustiveis;

public class EspaconaveSubluz extends Espaconave {
    private Combustiveis combustivel;
    
        public EspaconaveSubluz(String nome, EspacoPorto espacoPortoAtual, double velocidade, Combustiveis combustivel) {
            super(nome, espacoPortoAtual, velocidade);
            this.combustivel = combustivel;
        }

    public Combustiveis getCombustivel() {
        return combustivel;
    }
}
