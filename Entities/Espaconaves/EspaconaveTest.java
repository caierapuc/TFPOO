package Entities.Espaconaves;

import Entities.EspacoPorto.*;
import Entities.Transporte.*;
import Enums.Combustiveis;
import Enums.TipoEspaconave;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class EspaconaveTest {
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
        var transporte1 = new TransportePessoas(1, new EspacoPorto(1, "Teste", 0, 0, 0), new EspacoPorto(2, "Teste2", 1, 1, 1), 400);

        var transporte2 = new TransportePessoas(2, new EspacoPorto(3, "Teste3", 3, 3, 3), new EspacoPorto(4, "Teste4", 4, 4, 4), 200);
    
        var lista = new ArrayList<TransportePessoas>();
        lista.add(transporte1);
        lista.add(transporte2);

        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);

        espaconave.addHistorico(transporte1);
        espaconave.addHistorico(transporte2);

        assertEquals(espaconave.getHistorico(), lista);
    }

    @Test
    public void testGetNome() {
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);

        assertEquals("TesteEspaconave", espaconave.getNome());
    }

    @Test
    public void testGetPortoAtual() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var espaconave = new EspaconaveSubluz("TesteEspaconave", espacoPorto, 0.3, Combustiveis.ION);

        assertEquals(espacoPorto, espaconave.getPortoAtual());
    }

    @Test
    public void testGetTipo() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        Espaconave espaconave = new EspaconaveSubluz("TesteEspaconave", espacoPorto, 0.3, Combustiveis.ION);

        assertEquals(TipoEspaconave.SUBLUZ, espaconave.getTipo());

        espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        assertEquals(TipoEspaconave.FTL, espaconave.getTipo());
    }

    @Test
    public void testGetTransporteAtual() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var transporte = new TransportePessoas(1, espacoPorto, new EspacoPorto(2, "Teste2", 1, 1, 1), 400);
        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        espaconave.setTransporteAtual(transporte);

        assertEquals(transporte, espaconave.getTransporteAtual());
    }

    @Test
    public void testGetValocidade() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        assertEquals(3, espaconave.getValocidade());
    }

    @Test
    public void testIsBusy() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        assertEquals(false, espaconave.isBusy());

        var transporte = new TransportePessoas(1, espacoPorto, new EspacoPorto(2, "Teste2", 1, 1, 1), 400);
    
        espaconave.setTransporteAtual(transporte);

        assertEquals(true, espaconave.isBusy());
    }

    @Test
    public void testSetBusy() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        assertEquals(false, espaconave.isBusy());

        espaconave.setBusy(true);

        assertEquals(true, espaconave.isBusy());
    }

    @Test
    public void testSetPortoAtual() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);

        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);

        espaconave.setPortoAtual(espacoPorto);

        assertEquals(espacoPorto, espaconave.getPortoAtual());
    }

    @Test
    public void testSetTransporteAtual() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);
        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        var transporte = new TransportePessoas(1, espacoPorto, new EspacoPorto(2, "Teste2", 1, 1, 1), 400);
    
        espaconave.setTransporteAtual(transporte);

        assertEquals(transporte, espaconave.getTransporteAtual());
    }
}