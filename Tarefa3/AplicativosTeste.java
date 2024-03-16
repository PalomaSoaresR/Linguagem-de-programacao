public class AplicativosTeste {
    public static void main(String[] args) {
        Aplicativos c1 = new Aplicativos();
        c1.setNome("Intagram");
        c1.setEstilo("rede social");
        System.out.print("O " + c1.getNome() + " é uma " + c1.getEstilo() + ", ");
        c1.conversar(true);
        c1.assistirVideos(true);
    }
}
