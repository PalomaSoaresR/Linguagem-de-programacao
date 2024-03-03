import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite suas horas trabalhadas: ");
        int horas = scn.nextInt();
        System.out.print("Digite seu salário por hora: ");
        int valor = scn.nextInt();
        float horaextra = horas - 200;
        float salarioextra = (valor * 50 / 100) * horaextra;
        float salariototal = horas * valor + salarioextra;
        System.out.println("O salário total desse funcionário foi de " + salariototal + " reais");

    }
}