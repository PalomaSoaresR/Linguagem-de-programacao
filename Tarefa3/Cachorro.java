public class Cachorro {
    private String raça;
    private String porte;
    private int idade;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String latir(String latido) {
        return (latido);
    }

    public boolean correr(boolean correndo) {
        if (correndo) {
            System.out.println("Seu cachorro corre");
        } else {
            System.out.println("Seu cachorro não corre");
        }
        return correndo;
    }

    public void comer(String comida) {
        System.out.println("Seu cachorro come " + comida);

    }
}