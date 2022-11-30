package Repositories;

import java.util.List;
import java.util.stream.Collectors;

import Entities.EspacoPorto.EspacoPorto;

public class EspacoPortosRepository extends BaseRepository<EspacoPorto, Integer> {
    @Override
    public EspacoPorto get(Integer numero) {
        List<EspacoPorto> temp = this.getList()
            .stream()
            .filter(x -> x.getNumero() == (Integer)numero)
            .collect(Collectors.toList());

        if (temp.size() > 0)
            return temp.get(0);
        return null;
    }  
}
