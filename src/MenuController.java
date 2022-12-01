import Services.*;
import Entities.Transporte.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Entities.EspacoPorto.EspacoPorto;
import Entities.Espaconaves.Espaconave;
import Entities.Espaconaves.EspaconaveFTL;
import Entities.Espaconaves.EspaconaveSubluz;
import Repositories.EspacoPortosRepository;

public class MenuController {

    EspacoPortosService eps;
    EspaconavesService espaconaves;
    TransportesService transporte;
    BaseService baseService;

    // BUTTONS

    @FXML
    private Button volta;

    @FXML
    private Button alteraEstadoT;

    @FXML
    private Button cadastroNave;

    @FXML
    private Button cadastraPorto;

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
    private Button cadastroPorto;

    @FXML
    private Button oka;

    @FXML
    private Button oka2;

    @FXML
    private Button alteraEstadoBotao;

    @FXML
    private Button alteraEstadoB;

    @FXML
    private Button salvaBotao;

    @FXML
    private Button carregaBotao;


    // TEXTFIELDS

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
    private TextField tipoE;

    @FXML
    private TextField tipoT;

    @FXML
    private TextField identificaTransporte;

    @FXML
    private TextField nomeArquivo;

    @FXML
    private TextField combustivelNave;

    @FXML
    private TextField nomeEspaconave;

    @FXML
    private TextField nomeEspacoporto;

    @FXML
    private TextField velocidadeNaveS;

    @FXML
    private TextField capacidadeNave;

    @FXML
    private TextField espacoPortoFTL;

    @FXML
    private TextField nomeFTL;

    @FXML
    private TextField velocidadeNaveF;

    @FXML
    private TextField destinoTransporteP;

    @FXML
    private TextField identificadorTransporteP;

    @FXML
    private TextField origemTransporteP;

    @FXML
    private TextField qntdPessoas;

    @FXML
    private TextField descricaoMaterial;

    @FXML
    private TextField destinoTransporteC;

    @FXML
    private TextField identificadorTransporteC;

    @FXML
    private TextField origemTransporteC;

    @FXML
    private TextField qntdCarga;

    @FXML
    private TextField nomeArquivoD;

    @FXML
    private TextField nomeArquivoS;


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
        eps.cadastrar(espacoPorto);
    }

    @FXML
    void cadastraSubluz(ActionEvent event) {
        Espaconave espaconave = new EspaconaveSubluz(nomeEspaconave.getText(), nomeEspacoporto, velocidadeNaveS, combustivelNave);

        Espaconave espaconave = new EspaconaveSubluz(nomeEspaconave.getText(), null, Double.valueOf(velocidadeNaveS.getText()), combustivelNave.getText());
        espaconaves.cadastrar(espaconave);
    }

    @FXML
    void cadastraFTL(ActionEvent event) {
        Espaconave espaconave = new EspaconaveFTL(nomeFTL, espacoPortoFTL, velocidadeNaveF, capacidadeNave);

    }

    @FXML
    void cadastraPessoa(ActionEvent event) {
        Transporte transporteP = new TransportePessoas(identificadorTransporteP, origemTransporteP, destinoTransporteP, qntdPessoas);
        transporte.cadastrar(transporteP);
    }

    @FXML
    void cadastraCarga(ActionEvent event) {
        Transporte transporteC = new TransporteCarga(identificadorTransporteC, origemTransporteC, destinoTransporteC, qntdCarga , descricaoMaterial);
        transporte.cadastrar(transporteC);
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
    void salvaArquivo(ActionEvent event) {
        baseService.saveToFile(nomeArquivoS);

    }

    @FXML
    void carregaDados(ActionEvent event) {
        baseService.loadData(nomeArquivoD, false);
    }

    @FXML
    void voltar(ActionEvent event) {
        App.changeScreen("layout");
    }

}

