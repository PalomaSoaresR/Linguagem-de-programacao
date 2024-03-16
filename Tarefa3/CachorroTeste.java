public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.setRaça("Pooble");
        c1.setPorte("Médio");
        c1.setIdade(6);

        System.out
                .println("Seu cachorro é da raça " + c1.getRaça() + " porte " + c1.getPorte() + " com " + c1.getIdade()
                        + " anos de idade ");

        c1.latir("auauau");
        c1.correr(true);
        c1.comer("ração");

    }
}