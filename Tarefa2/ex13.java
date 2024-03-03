import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        float valor = scn.nextFloat();
        if (valor >= 0) {
            System.out.println("Este número é positivo!");
        } else {
            System.out.println("Este número é negativo!");
        }
    }
}
