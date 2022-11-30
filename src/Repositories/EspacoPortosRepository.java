package Repositories;

import java.security.InvalidParameterException;
import java.util.stream.Collectors;

import Entities.EspacoPorto;

public class EspacoPortosRepository extends Repository<EspacoPorto> {
    @Override
    public EspacoPorto get(Object numero) {
        if (!(numero instanceof Integer))
            throw new InvalidParameterException();

        return this.getList().stream().filter(x -> x.getNumero() == (Integer)numero).collect(Collectors.toList()).get(0);
    }  
}
