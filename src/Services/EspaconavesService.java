package Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Entities.Espaconaves.Espaconave;
import Entities.Espaconaves.EspaconaveFTL;
import Entities.Espaconaves.EspaconaveSubluz;
import Enums.Combustiveis;
import Enums.TipoEspaconave;
import Repositories.EspaconavesRepository;
import Repositories.EspacoPortosRepository;

public class EspaconavesService extends BaseService<EspaconavesRepository, Espaconave> {
    private final EspacoPortosRepository espacoPortosRepository;

    public EspaconavesService(EspaconavesRepository _espaconavesRepository, EspacoPortosRepository _espacoPortosRepository) {
        super(_espaconavesRepository);
        this.espacoPortosRepository = _espacoPortosRepository;
    }

    @Override
    public boolean cadastrar(Espaconave obj) {
        if (getRepository().getEntities().stream().anyMatch(x -> x.getNome().equals(obj.getNome())))
            return false;

        if (obj.getPortoAtual() == null)
            obj.setPortoAtual(espacoPortosRepository.get(11));

        return getRepository().add(obj);
    }

    @Override
    public void writeFile(File file) throws IOException {
		try (FileWriter fw = new FileWriter(file)) {

            fw.append("tipo,nome,espacoporto,velocidade,combustivel_limite\n");

			for (Espaconave obj: this.getRepository().getEntities()) {
                fw.append(getDescricao(obj));
			}
			fw.close();
		}
    }

    @Override
    public String getDescricao(Espaconave obj) {
        var base = obj.getNome() + "," + obj.getPortoAtual() + "," + obj.getValocidade() + ",";
        
        if (obj instanceof EspaconaveSubluz)
            return "1," + base + ((EspaconaveSubluz) obj).getCombustivel() + "\n";
        return "2," + base + ((EspaconaveFTL) obj).getCapacidadePC() + "\n";
    }

    @Override
    public boolean readFile(File file, boolean initial) throws IOException {
        try (Scanner fr = new Scanner(file)) {
            int count = 0;
            while (fr.hasNextLine()){
                String[] temp = fr.nextLine().split(initial ? ";" : ",");
                if (count != 0){
                    if (temp[0].equals("2"))
                        if (!cadastrar(new EspaconaveFTL(TipoEspaconave.FTL ,temp[1], espacoPortosRepository.get(Integer.parseInt(temp[2])), Double.parseDouble(temp[3]), Double.parseDouble(temp[4]))))
                            return false;
                    else
                        if (!cadastrar(new EspaconaveSubluz(TipoEspaconave.SUBLUZ ,temp[1], espacoPortosRepository.get(Integer.parseInt(temp[2])), Double.parseDouble(temp[3]), temp[4] == "ion" ? Combustiveis.ION : Combustiveis.NUCLEAR)))
                            return false;
                }
                else
                    count++;
            }
            fr.close();
        }
        return true;
    }

    @Override
    public ArrayList<Espaconave> getAllEntities() {
        return this.getRepository().getEntities();
    }
}
