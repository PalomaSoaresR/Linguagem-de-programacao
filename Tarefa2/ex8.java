import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
        float sal = scn.nextFloat();
        System.out.print("Digite o percentual de reajuste: ");
        float reaj = scn.nextFloat();
        float reajuste = sal + (reaj / 100 * sal);
        System.out.println("O salário com o reajuste é: " + reajuste);
        scn.close();

    }

}
