package Repositories;

import java.util.ArrayList;

public abstract class Repository<T> {
    private ArrayList<T> list = new ArrayList<>();
    
    public boolean add(T obj){
        return list.add(obj);
    }

    public ArrayList<T> getList(){
        return new ArrayList<T>(this.list);
    }

    public abstract T get(Object obj);
}