public class LapisTeste {
    public static void main(String[] args) {
        Lapis c1 = new Lapis();
        c1.setCor("preto");
        c1.escrever();
        System.out.println(" com o lapis " + c1.getCor());
        c1.setCor("vermelho");
        c1.desenhar();
        System.out.println(" com lapis " + c1.getCor());
    }

}
