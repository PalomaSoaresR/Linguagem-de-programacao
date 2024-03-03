import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor1 = scn.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = scn.nextInt();
        if (valor1 == valor2) {
            System.out.println("Digite valores que não são iguais.");
            return;
        }
        if (valor1 > valor2) {
            System.out.println("A ordem crescente: " + valor1 + "," + valor2);
        } else {
            System.out.println("A ordem crescente: " + valor2 + "," + valor1);
        }
    }
}
