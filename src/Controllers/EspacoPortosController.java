package Controllers;

import java.io.File;
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

    @Override
    public boolean readFile(File file, boolean initial) throws IOException {
        try (Scanner fr = new Scanner(file)) {
            int count = 0;
            while (fr.hasNextLine()){
                String[] temp = fr.nextLine().split(initial ? ";" : ",");
                if (count != 0)
                    if (!cadastrar(new EspacoPorto(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Double.parseDouble(temp[4]))))
                        return false;
                else
                    count++;
            }
            fr.close();
        }
        return true;
    }

}
