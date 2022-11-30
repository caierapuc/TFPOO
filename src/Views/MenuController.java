package Views;
import Services.*;
import Entities.Transporte.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Entities.EspacoPorto.EspacoPorto;
import Repositories.EspacoPortosRepository;

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
    private Button cadastraPorto;

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
        App.changeScreen("alteraEstadoT");
    }

    @FXML
    void cadastraNave(ActionEvent event) {
        App.changeScreen("cadastroNave");
    }

    @FXML
    void cadastraPorto(ActionEvent event) {
        App.changeScreen("cadastroPorto");
    }

    @FXML
    void cadastraTransporte(ActionEvent event) {
        App.changeScreen("cadastroTransporte");
    }

    @FXML
    void carregarDados(ActionEvent event) {
        App.changeScreen("carregarDados");
    }

    @FXML
    void carregarInicial(ActionEvent event) {
        App.changeScreen("carregaDadosInicial");
    }

    @FXML
    void consultaTransporte(ActionEvent event) {
        App.changeScreen("consultaTransportes");
    }

    @FXML
    void designarTransporte(ActionEvent event) {
        App.changeScreen("designarTransportes");
    }

    @FXML
    void salvarDados(ActionEvent event) {
        App.changeScreen("salvarDados");
    }

    @FXML
    void cadastraPortoMetodo(ActionEvent event) {
        EspacoPorto espacoPorto = new EspacoPorto(numeroEP, nomeEP, coordXEP, coordYEP, coordZEP);
        EspacoPortosService.cadastrar(espacoPorto);

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
            App.changeScreen("cadastroNave1");
        }
        else if(tipoE.getText().toString().equals("2")) {
            App.changeScreen("cadastroNave2");
        }
        else {
            App.changeScreen("layout");
        }
    }

    @FXML
    void ok2(ActionEvent event) {

        if(tipoT.getText().toString().equals("1")) {
            App.changeScreen("cadastroTransporte1");
        }
        else if(tipoT.getText().toString().equals("2")) {
            App.changeScreen("cadastroTransporte2");
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

