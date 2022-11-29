public class TransportePessoas extends Transporte {

    private int quantidadePessoas;
    private EspacoPorto espacoPorto;

    public TransportePessoas(int identificador, String estado, EspacoPorto origem, EspacoPorto destino, int quantidadePessoas) {
        super(identificador, estado, origem, destino);
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

    public EspacoPorto getEspacoPorto() {
        return espacoPorto;
    }
}
