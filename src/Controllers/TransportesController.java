package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Entities.Transporte.Transporte;
import Entities.Transporte.TransporteCarga;
import Entities.Transporte.TransportePessoas;
import Enums.TipoTransporte;
import Repositories.EspacoPortosRepository;
import Repositories.TransportesRepository;

public class TransportesController extends BaseController<TransportesRepository, Transporte> {
    private final EspacoPortosRepository espacoPortosRepository;
    private Queue<Transporte> transportesPendentes = new LinkedList<Transporte>();

    public TransportesController(TransportesRepository _transportesRepository, EspacoPortosRepository _espacoPortosRepository) {
        super(_transportesRepository);
        this.espacoPortosRepository = _espacoPortosRepository;
    }

    public Queue<Transporte> getTransportesPendentes() {
        return new LinkedList<Transporte>(transportesPendentes);
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
                    if (count != 0) {
                        if (temp[0].equals("1"))
                            getRepository().add(new TransportePessoas(TipoTransporte.PESSOAS, Integer.parseInt(temp[1]), espacoPortosRepository.get(Integer.parseInt(temp[2])), espacoPortosRepository.get(Integer.parseInt(temp[3])), Integer.parseInt(temp[4])));
                        else
                            getRepository().add(new TransporteCarga(TipoTransporte.CARGA ,Integer.parseInt(temp[1]), espacoPortosRepository.get(Integer.parseInt(temp[2])), espacoPortosRepository.get(Integer.parseInt(temp[3])), Double.parseDouble(temp[4]), temp[5]));
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
    public boolean cadastrar(Transporte obj) {
        if (getRepository().getEntities().stream().anyMatch(x -> x.getIdentificador() == obj.getIdentificador()))
            return false;
            
        transportesPendentes.add(obj);
        return getRepository().add(obj);
    }

    @Override
    public void writeFile(File file) throws IOException {
		try (FileWriter fw = new FileWriter(file)) {

            fw.append("tipo,identificador,origem,destino,quantidade_carga,descricao\n");

			for (Transporte obj: this.getRepository().getEntities()) {

                fw.append(getDescricao(obj));
			}
			fw.close();
		}
    }

    @Override
    public String getDescricao(Transporte obj){
        var base =  obj.getIdentificador() + "," + obj.getOrigem() + "," + obj.getDestino() + ",";
        
        if (obj instanceof TransportePessoas)
            return "1," + base + ((TransportePessoas) obj).getQuantidadePessoas() + "\n";
        return "2," + base + ((TransporteCarga) obj).getCarga() + "," + ((TransporteCarga) obj).getDescricaoMaterial() + "\n";
    }
}
