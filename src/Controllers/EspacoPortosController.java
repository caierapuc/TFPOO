package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Entities.EspacoPorto.EspacoPorto;
import Repositories.EspacoPortosRepository;

public class EspacoPortosController extends BaseController<EspacoPortosRepository, EspacoPorto> {

    public EspacoPortosController(EspacoPortosRepository _espacoPortosRepository) {
        super(_espacoPortosRepository);
    }

    @Override
    public boolean loadInitialData(String path) {
        try {
            File file = new File(path);
            
            if (!file.exists())
            throw new FileNotFoundException("Arquivo não encontrado!");
            
            try (Scanner fr = new Scanner(file)) {
                int count = 0;
                while (fr.hasNextLine()){
                    String[] temp = fr.nextLine().split(";");
                    if (count != 0)
                        getRepository().add(new EspacoPorto(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Double.parseDouble(temp[4])));
                    else
                        count++;
                }
                fr.close();
            }
            
            return true;
        }
        catch(Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean cadastrar(EspacoPorto obj) {
        if (getRepository().getList().stream().anyMatch(x -> x.getNumero() == obj.getNumero()))
            return false;
        return getRepository().add(obj);
    }

}
