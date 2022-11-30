package Views;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    private static Stage stage;
    private static Scene root;
    private static Scene cena1;
    private static Scene cena2;
    private static Scene cena3;
    private static Scene cena4;
    private static Scene cena5;
    private static Scene cena6;
    private static Scene cena7;
    private static Scene cena8;
    private static Scene cena9;
    private static Scene cena21;
    private static Scene cena22;
    private static Scene cena31;
    private static Scene cena32;
    private static Scene cena51;
    private static Scene cena61;
    private static Scene cenaErro;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent mainScene = FXMLLoader.load(getClass().getResource("layout.fxml"));
        root = new Scene(mainScene);

        Parent cadastroPorto = FXMLLoader.load(getClass().getResource("cadastroPorto.fxml"));
        cena1 = new Scene(cadastroPorto);

        Parent cadastroNave = FXMLLoader.load(getClass().getResource("cadastroNave.fxml"));
        cena2 = new Scene(cadastroNave);

        Parent cadastroTransporte = FXMLLoader.load(getClass().getResource("cadastroTransporte.fxml"));
        cena3 = new Scene(cadastroTransporte);

        Parent consultaTransportes = FXMLLoader.load(getClass().getResource("consultaTransportes.fxml"));
        cena4 = new Scene(consultaTransportes);

        Parent alteraEstadoT = FXMLLoader.load(getClass().getResource("alteraEstadoT.fxml"));
        cena5 = new Scene(alteraEstadoT);

        Parent carregaDadosInicial = FXMLLoader.load(getClass().getResource("carregaDadosInicial.fxml"));
        cena6 = new Scene(carregaDadosInicial);

        Parent designarTransporte = FXMLLoader.load(getClass().getResource("designarTransportes.fxml"));
        cena7 = new Scene(designarTransporte);

        Parent salvarDados = FXMLLoader.load(getClass().getResource("salvarDados.fxml"));
        cena8 = new Scene(salvarDados);

        Parent carregarDados = FXMLLoader.load(getClass().getResource("carregarDados.fxml"));
        cena9 = new Scene(carregarDados);

        Parent cadastroNave1 = FXMLLoader.load(getClass().getResource("cadastroNave1.fxml"));
        cena21 = new Scene(cadastroNave1);

        Parent cadastroNave2 = FXMLLoader.load(getClass().getResource("cadastroNave2.fxml"));
        cena22 = new Scene(cadastroNave2);

        Parent cadastroTransporte1 = FXMLLoader.load(getClass().getResource("cadastroTransporte1.fxml"));
        cena31 = new Scene(cadastroTransporte1);

        Parent cadastroTransporte2 = FXMLLoader.load(getClass().getResource("cadastroTransporte2.fxml"));
        cena32 = new Scene(cadastroTransporte2);

        Parent alteraEstadoT2 = FXMLLoader.load(getClass().getResource("alteraEstadoT2.fxml"));
        cena51 = new Scene(alteraEstadoT2);

        Parent carregaDadosInicial2 = FXMLLoader.load(getClass().getResource("carregaDadosInicial2.fxml"));
        cena61 = new Scene(carregaDadosInicial2);

        Parent telaErro = FXMLLoader.load(getClass().getResource("erro.fxml"));
        cenaErro = new Scene(telaErro);

        primaryStage.setTitle("ACMESpace");
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void changeScreen(String scr) {
        switch (scr) {
            case "layout":
            stage.setScene(root);
            break;
            case "cadastroPorto":
            stage.setScene(cena1);
            break;
            case "cadastroNave":
            stage.setScene(cena2);
            break;
            case "cadastroTransporte":
            stage.setScene(cena3);
            break;
            case "consultaTransportes":
            stage.setScene(cena4);
            break;
            case "alteraEstadoT":
            stage.setScene(cena5);
            break;
            case "carregaDadosInicial":
            stage.setScene(cena6);
            break;
            case "designarTransportes":
            stage.setScene(cena7);
            break;
            case "salvarDados":
            stage.setScene(cena8);
            break;
            case "carregarDados":
            stage.setScene(cena9);
            break;
            case "cadastroNave1":
            stage.setScene(cena21);
            break;
            case "cadastroNave2":
            stage.setScene(cena22);
            break;
            case "cadastroTransporte1":
            stage.setScene(cena31);
            break;
            case "cadastroTransporte2":
            stage.setScene(cena32);
            break;
            case "alteraEstadoT2":
            stage.setScene(cena51);
            break;
            case "carregaDadosInicial2":
            stage.setScene(cena61);
            break;
            case "erro":
            stage.setScene(cenaErro);
            break;
        }
    }
}