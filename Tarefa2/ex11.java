import java.util.Scanner;

public class ex11 {
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o graus em Fahrenheit: ");
        float fahrenheit = scn.nextFloat();
        float celcius = (fahrenheit - 32) / 1.8f;
        System.out.println("A conversão para celcius foi de: " + celcius);

    }

}
