package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Entities.Espaconaves.Espaconave;
import Entities.Espaconaves.EspaconaveFTL;
import Entities.Espaconaves.EspaconaveSubluz;
import Enums.Combustiveis;
import Repositories.EspaconavesRepository;
import Repositories.EspacoPortosRepository;

public class EspaconavesController extends BaseController<EspaconavesRepository, Espaconave> {
    private final EspacoPortosRepository espacoPortosRepository;

    public EspaconavesController(EspaconavesRepository _espaconavesRepository, EspacoPortosRepository _espacoPortosRepository) {
        super(_espaconavesRepository);
        this.espacoPortosRepository = _espacoPortosRepository;
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
                    if (count != 0){
                        if (temp[0].equals("2"))
                            getRepository().add(new EspaconaveFTL(temp[1], espacoPortosRepository.get(Integer.parseInt(temp[2])), Double.parseDouble(temp[3]), Double.parseDouble(temp[4])));
                        else
                            getRepository().add(new EspaconaveSubluz(temp[1], espacoPortosRepository.get(Integer.parseInt(temp[2])), Double.parseDouble(temp[3]), temp[4] == "ion" ? Combustiveis.ION : Combustiveis.NUCLEAR));
                    }
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
    public boolean cadastrar(Espaconave obj) {
        if (getRepository().getList().stream().anyMatch(x -> x.getNome().equals(obj.getNome())))
            return false;
        return getRepository().add(obj);
    }

}
