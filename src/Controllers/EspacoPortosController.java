package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        if (getRepository().getEntities().stream().anyMatch(x -> x.getNumero() == obj.getNumero()))
            return false;
        return getRepository().add(obj);
    }

    @Override
    public void writeFile(File file) throws IOException {
		try (FileWriter fw = new FileWriter(file)) {

            fw.append("numero,nome,x,y,z\n");

			for (EspacoPorto obj: this.getRepository().getEntities()) {
                fw.append(getDescricao(obj));
			}
			fw.close();
		}
    }

    @Override
    public String getDescricao(EspacoPorto obj) {
        return obj.getNumero() + "," + obj.getNome() + "," + obj.getCoordX() + "," + obj.getCoordY() + "," + obj.getCoordZ() + "\n";
    }

}
