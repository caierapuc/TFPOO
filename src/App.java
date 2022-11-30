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

        Parent funcionalidade1 = FXMLLoader.load(getClass().getResource("funcionalidade1.fxml"));
        cena1 = new Scene(funcionalidade1);

        Parent funcionalidade2 = FXMLLoader.load(getClass().getResource("funcionalidade2.fxml"));
        cena2 = new Scene(funcionalidade2);

        Parent funcionalidade3 = FXMLLoader.load(getClass().getResource("funcionalidade3.fxml"));
        cena3 = new Scene(funcionalidade3);

        Parent funcionalidade4 = FXMLLoader.load(getClass().getResource("funcionalidade4.fxml"));
        cena4 = new Scene(funcionalidade4);

        Parent funcionalidade5 = FXMLLoader.load(getClass().getResource("funcionalidade5.fxml"));
        cena5 = new Scene(funcionalidade5);

        Parent funcionalidade6 = FXMLLoader.load(getClass().getResource("funcionalidade6.fxml"));
        cena6 = new Scene(funcionalidade6);

        Parent funcionalidade7 = FXMLLoader.load(getClass().getResource("funcionalidade7.fxml"));
        cena7 = new Scene(funcionalidade7);

        Parent funcionalidade8 = FXMLLoader.load(getClass().getResource("funcionalidade8.fxml"));
        cena8 = new Scene(funcionalidade8);

        Parent funcionalidade9 = FXMLLoader.load(getClass().getResource("funcionalidade9.fxml"));
        cena9 = new Scene(funcionalidade9);

        Parent funcionalidade21 = FXMLLoader.load(getClass().getResource("funcionalidade21.fxml"));
        cena21 = new Scene(funcionalidade21);

        Parent funcionalidade22 = FXMLLoader.load(getClass().getResource("funcionalidade22.fxml"));
        cena22 = new Scene(funcionalidade22);

        Parent funcionalidade31 = FXMLLoader.load(getClass().getResource("funcionalidade31.fxml"));
        cena31 = new Scene(funcionalidade31);

        Parent funcionalidade32 = FXMLLoader.load(getClass().getResource("funcionalidade32.fxml"));
        cena32 = new Scene(funcionalidade32);

        Parent funcionalidade51 = FXMLLoader.load(getClass().getResource("funcionalidade51.fxml"));
        cena51 = new Scene(funcionalidade51);

        Parent funcionalidade61 = FXMLLoader.load(getClass().getResource("funcionalidade61.fxml"));
        cena61 = new Scene(funcionalidade61);

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
            case "funcionalidade1":
            stage.setScene(cena1);
            break;
            case "funcionalidade2":
            stage.setScene(cena2);
            break;
            case "funcionalidade3":
            stage.setScene(cena3);
            break;
            case "funcionalidade4":
            stage.setScene(cena4);
            break;
            case "funcionalidade5":
            stage.setScene(cena5);
            break;
            case "funcionalidade6":
            stage.setScene(cena6);
            break;
            case "funcionalidade7":
            stage.setScene(cena7);
            break;
            case "funcionalidade8":
            stage.setScene(cena8);
            break;
            case "funcionalidade9":
            stage.setScene(cena9);
            break;
            case "funcionalidade21":
            stage.setScene(cena21);
            break;
            case "funcionalidade22":
            stage.setScene(cena22);
            break;
            case "funcionalidade31":
            stage.setScene(cena31);
            break;
            case "funcionalidade32":
            stage.setScene(cena32);
            break;
            case "funcionalidade51":
            stage.setScene(cena51);
            break;
            case "funcionalidade61":
            stage.setScene(cena61);
            break;
            case "erro":
            stage.setScene(cenaErro);
            break;
        }
    }
}