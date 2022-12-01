package Entities.Transporte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Entities.EspacoPorto.EspacoPorto;

public class TransporteCargaTest {
    @Test
    public void testCalculaCusto() {
        var origem = new EspacoPorto(2, "Teste2", 0, 0, 0);
        var destino = new EspacoPorto(3, "Teste3", 0.5, 0.5, 0.5);

        var transporte = new TransporteCarga(2, origem, destino, 100, "Teste");

        assertEquals(5000000, transporte.calculaCusto());
    }

    @Test
    public void testGetCarga() {
        var origem = new EspacoPorto(2, "Teste2", 0, 0, 0);
        var destino = new EspacoPorto(3, "Teste3", 0.5, 0.5, 0.5);
        var transporte = new TransporteCarga(2, origem, destino, 100, "Teste");

        assertEquals(100, transporte.getCarga());
    }

    @Test
    public void testGetDescricaoMaterial() {
        var origem = new EspacoPorto(2, "Teste2", 0, 0, 0);
        var destino = new EspacoPorto(3, "Teste3", 0.5, 0.5, 0.5);
        var transporte = new TransporteCarga(2, origem, destino, 100, "Teste");

        assertEquals("Teste", transporte.getDescricaoMaterial());
    }
}
