public class LivroTestar {
    public static void main(String[] args) {
        Livro c1 = new Livro();

        c1.setNome("Romeu e Julieta");
        c1.setAutor("William Shakespeare");
        c1.setPaginas(248);
        c1.abrir();
        System.err.println(c1.getNome() + " de " + c1.getAutor());

        c1.folhear();
        c1.fechar();

    }
}