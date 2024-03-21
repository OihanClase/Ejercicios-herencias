public class PruevaAcumulador {

    public static void main(String[] args) {
        
        Acumulador p = new Acumulador(25);

        
        p.incremento(12);

       
        System.out.println("El valor obtenido es: " + p.getValor());
    }
    
}
