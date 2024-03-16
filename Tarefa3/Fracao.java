public class Fracao {
    private int numerador;
    private int denominador;
    private int numerador2;
    private int denominador2;

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public void somar() {
        int novodenominador = denominador * denominador2;
        int novonumerador = (novodenominador / denominador) * numerador + (novodenominador / denominador2) * numerador2;
        System.out.println("A soma foi: " + novonumerador + "/" + novodenominador);

    }

    public void subtrair() {
        int novodenominador = denominador * denominador2;
        int novonumerador = (novodenominador / denominador) * numerador - (novodenominador / denominador2) * numerador2;
        System.out.println("A subtração foi: " + novonumerador + "/" + novodenominador);
    }

    public void multiplicar() {
        int novodenominador = denominador * denominador2;
        int novonumerador = numerador * numerador2;
        System.out.println("A multiplicação é: " + novonumerador + "/" + novodenominador);
    }

    public void dividir() {
        int novodenominador = denominador * numerador2;
        int novonumerador = numerador * denominador2;
        System.out.println("A divisão é: " + novonumerador + "/" + novodenominador);
    }

}
