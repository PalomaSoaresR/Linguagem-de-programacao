import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        float P1 = scanner.nextFloat();
        System.out.print("Digite a nota da E1: ");
        float E1 = scanner.nextFloat();
        System.out.print("Digite a nota da E2: ");
        float E2 = scanner.nextFloat();
        System.out.print("Digite a nota do API: ");
        float api = scanner.nextFloat();
        System.out.print("Digite a nota da prova substitutiva: ");
        float sub = scanner.nextFloat();
        System.out.print("Digite a nota da atividade extra: ");
        float x = scanner.nextFloat();
        float media = (P1 * 0.6f + ((E1 + E2) / 2) * 0.4f) * 0.5f
                + (Math.max(((P1 * 0.6f + ((E1 + E2) / 2) * 0.4f) - 5.9f), 0)
                        / ((P1 * 0.6f + ((E1 + E2) / 2) * 0.4f) - 5.9f)) * (api * 0.5f)
                + x + (sub * 0.2f);
        System.out.print("A média deste aluno é: ");
        System.out.println(media);
        if (media <= 5.9f) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno aprovado");
        }
        scanner.close();
    }

}
