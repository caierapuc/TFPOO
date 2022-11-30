package Repositories;

import java.util.ArrayList;

import Entities.Espaconave;

public class EspaconavesRepository {
    private ArrayList<Espaconave> espaconaves = new ArrayList<Espaconave>();
    
    public boolean addEspaconave(Espaconave espaconave) {
        return this.espaconaves.add(espaconave);
    }
    
}
