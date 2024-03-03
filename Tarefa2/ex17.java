import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        float valor1 = scn.nextFloat();
        System.out.print("Digite outro valor: ");
        float valor2 = scn.nextFloat();
        if (valor1 == valor2) {
            System.out.println("Digite valores que não são iguais.");
            return;
        }
        if (valor1 > valor2) {
            System.out.println("O valor maior é " + valor1);
        } else {
            System.out.println("O valor maior é " + valor2);
        }
    }
}