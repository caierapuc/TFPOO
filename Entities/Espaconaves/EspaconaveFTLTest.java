package Entities.Espaconaves;

import Entities.EspacoPorto.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EspaconaveFTLTest {
    @Test
    public void testGetCapacidadePC() {
        var espacoPorto = new EspacoPorto(1, "Teste", 0, 0, 0);

        var espaconave = new EspaconaveFTL("TesteEspaconave", espacoPorto, 3, 500);

        assertEquals(500.0, espaconave.getCapacidadePC());
    }
}
