package Entities.Espaconaves;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Entities.EspacoPorto.EspacoPorto;
import Enums.Combustiveis;

public class EspaconaveSubluzTest {
    @Test
    public void testGetCombustivel() {
        var espaconave = new EspaconaveSubluz("TesteEspaconave", new EspacoPorto(1, "Teste", 0, 0, 0), 0.3, Combustiveis.ION);

        assertEquals(Combustiveis.ION, espaconave.getCombustivel());
    }
}
