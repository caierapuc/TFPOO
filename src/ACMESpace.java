// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontWeight;
// import javafx.scene.text.Text;

// public class ACMESpace extends GridPane {
//     private App palco;

//     public ACMESpace(App palco) {
//         super();
//         this.palco = palco;
//         setAlignment(Pos.CENTER);
//         setHgap(10);
//         setVgap(10);
//         setPadding(new Insets(25, 25, 25, 25));
//         setGridLinesVisible(false);

//         Text scenetitle = new Text("HOME");
//         scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
//         add(scenetitle, 8, 0, 2, 1);

//         Button btnMuda1 = new Button("Cadastrar Espaço-Porto");
//         Button btnMuda2 = new Button("Cadastrar Nova Espaçonave");
//         Button btnMuda3 = new Button("Cadastrar Novo Transporte");
//         Button btnMuda4 = new Button("Consultar Todos os Transportes");
//         Button btnMuda5 = new Button("Alterar Estado de Transporte");
//         Button btnMuda6 = new Button("Carregar Dados Iniciais");
//         Button btnMuda7 = new Button("Designar Transportes");
//         Button btnMuda8 = new Button("Salvar Dados");
//         Button btnMuda9 = new Button("Carregar Dados");
//         Button btnFinal = new Button("Finalizar Sistema");

//         add(btnMuda1, 4, 3, 2, 1);
//         add(btnMuda2, 8, 3, 2, 1);
//         add(btnMuda3, 10, 3, 10, 1);
//         add(btnMuda4, 4, 5, 3, 2);
//         add(btnMuda5, 8, 5, 3, 2);
//         add(btnMuda6, 10, 5, 3, 2);
//         add(btnMuda7, 4, 7, 4, 3);
//         add(btnMuda8, 8, 7, 4, 3);
//         add(btnMuda9, 10, 7, 4, 3);
//         add(btnFinal, 22, 4);

//         btnMuda1.setOnAction(e -> {
//              palco.mudaPainel(1);
//          });

//          btnMuda2.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda3.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda4.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda5.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda1.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda1.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda1.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnMuda1.setOnAction(e -> {
//             palco.mudaPainel(2);
//         });

//         btnFinal.setOnAction(e -> {
//             palco.fecha();
//         });
//     }

// }
