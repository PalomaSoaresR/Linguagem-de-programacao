import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o horario de inicio (HH): ");
        int inicio = scn.nextInt();
        System.out.print("Digite o horario de fim (HH): ");
        int fim = scn.nextInt();
        if (inicio > 24 || fim > 24) {
            System.out.print("Digite uma hora valida");
            return;
        }
        if (inicio < fim) {
            int horas = fim - inicio;
            System.out.print("A duração do jogo foi de " + horas + " horas");
        } else {
            int horas1 = (24 - inicio) + fim;
            System.out.print("A duração do jogo foi de " + horas1 + " horas");
        }
    }
}