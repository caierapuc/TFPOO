package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;

public class TransporteCarga extends Transporte {
    private String descricaoMaterial;
    private double carga;

    public TransporteCarga(int identificador, EspacoPorto origem, EspacoPorto destino, double carga, String descricaoMaterial) {
        super(identificador, origem, destino);
        this.descricaoMaterial = descricaoMaterial;
        this.carga = carga;
    }
    
    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public double getCarga() {
        return carga;
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
