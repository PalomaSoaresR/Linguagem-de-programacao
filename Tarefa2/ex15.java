import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a nota da avaliação 1: ");
        float avaliacao = scn.nextFloat();
        System.out.println("Digite a nota da avaliação 2: ");
        float nota = scn.nextFloat();
        if (((avaliacao + nota) / 2) >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
