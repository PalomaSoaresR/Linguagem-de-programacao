public class Lapis {
    private String cor;
    private int calibre;
    private String marca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void pintar() {
        System.out.print("Você está pintando");
    }

    public void escrever() {
        System.out.print("Você está escrevendo");

    }

    public void desenhar() {
        System.out.print("Você está desenhando");

    }

}
