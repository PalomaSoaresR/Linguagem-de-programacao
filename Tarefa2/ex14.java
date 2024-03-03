import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite quantas maçãs foram compradas: ");
        float macas = scn.nextFloat();
        float nduzia = macas * 1.30f;
        if (macas >= 12) {
            System.out.println("O valor das maçãs foi de " + macas);
        } else {
            System.out.println("O valor das maçãs foi de " + nduzia);
        }

    }
}