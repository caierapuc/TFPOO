package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoTransporte;

public class TransporteCarga extends Transporte {
    private String descricaoMaterial;
    private double carga;

    public TransporteCarga(int identificador, EspacoPorto origem, EspacoPorto destino, double carga, String descricaoMaterial) {
        super(TipoTransporte.CARGA, identificador, origem, destino);
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
    public double calculaCusto() {
        return 0;
    }
    
}
