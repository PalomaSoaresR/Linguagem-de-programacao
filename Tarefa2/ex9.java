import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: ");
        float fabrica = scn.nextFloat();
        float dist = fabrica * 28 / 100;
        float imp = fabrica * 45 / 100;
        float custo = fabrica + dist + imp;
        System.out.print("O custo final ao consumidor é " + custo);

    }
}
