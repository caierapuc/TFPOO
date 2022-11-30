import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

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

}

