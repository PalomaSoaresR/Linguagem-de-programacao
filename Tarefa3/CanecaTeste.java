public class CanecaTeste {
    public static void main(String[] args) {
        Caneca c1 = new Caneca();
        c1.setCor("branca");
        c1.setTamanho('G');
        c1.encher();
        System.out.println(" a caneca " + c1.getCor());
        c1.segurar();
        System.out.println(" a caneca tamanho " + c1.getTamanho());

    }

}
