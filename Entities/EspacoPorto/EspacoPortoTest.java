package Entities.EspacoPorto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EspacoPortoTest {
    @Test
    public void testGetCoordX() {
        var espacoPorto = new EspacoPorto(1, "Teste", 123, 0, 0);

        assertEquals(123, espacoPorto.getCoordX());
    }

    @Test
    public void testGetCoordY() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 123, 0);

        assertEquals(123, espacoPorto.getCoordY());
    }

    @Test
    public void testGetCoordZ() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 123);

        assertEquals(123, espacoPorto.getCoordZ());
    }

    @Test
    public void testGetNome() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 123);

        assertEquals("Teste", espacoPorto.getNome());
    }

    @Test
    public void testGetNumero() {
        var numero = (int)Math.random();
        var espacoPorto = new EspacoPorto(numero, "Teste", 0, 0, 123);

        assertEquals(numero, espacoPorto.getNumero());
    }
}
