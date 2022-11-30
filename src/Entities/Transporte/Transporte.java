package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.StatusTransporte;

public abstract class Transporte {
    private int identificador;
    private EspacoPorto origem;
    private EspacoPorto destino;
    private StatusTransporte estado = StatusTransporte.PENDENTE;

    public Transporte(int identificador, EspacoPorto origem, EspacoPorto destino) {
        this.identificador = identificador;
        this.origem = origem;
        this.destino = destino;
    }

    public abstract double calculaDistancia();

    public abstract double calculaCusto();

    public EspacoPorto getOrigem() {
        return origem;
    }

    public EspacoPorto getDestino() {
        return destino;
    }

    public int getIdentificador() {
        return identificador;
    }

    public StatusTransporte getEstado() {
        return estado;
    }

    public void setEstado(StatusTransporte estado) {
        this.estado = estado;
    }
}
