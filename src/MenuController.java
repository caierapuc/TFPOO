import Services.*;
import Entities.Transporte.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MenuController {


    @FXML
    private Button volta;

    @FXML
    private Button alteraEstadoT;

    @FXML
    private Button cadastroNave;

    @FXML
    private Button cadastroPorto;

    @FXML
    private Button cadastroTransporte;

    @FXML
    private Button carregaDados;

    @FXML
    private Button carregaInicial;

    @FXML
    private Button consultaTransporte;

    @FXML
    private Button desginaTransporte;

    @FXML
    private Button salvaDados;

    @FXML
    private Button cadastroSubluz;

    @FXML
    private Button cadastroFTL;

    @FXML
    private Button cadastroTPessoa;

    @FXML
    private Button cadastroTCarga;

    @FXML
    private Button cadastro;

    @FXML
    private TextField numeroEP;

    @FXML
    private TextField coordXEP;

    @FXML
    private TextField coordYEP;

    @FXML
    private TextField coordZEP;

    @FXML
    private TextField nomeEP;

    @FXML
    private Button oka;

    @FXML
    private Button oka2;

    @FXML
    private TextField tipoE;

    @FXML
    private TextField tipoT;

    @FXML
    private Button alteraEstadoBotao;

    @FXML
    private TextField identificaTransporte;

    @FXML
    private TextField nomeArquivo;

    @FXML
    private Button salvaBotao;

    @FXML
    private Button carregaBotao;


    @FXML
    void alteraEstado(ActionEvent event) {
        App.changeScreen("funcionalidade5");
    }

    @FXML
    void cadastraNave(ActionEvent event) {
        App.changeScreen("funcionalidade2");
    }

    @FXML
    void cadastraPorto(ActionEvent event) {
        App.changeScreen("funcionalidade1");
    }

    @FXML
    void cadastraTransporte(ActionEvent event) {
        App.changeScreen("funcionalidade3");
    }

    @FXML
    void carregarDados(ActionEvent event) {
        App.changeScreen("funcionalidade9");
    }

    @FXML
    void carregarInicial(ActionEvent event) {
        App.changeScreen("funcionalidade6");
    }

    @FXML
    void consultaTransporte(ActionEvent event) {
        App.changeScreen("funcionalidade4");
    }

    @FXML
    void designarTransporte(ActionEvent event) {
        App.changeScreen("funcionalidade7");
    }

    @FXML
    void salvarDados(ActionEvent event) {
        App.changeScreen("funcionalidade8");
    }

    @FXML
    void cadastra(ActionEvent event) {
    }

    @FXML
    void cadastraSubluz(ActionEvent event) {

    }

    @FXML
    void cadastraFTL(ActionEvent event) {

    }

    @FXML
    void cadastraPessoa(ActionEvent event) {

    }

    @FXML
    void cadastraCarga(ActionEvent event) {

    }

    @FXML
    void ok(ActionEvent event) {

        if(tipoE.getText().toString().equals("1")) {
            App.changeScreen("funcionalidade21");
        }
        else if(tipoE.getText().toString().equals("2")) {
            App.changeScreen("funcionalidade22");
        }
        else {
            App.changeScreen("layout");
        }
    }

    @FXML
    void ok2(ActionEvent event) {

        if(tipoT.getText().toString().equals("1")) {
            App.changeScreen("funcionalidade31");
        }
        else if(tipoT.getText().toString().equals("2")) {
            App.changeScreen("funcionalidade32");
        }
        else {
            App.changeScreen("layout");
        }
    }

    @FXML
    void alteraEstadoB(ActionEvent event) {

    }

    @FXML
    void identificarTransporte(ActionEvent event) {
        
       
     // if(identificaTransporte.getText().toString().equals(transporte.getIdentificador()));

    }

    @FXML
    void carregaArquivo(ActionEvent event) {

    }

    @FXML
    void salvaDados(ActionEvent event) {

    }

    @FXML
    void carregarArquivos(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("layout");
    }

}

