package Entities;
public class TransporteCarga extends Transporte {

    private String descricaoMaterial;
    private double carga;

    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public double getCarga() {
        return carga;
    }

    public TransporteCarga(int identificador, String estado, EspacoPorto origem, EspacoPorto destino, String descricaoMaterial, double carga) {
        super(identificador, estado, origem, destino);
        this.descricaoMaterial = descricaoMaterial;
        this.carga = carga;
    }

    @Override
    public double calculaDistancia() {
        return 0;
    }

    @Override
    public double calculaCusto() {
        return 0;
    }
    
}
