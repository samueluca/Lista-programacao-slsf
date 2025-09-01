import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int k = sc.nextInt();

        if (k % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");
    }
}