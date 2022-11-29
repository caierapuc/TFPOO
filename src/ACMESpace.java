import java.util.InputMismatchException;
import java.util.Scanner;

public class ACMESpace {
    private Scanner entrada;
    

    public ACMESpace() {
        entrada = new Scanner(System.in);
    }

    public void executa() {
        int opcao;
        boolean ok;
        do {
            ok = true;
            menu();
            try {
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                       
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                    default:
                        System.out.println("Opção inválida.");
                        executa();
                }
            } catch (InputMismatchException e1) {
                entrada.nextLine();
                ok = false;
                System.out.println("Tipo incorreto. Redigite.");
            } catch (Exception e2) {
                entrada.nextLine();
                ok = false;
                e2.printStackTrace();
                System.out.println("Redigite.");
            }
        } while (!ok);
    }

    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcões:");
        System.out.println("[0] Sair do sistema");
        System.out.println("[1] Cadastrar Novo Espaço-Porto");
        System.out.println("[2] Cadastrar Nova Espaçonave");
        System.out.println("[3] Cadastrar Novo Transporte");
        System.out.println("[4] Consultar Todos Transportes");
        System.out.println("[5] Alterar Estado de Transporte");
        System.out.println("[6] Carregar Dados Iniciais");
        System.out.println("[7] Designar Transportes");
        System.out.println("[8] Salvar Dados");
        System.out.println("[9] Carregar Dados");
        System.out.println("Opcão desejada: ");
    }
    
}
