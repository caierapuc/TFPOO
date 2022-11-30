package Repositories;

import java.util.List;
import java.util.stream.Collectors;
import Entities.Espaconave;

public class EspaconavesRepository extends BaseRepository<Espaconave> {
    
    public Espaconave get(String nome) {
        List<Espaconave> temp = this.getList()
                    .stream()
                    .filter(x -> x.getNome().equals(nome))
                    .collect(Collectors.toList());

        if (temp.size() > 0)
            return temp.get(0);
        return null;
    }  
    
}
