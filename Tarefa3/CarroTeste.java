public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.setMarca();
        c1.setModelo("Toro");
        c1.setVelocidade(50);
        System.out.println("Marca: " + c1.getMarca() + ", modelo " + c1.getModelo());

        c1.acelerar(10);
        c1.freiar(10);
        c1.bozinar(true);

    }

}
