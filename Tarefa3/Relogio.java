public class Relogio {
    private String marca;
    private boolean ponteiro;
    private String cor;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isPonteiro() {
        return ponteiro;
    }
    public void setPonteiro(boolean ponteiro) {
        this.ponteiro = ponteiro;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrarHora(int hora) {
        System.out.println("Hora atual: " + hora);
    }

    public void marcarAlarme(int alarme) {
        System.out.println("Alarme marcado para " + alarme);
    }

    public void cronometrar() {
        System.out.println("Cronômetro iniciado.");
    
    
}
}