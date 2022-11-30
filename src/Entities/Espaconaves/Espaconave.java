package Entities.Espaconaves;

import java.util.ArrayList;
import Entities.EspacoPorto.EspacoPorto;
import Entities.Transporte.Transporte;
import Enums.TipoEspaconave;

public class Espaconave {
    private TipoEspaconave tipo;
    private String nome;
    private double velocidade;
    private EspacoPorto portoAtual;
    private boolean busy = false;
    
    private ArrayList<Transporte> historico = new ArrayList<Transporte>();
    private Transporte transporteAtual = null;

    public Espaconave(TipoEspaconave tipo, String nome, EspacoPorto espacoPortoAtual, double velocidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.portoAtual = espacoPortoAtual;
        this.velocidade = velocidade;
    }

    public ArrayList<Transporte> getHistorico() {
        return new ArrayList<Transporte>(historico);
    }

    public boolean addHistorico(Transporte obj) {
        return this.historico.add(obj);
    }

    public Transporte getTransporteAtual() {
        return transporteAtual;
    }

    public void setTransporteAtual(Transporte transporteAtual) {
        this.transporteAtual = transporteAtual;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setPortoAtual(EspacoPorto portoAtual) {
        this.portoAtual = portoAtual;
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