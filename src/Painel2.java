// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.GridPane;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontWeight;
// import javafx.scene.text.Text;

// public class Painel2 extends GridPane {
//     private App palco;
//     private Label userName;
//     private Label pw;

//     public Painel2(App palco) {
//         super();
//         this.palco = palco;
//         setAlignment(Pos.CENTER);
//         setHgap(10);
//         setVgap(10);
//         setPadding(new Insets(25, 25, 25, 25));
//         setGridLinesVisible(false);

//         Text scenetitle = new Text("Cena 2");
//         scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//         add(scenetitle, 0, 0, 2, 1);

//         // create labels
//         userName = new Label();
//         add(userName, 0, 1, 2, 1);
//         pw = new Label();
//         add(pw, 0, 2, 2, 1);

//         Button btnMuda = new Button("Mudar para Cena 1");
//         Button btnFinal = new Button("Terminar");

//         add(btnMuda, 0, 3);
//         add(btnFinal, 0, 4);

//         // Tratamento de evento dos botoes
//         btnMuda.setOnAction(e -> {
//             palco.mudaPainel(1);
//         });

//         btnFinal.setOnAction(e -> {
//             palco.fecha();
//         });
//     }

//     // Atualizacao de componentes do painel 2
//     // public void atualiza() {
//     //     userName.setText("Nome do usuario: " + usuario.getUser());
//     //     pw.setText("Senha: " + usuario.getPassword());
//     // }
// }
