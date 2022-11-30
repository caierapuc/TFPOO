package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Entities.Espaconaves.Espaconave;
import Enums.StatusTransporte;
import Enums.TipoTransporte;

public abstract class Transporte {
    private TipoTransporte tipo;
    private int identificador;
    private EspacoPorto origem;
    private EspacoPorto destino;
    private StatusTransporte estado = StatusTransporte.PENDENTE;

    private Espaconave espaconaveResponsavel = null;

    public Transporte(TipoTransporte tipo, int identificador, EspacoPorto origem, EspacoPorto destino) {
        this.tipo = tipo;
        this.identificador = identificador;
        this.origem = origem;
        this.destino = destino;
    }

    public double calculaDistancia() {
        var pontoOrigem = (Math.sqrt(Math.pow(origem.getCoordX(), 2) + Math.pow(origem.getCoordY(), 2) + Math.pow(origem.getCoordZ(), 2)));
        var pontoDestino = (Math.sqrt(Math.pow(destino.getCoordX(), 2) + Math.pow(destino.getCoordY(), 2) + Math.pow(destino.getCoordZ(), 2)));

        var distancia = pontoDestino - pontoOrigem;

        return distancia < 0 ? (distancia * -1) : distancia;
    }

    public abstract double calculaCusto();

    public TipoTransporte getTipo(){
        return this.tipo;
    }

    public Espaconave getEspaconaveResponsavel() {
        return espaconaveResponsavel;
    }

    public void setEspaconaveResponsavel(Espaconave espaconaveResponsavel) {
        setEstado(StatusTransporte.TRANSPORTANDO);
        this.espaconaveResponsavel = espaconaveResponsavel;
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
