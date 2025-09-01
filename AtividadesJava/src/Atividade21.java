import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        if (n1 >= 6 && n2 >= 6) {
            System.out.println("Aprovado");
        } else if (n1 >= 4 || n2 >= 4) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }
}
