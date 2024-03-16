public class Pessoas {

    private String nome;
    private int idade;
    private String raça;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void falar(String fala) {
        System.err.println(nome + " disse " + fala);
    }

    public void andar(int passos) {
        System.out.println(nome + " andou " + passos + " passos");
    }

    public void comer(String comida) {
        System.out.println(nome + " comeu " + comida);
    }
}
