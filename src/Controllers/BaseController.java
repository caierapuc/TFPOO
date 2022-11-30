package Controllers;

public abstract class BaseController<T, E> {
    private final T repository;

    public BaseController(T repository) {
        this.repository = repository;
    }

    public abstract boolean loadInitialData(String path);

    public T getRepository(){
        return repository;
    }

    public abstract boolean cadastrar(E obj);
}