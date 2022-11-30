package Controllers;

import java.io.File;
import java.io.IOException;

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

    public abstract void writeFile(File file) throws IOException;

    public abstract String getDescricao(E obj);
}