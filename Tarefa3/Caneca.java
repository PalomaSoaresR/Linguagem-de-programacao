public class Caneca {
    private String cor;
    private String material;
    private char tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public void encher() {
        System.out.print("Você está enchendo a caneca");
    }

    public void envaziar() {
        System.out.print("Você está esvaziando a caneca");

    }

    public void segurar() {
        System.out.print("Você está segurando a caneca");

    }

}
