package Entities.Transporte;

import Entities.EspacoPorto.EspacoPorto;
import Enums.TipoTransporte;

public class TransportePessoas extends Transporte {
    private int quantidadePessoas;

    public TransportePessoas(int identificador, EspacoPorto origem, EspacoPorto destino, int quantidadePessoas) {
        super(TipoTransporte.PESSOAS, identificador, origem, destino);
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
