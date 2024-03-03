public class ex4 {

    public static void main(String[] args) {
        /* variaveis de jan, fev e mar */
        int jan = 15000;
        int fev = 23000;
        int mar = 17000;

        /* gasto total do trimestre */
        int gastoTotal = jan + fev + mar;

        /* media de gastos do trimestre */
        int media = gastoTotal / 3;

        System.out.print("A despesa total do primeiro trimestre foi: ");
        System.out.println(gastoTotal);
        System.out.print("A média mensal de gastos nesse primeiro trimestre foi: ");
        System.out.println(media);
    }
}