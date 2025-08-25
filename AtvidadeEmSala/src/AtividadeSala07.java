import java.util.Scanner;

public class AtividadeSala07 {

    public static void main(String[] args) {
        int a = 5, b= -5, x = 30, y = 9;
        if(a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Todos os valores são negativos");
        }else if (a < 0 && b < 0 && x < 0 && y < 0) {
            System.out.println("Pelo menos um valor é negativo.");
        }else {
            System.out.println("Todos os valores são positivos.");
        }
        char opcao = 'S';
        switch (opcao){
            case 'S':
            System.out.println("A opção 's' foi escolhido");
            break;
            case  'N':
            System.out.println("A opação 'N' foi escolhida");
            default:
                System.out.println(" A opcão escolhida é inválida");
                break;




        }
        String nome = "";
        int idade = 0;
        char sexo = 'M';
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite seu nome");
        nome = leia.next();
        System.out.println("Digite sua idade :");
        idade = leia.nextInt();
        System.out.println("Digite seu sexo");
        char op = leia.next().toLowerCase().charAt(0);
        switch (opcao){
        case 'm':
        System.out.println("Masculino");
        break;
        case 'f':
        System.out.println("Feminino");
        break;
            default:
        System.out.println("Opção invalida");
       break;

















    }
 }
}
