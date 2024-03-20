public class Camion extends Coche {


    int peso;

    public Camion(int peso, int velocidad, double precio, String color) {
        super(velocidad, precio, color);
        this.peso = peso;
        
    }

    @Override
    public double getPrecio() {
       
        if (peso > 2000) {
            return super.getPrecio() * 0.9; // Descuento del 10%
        } else {
            return super.getPrecio() * 0.8; // Descuento del 20%
        }
        

    }

    

    


  
 

    


    
}
