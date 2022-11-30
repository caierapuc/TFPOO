package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoTransporte;

public class TransporteCarga extends Transporte {
    private String descricaoMaterial;
    private double carga;

    public TransporteCarga(TipoTransporte tipo, int identificador, EspacoPorto origem, EspacoPorto destino, double carga, String descricaoMaterial) {
        super(tipo, identificador, origem, destino);
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
