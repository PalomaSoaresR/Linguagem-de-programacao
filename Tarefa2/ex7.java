import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os votos do canditado 1: ");
        int cand1 = scanner.nextInt();
        System.out.print("Digite os votos do candidato 2: ");
        int cand2 = scanner.nextInt();
        System.out.print("Digite os votos nulos: ");
        int nulos = scanner.nextInt();
        System.out.print("Digite os votos em branco: ");
        int branco = scanner.nextInt();
        int total = cand1 + cand2 + nulos + branco;
        float pcand1 = cand1 * 100 / total;
        float pcand2 = cand2 * 100 / total;
        float pnulo = nulos * 100 / total;
        float pbranco = branco * 100 / total;
        System.out.println("O total de eleitores foi de: " + total + "%");
        System.out.println("A porcentagem de eleitores do candidato 1 é " + pcand1 + " %");
        System.out.println("A porcentagem de eleitores do candidato 2 é " + pcand2 + " %");
        System.out.println("A porcentagem de eleitores que votaram em nulo é " + pnulo + " %");
        System.out.println("A porcentagem de eleitores que votaram em branco é " + pbranco + " %");
        scanner.close();

    }
}
