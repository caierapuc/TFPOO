package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Entities.TransporteCarga;
import Entities.TransportePessoas;
import Repositories.EspacoPortosRepository;
import Repositories.TransportesRepository;

public class TransportesController {
    private final TransportesRepository transportesRepository;
    private final EspacoPortosRepository espacoPortosRepository;

    public TransportesController(TransportesRepository _transportesRepository, EspacoPortosRepository _espacoPortosRepository) {
        this.transportesRepository = _transportesRepository;
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
                    if (count != 0) {
                        if (temp[0].equals("1"))
                            transportesRepository.add(new TransportePessoas(Integer.parseInt(temp[1]), espacoPortosRepository.get(Integer.parseInt(temp[2])), espacoPortosRepository.get(Integer.parseInt(temp[3])), Integer.parseInt(temp[4])));
                        else
                            transportesRepository.add(new TransporteCarga(Integer.parseInt(temp[1]), espacoPortosRepository.get(Integer.parseInt(temp[2])), espacoPortosRepository.get(Integer.parseInt(temp[3])), Double.parseDouble(temp[4]), temp[5]));
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
