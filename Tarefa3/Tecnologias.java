public class Tecnologias {

    // atributos
    private String marca;
    private String modelo;
    private boolean touch;

    // métodos de acesso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }

    // métodos de classe
    public void tocar(String som) {
        System.out.println("O " + modelo + " está tocando " + som);
    }

    public void ligar(long telefone) {
        System.out.println("Você está ligando para " + telefone);
    }

    public void pesquisar(String pesquisa) {
        System.out.println("Você está pesquisando sobre " + pesquisa);
    }

}
