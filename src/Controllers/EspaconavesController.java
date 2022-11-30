package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Entities.*;
import Repositories.EspaconavesRepository;

public class EspaconavesController {
    private final EspaconavesRepository espaconavesRepository;

    public EspaconavesController(EspaconavesRepository _espaconavesRepository) {
        this.espaconavesRepository = _espaconavesRepository;
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
                        espaconavesRepository.addEspaconave();
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
