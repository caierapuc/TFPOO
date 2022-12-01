package Entities.Transporte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Entities.EspacoPorto.EspacoPorto;

public class TransportePessoasTest {
    @Test
    public void testCalculaCusto() {
        var origem = new EspacoPorto(2, "Teste2", 0, 0, 0);
        var destino = new EspacoPorto(3, "Teste3", 0.5, 0.5, 0.5);
        Transporte transporte = new TransportePessoas(1, origem, destino, 400);

        assertEquals(20000000, transporte.calculaCusto());
    }

    @Test
    public void testGetQuantidadePessoas() {
        var origem = new EspacoPorto(2, "Teste2", 0, 0, 0);
        var destino = new EspacoPorto(3, "Teste3", 0.5, 0.5, 0.5);
        var transporte = new TransportePessoas(1, origem, destino, 400);

        assertEquals(400, transporte.getQuantidadePessoas());
    }
}
