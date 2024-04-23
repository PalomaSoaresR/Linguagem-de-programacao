public class Fracao {
    private int numerador;
    private int denominador;
    
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

    public void somar() {
        int novodenominador = denominador * denominador;
        int novonumerador = (novodenominador / denominador) * numerador + (novodenominador / denominador) * numerador;
        System.out.println("A soma foi: " + novonumerador + "/" + novodenominador);

    }

    public void subtrair() {
        int novodenominador = denominador * denominador;
        int novonumerador = (novodenominador / denominador) * numerador - (novodenominador / denominador) * numerador;
        System.out.println("A subtração foi: " + novonumerador + "/" + novodenominador);
    }

    public void multiplicar() {
        int novodenominador = denominador * denominador;
        int novonumerador = numerador * numerador;
        System.out.println("A multiplicação é: " + novonumerador + "/" + novodenominador);
    }

    public void dividir() {
        int novodenominador = denominador * numerador;
        int novonumerador = numerador * denominador;
        System.out.println("A divisão é: " + novonumerador + "/" + novodenominador);
    }

}
