package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.StatusTransporte;
import Enums.TipoTransporte;

public abstract class Transporte {
    private TipoTransporte tipo;
    private int identificador;
    private EspacoPorto origem;
    private EspacoPorto destino;
    private StatusTransporte estado = StatusTransporte.PENDENTE;

    public Transporte(TipoTransporte tipo, int identificador, EspacoPorto origem, EspacoPorto destino) {
        this.tipo = tipo;
        this.identificador = identificador;
        this.origem = origem;
        this.destino = destino;
    }

    public abstract double calculaDistancia();

    public abstract double calculaCusto();

    public TipoTransporte getTipo(){
        return this.tipo;
    }

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
