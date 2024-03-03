import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int ano = scn.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int nasc = scn.nextInt();
        if (ano - nasc >= 16) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
    }
}
