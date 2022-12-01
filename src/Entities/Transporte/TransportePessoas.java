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
    public double calculaCusto() {
        var custoDistancia = this.calculaDistancia() < 0.5 ? 1000000 : 100;
        var custoTransportado = quantidadePessoas * 500;

        return custoDistancia * custoTransportado;
    }
    
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}
