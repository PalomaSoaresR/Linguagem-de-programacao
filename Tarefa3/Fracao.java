public class Fracao {
    private int numerador;
    private int denominador;
    private int numerador2;
    private int denominador2;

    public Fracao(int numerador, int denominador, int numerador2, int denominador2) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

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
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
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
        if (denominador2 == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.denominador2 = denominador2;
    }

    public void somar() {
        int novoDenominador = denominador * denominador2;
        int novoNumerador = (numerador * denominador2) + (numerador2 * denominador);
        System.out.println("A soma é: " + novoNumerador + "/" + novoDenominador);
    }

    public void subtrair() {
        int novoDenominador = denominador * denominador2;
        int novoNumerador = (numerador * denominador2) - (numerador2 * denominador);
        System.out.println("A subtração é: " + novoNumerador + "/" + novoDenominador);
    }

    public void multiplicar() {
        int novoNumerador = numerador * numerador2;
        int novoDenominador = denominador * denominador2;
        System.out.println("A multiplicação é: " + novoNumerador + "/" + novoDenominador);
    }

    public void dividir() {
        int novoNumerador = numerador * denominador2;
        int novoDenominador = denominador * numerador2;
        System.out.println("A divisão é: " + novoNumerador + "/" + novoDenominador);
    }

    public static void main(String[] args) {
        Fracao frac1 = new Fracao(1, 2, 3, 2);

        System.out.println("Fração 1: " + frac1.getNumerador() + "/" + frac1.getDenominador());
        System.out.println("Fração 2: " + frac1.getNumerador2() + "/" + frac1.getDenominador2());

        frac1.somar();
        frac1.subtrair();
        frac1.multiplicar();
        frac1.dividir();
    }
}
