package Entities.EspacoPorto;

import javafx.scene.control.TextField;

public class EspacoPorto {
    
    private int numero;
    private String nome;
    private double coordX;
    private double coordY;
    private double coordZ;

    public EspacoPorto(int numero, String nome, double coordX, double coordY, double coordZ){
        this.numero = numero;
        this.nome = nome;
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    public EspacoPorto(TextField numeroEP, TextField nomeEP, TextField coordXEP, TextField coordYEP,
            TextField coordZEP) {
    }

    public int getNumero(){
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public double getCoordZ() {
        return coordZ;
    }
    
}