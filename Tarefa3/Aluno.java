public class Aluno {
    private String nome;
    private int idade;
    private String curso;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean estudar(boolean estudando) {
        if (estudando) {
            System.out.print(" está estudando");
        } else {
            System.out.print(" não está estudando");
        }
        return estudando;
    }

    public boolean assistirAula(boolean assistindo) {
        if (assistindo) {
            System.out.println(" está assistindo aula");
        } else {
            System.out.println(" não está assistindo aula");
        }
        return assistindo;
    }

    public void calcularNota(int nota) {
        System.out.println(nome + " teve " + nota + " de nota");
    }
}
