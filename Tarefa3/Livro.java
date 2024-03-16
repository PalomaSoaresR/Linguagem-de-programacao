public class Livro {
    private String nome;
    private String autor;
    private int paginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void abrir() {
        System.out.print("Você está abrindo o livro ");

    }

    public void fechar() {
        System.out.println("Você está fechando o livro");
    }

    public void folhear() {
        System.out.println("Você está folheando o livro");

    }
}