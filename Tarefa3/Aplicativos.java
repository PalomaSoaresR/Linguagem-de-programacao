public class Aplicativos {
    private String nome;
    private int armazenamento;
    private String estilo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean conversar(boolean conversa) {
        if (conversa) {
            System.out.print("é um aplicativo de conversa");
        } else {
            System.out.print("não é um aplicativo de conversa");
        }
        return conversa;
    }

    public void tirarFotos() {
        System.out.println("Você tirou um foto");
    }

    public boolean assistirVideos(boolean assistindo) {
        if (assistindo) {
            System.out.println(" e o aplicativo possui vídeos");

        } else {
            System.out.println(" e o aplicativo não possui vídeos");

        }
        return assistindo;
    }

}
