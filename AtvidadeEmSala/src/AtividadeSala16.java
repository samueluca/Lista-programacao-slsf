import java.util.Scanner;
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    System.out.println("Fatorial \n " +
            "Digite um valor para x:");
    int resultado = fatorial(leia.nextInt());
    System.out.println("O fatorial do número digitado é:" + resultado);
