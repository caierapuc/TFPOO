package Entities.Espaconaves;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoEspaconave;

public class Espaconave {
    private TipoEspaconave tipo;
    private String nome;
    private double velocidade;
    private EspacoPorto portoAtual = new EspacoPorto(1, "Terra", 0, 0, 0);

    public Espaconave(TipoEspaconave tipo, String nome, EspacoPorto espacoPortoAtual, double velocidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.portoAtual = espacoPortoAtual;
        this.velocidade = velocidade;
    }

    public TipoEspaconave getTipo(){
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public EspacoPorto getPortoAtual() {
        return portoAtual;
    }

    public double getValocidade() {
        return velocidade;
    }
}