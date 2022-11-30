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

        primaryStage.setTitle("ACMESpace");
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void changeScreen(String scr) {
        switch (scr) {
            case "main":
            stage.setScene(root);
            break;
            case "funcionalidade1":
            stage.setScene(cena1);
            break;
            case "funcionalidade2":
            stage.setScene(cena2);
            break;
        }
    }

}