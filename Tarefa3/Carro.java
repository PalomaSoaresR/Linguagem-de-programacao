public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

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

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int aceleração) {
        velocidade += aceleração;
        System.out.println(aceleração);
    }

    public void freiar(int freio) {
        velocidade -= freio;
    }

    public String bozinar(String buzina) {
        return ("bibibi");
    }

}
