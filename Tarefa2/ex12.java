import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        float valor = scn.nextFloat();
        if (valor > 10.0) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        scn.close();
    }
}
