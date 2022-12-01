package Entities.Transporte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Entities.EspacoPorto.EspacoPorto;
import Entities.Espaconaves.*;
import Enums.Combustiveis;
import Enums.StatusTransporte;
import Enums.TipoTransporte;

public class TransporteTest {
    @Test
    public void testCalculaDistancia() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);
        var pontoOrigem = (Math.sqrt(Math.pow(origem.getCoordX(), 2) + Math.pow(origem.getCoordY(), 2) + Math.pow(origem.getCoordZ(), 2)));
        var pontoDestino = (Math.sqrt(Math.pow(destino.getCoordX(), 2) + Math.pow(destino.getCoordY(), 2) + Math.pow(destino.getCoordZ(), 2)));

        var distancia = pontoDestino - pontoOrigem;
        distancia = distancia < 0 ? distancia * -1 : distancia;

        assertEquals(distancia, transporte.calculaDistancia());
    }

    @Test
    public void testGetDestino() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);

        assertEquals(destino, transporte.getDestino());
    }

    @Test
    public void testGetEspaconaveResponsavel() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);
        
        transporte.setEspaconaveResponsavel(espaconave);

        assertEquals(espaconave, transporte.getEspaconaveResponsavel());
    }

    @Test
    public void testGetEstado() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);
        
        assertEquals(StatusTransporte.PENDENTE, transporte.getEstado());

        transporte.setEspaconaveResponsavel(espaconave);

        assertEquals(StatusTransporte.TRANSPORTANDO, transporte.getEstado());
    }

    @Test
    public void testGetIdentificador() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var identificador = (int)Math.random();

        var transporte = new TransportePessoas(identificador, origem, destino, 400);

        assertEquals(identificador, transporte.getIdentificador());
    }

    @Test
    public void testGetOrigem() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);

        assertEquals(origem, transporte.getOrigem());
    }

    @Test
    public void testGetTipo() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        Transporte transporte = new TransportePessoas(1, origem, destino, 400);

        assertEquals(TipoTransporte.PESSOAS, transporte.getTipo());

        transporte = new TransporteCarga(1, origem, destino, 100, "Carvão");

        assertEquals(TipoTransporte.CARGA, transporte.getTipo());
    }

    @Test
    public void testSetEspaconaveResponsavel() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);
        
        assertEquals(null, transporte.getEspaconaveResponsavel());

        transporte.setEspaconaveResponsavel(espaconave);

        assertEquals(espaconave, transporte.getEspaconaveResponsavel());
    }

    @Test
    public void testSetEstado() {
        var origem = new EspacoPorto(1, "Teste", 0, 0, 123);
        var destino = new EspacoPorto(1, "Teste", 123, 123, 0);

        var transporte = new TransportePessoas(1, origem, destino, 400);
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);
        
        assertEquals(StatusTransporte.PENDENTE, transporte.getEstado());

        transporte.setEspaconaveResponsavel(espaconave);

        assertEquals(StatusTransporte.TRANSPORTANDO, transporte.getEstado());

        transporte.setEstado(StatusTransporte.CANCELADO);

        assertEquals(StatusTransporte.CANCELADO, transporte.getEstado());

        transporte.setEstado(StatusTransporte.FINALIZADO);

        assertEquals(StatusTransporte.FINALIZADO, transporte.getEstado());
    }
}
