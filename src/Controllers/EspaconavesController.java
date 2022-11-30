package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Entities.*;
import Repositories.EspaconavesRepository;
import Repositories.EspacoPortosRepository;

public class EspaconavesController {
    private final EspaconavesRepository espaconavesRepository;
    private final EspacoPortosRepository espacoPortosRepository;

    public EspaconavesController(EspaconavesRepository _espaconavesRepository, EspacoPortosRepository _espacoPortosRepository) {
        this.espaconavesRepository = _espaconavesRepository;
        this.espacoPortosRepository = _espacoPortosRepository;
    }

    public boolean loadInitialData(String path) throws Exception {
        try {
            File file = new File(path);
            
            if (!file.exists())
            throw new FileNotFoundException("Arquivo não encontrado!");
            
            try (Scanner fr = new Scanner(file)) {
                int count = 0;
                while (fr.hasNextLine()){
                    String[] temp = fr.nextLine().split(";");
                    if (count != 0){
                        if (Double.parseDouble(temp[3]) > 0.5)
                            espaconavesRepository.add(new EspaconaveFTL(temp[0], espacoPortosRepository.get(Integer.parseInt(temp[1])), Double.parseDouble(temp[2]), Double.parseDouble(temp[3])));
                        else
                            espaconavesRepository.add(new EspaconaveSubluz(temp[0], espacoPortosRepository.get(Integer.parseInt(temp[1])), Double.parseDouble(temp[2]), temp[3]));
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
}
