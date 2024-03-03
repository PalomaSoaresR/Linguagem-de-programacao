import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seus anos, meses e dias.");
        System.out.print("Anos: ");
        int ano = scn.nextInt();
        System.out.print("Meses: ");
        int mes = scn.nextInt();
        System.out.print("Dia: ");
        int dia = scn.nextInt();
        int anodia = ano * 365;
        int mesdia = mes * 30;
        int totaldia = anodia + mesdia + dia;
        System.out.println("Você possui " + totaldia + " dias");

    }
}