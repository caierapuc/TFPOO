package Repositories;

import java.util.ArrayList;
import Entities.EspacoPorto;

public class EspacoPortosRepository {
    private ArrayList<EspacoPorto> espacoPortos = new ArrayList<EspacoPorto>();

    public boolean addEspacoPorto(EspacoPorto espacoPorto) {
        return this.espacoPortos.add(espacoPorto);
    }
    
}
