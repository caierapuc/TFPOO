package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoTransporte;

public class TransportePessoas extends Transporte {
    private int quantidadePessoas;

    public TransportePessoas(TipoTransporte tipo, int identificador, EspacoPorto origem, EspacoPorto destino, int quantidadePessoas) {
        super(tipo, identificador, origem, destino);
        this.quantidadePessoas = quantidadePessoas;
    }
    
    @Override
    public double calculaDistancia() {
        return 0;
        // double distancia = 
        
    }
    
    @Override
    public double calculaCusto() {
        return 0;
    }
    
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}
