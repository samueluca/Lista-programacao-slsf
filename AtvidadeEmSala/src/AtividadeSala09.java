import java.util.Scanner;
public class AtividadeSala09 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        boolean sair = false;

        do{
            System.out.println("Escolha uma das opções abaixo");
            System.out.println(
                    "1- Cadastrar novo usuário \n" +
                            "2- Editar usuário \n" +
                            "3- Excluir usuário \n" +
                            "0- Sair \n"
            );
            int opcao = leia.nextInt();
            switch (opcao){
                case 0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Cadastrar novo usuário");
                    break;
            }
        }while(sair);

    }
}