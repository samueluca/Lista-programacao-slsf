import java.util.Scanner;

public class Atividade35{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE;

        System.out.println("Digite numeros inteiros (-1 para parar):");
        do {
            num = leia.nextInt();
            if (num != -1 && num > maior) maior = num;
        } while (num != -1);

        if (maior != Integer.MIN_VALUE) System.out.println("Maior numero: " + maior);
    }
}