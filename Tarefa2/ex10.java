import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o salário fixo do funcionário: ");
        float salario = scn.nextFloat();
        System.out.print("Digite o número de carros vendidos por este funcionário: ");
        int carros = scn.nextInt();
        System.out.print("Digite a comissão desejada para cada venda (%): ");
        int comissao = scn.nextInt();
        System.out.print("Digite o valor total de vendas feita por este funcionário: ");
        float valortotal = scn.nextFloat();
        float media = valortotal / carros;
        float comissaofinal = comissao * media / 100;
        float comissaoporcarro = 5 * valortotal / 100;
        float salariofinal = salario + comissaofinal + comissaoporcarro;
        System.out.print("O salário final do vendedor é: " + salariofinal);
    }

}