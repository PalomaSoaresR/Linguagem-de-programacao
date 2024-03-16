public class AlunoTeste {

    public static void main(String[] args) {
        Aluno c1 = new Aluno();

        c1.setNome("Paloma");
        c1.setIdade(21);
        c1.setCurso("Banco de Dados");

        System.out.print(c1.getNome() + " tem " + c1.getIdade() + " anos e cursa " + c1.getCurso());
        c1.estudar(true);
        c1.assistirAula(true);
        c1.calcularNota(10);
    }
}