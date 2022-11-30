package Repositories;

import java.util.List;
import java.util.stream.Collectors;

import Entities.Transporte.Transporte;

public class TransportesRepository extends BaseRepository<Transporte, Integer>{
    @Override
    public Transporte get(Integer identificador){
        List<Transporte> temp = this.getEntities()
            .stream()
            .filter(x -> x.getIdentificador() == identificador)
            .collect(Collectors.toList());

        if (temp.size() > 0)
            return temp.get(0);
        return null;
    }
}
