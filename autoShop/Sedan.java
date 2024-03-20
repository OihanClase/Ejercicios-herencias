public class Sedan extends Coche {

    int longitud;

    public Sedan(int velocidad2, double precio2, String color2, int longitud) {
        super(velocidad2, precio2, color2);
        this.longitud = longitud;
    }

    @Override
    public double getPrecio() {

        if (longitud > 3) {
            return super.getPrecio() * 0.95; // Descuento del 5%
        } else {
            return super.getPrecio() * 0.9; // Descuento del 10%
        }
       
    }

    

    
    
}
