public abstract class Transporte {

    private int identificador;
    private EspacoPorto origem;
    private EspacoPorto destino;
    private String estado = "Pendente";

    public Transporte(int identificador, String estado, EspacoPorto origem, EspacoPorto destino) {
        this.identificador = identificador;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

}
