package Drivers.EspaconavesTests;

import Entities.EspacoPorto.*;
import Entities.Transporte.*;
import Entities.Espaconaves.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class EspaconaveDriver {
    @Test
    public void testAddHistorico() {
        var transporte1 = new TransportePessoas(1, new EspacoPorto(1, "Teste", 0, 0, 0), new EspacoPorto(2, "Teste2", 1, 1, 1), 400);

        var transporte2 = new TransportePessoas(2, new EspacoPorto(3, "Teste3", 3, 3, 3), new EspacoPorto(4, "Teste4", 4, 4, 4), 200);
    
        var lista = new ArrayList<TransportePessoas>();
        lista.add(transporte1);
        lista.add(transporte2);

        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);

        espaconave.addHistorico(transporte1);
        espaconave.addHistorico(transporte2);

        assertEquals(lista, espaconave.getHistorico());
    }

    @Test
    public void testGetHistorico() {

    }

    @Test
    public void testGetNome() {

    }

    @Test
    public void testGetPortoAtual() {

    }

    @Test
    public void testGetTipo() {

    }

    @Test
    public void testGetTransporteAtual() {

    }

    @Test
    public void testGetValocidade() {

    }

    @Test
    public void testIsBusy() {

    }

    @Test
    public void testSetBusy() {

    }

    @Test
    public void testSetPortoAtual() {

    }

    @Test
    public void testSetTransporteAtual() {

    }
}