package Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class BaseService<T, E> {
    private final T repository;

    public BaseService(T repository) {
        this.repository = repository;
    }
    
    public boolean loadData(String path, boolean initial) {
        try {
            File file = new File(path);
            
            if (!file.exists())
            throw new FileNotFoundException("Arquivo não encontrado!");
            
            return readFile(file, initial);
        }
        catch(Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    public T getRepository(){
        return repository;
    }
    
    public boolean saveToFile(String nomeArquivo) throws IOException {
        
        String separador = System.getProperty("file.separator");
		File file = new File(new File("").getAbsolutePath() + separador + "PROJETO/out" + separador + nomeArquivo + ".csv");
        
		if (file.exists());
        file.delete();
		file.createNewFile();
        
        writeFile(file);
        
		if (file.exists())
        return true;
		return false;
    }

    public abstract boolean cadastrar(E obj);
    
    public abstract void writeFile(File file) throws IOException;

    public abstract boolean readFile(File file, boolean initial) throws IOException;

    public abstract String getDescricao(E obj);

    public abstract ArrayList<E> getAllEntities();
}