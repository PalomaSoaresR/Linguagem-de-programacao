public class RelogioTeste {
    public static void main(String[] args) {
        Relogio c1 = new Relogio();
        
        c1.setMarca("Rolex");
        c1.setCor("Prata");
        c1.setPonteiro(true);

        c1.mostrarHora(10);
        c1.marcarAlarme(06);
        c1.cronometrar();
    }    
}
