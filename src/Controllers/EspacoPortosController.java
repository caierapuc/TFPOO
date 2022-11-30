package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Entities.*;
import Repositories.EspacoPortosRepository;

public class EspacoPortosController {
    private final EspacoPortosRepository espacoPortosRepository;

    public EspacoPortosController(EspacoPortosRepository _espacoPortosRepository) {
        this.espacoPortosRepository = _espacoPortosRepository;
    }

    public boolean loadInitialData(String path) throws Exception {
        try {
            path = "/Users/caiera/Desktop/PUCRS/POO/TFPOO/assets/TESTE-espacoportos.dat";
            File file = new File(path);
            
            if (!file.exists())
            throw new FileNotFoundException("Arquivo não encontrado!");
            
            try (Scanner fr = new Scanner(file)) {
                int count = 0;
                while (fr.hasNextLine()){
                    String[] temp = fr.nextLine().split(";");
                    if (count != 0)
                        espacoPortosRepository.add(new EspacoPorto(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Double.parseDouble(temp[4])));
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
