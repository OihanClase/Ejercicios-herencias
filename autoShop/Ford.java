public class Ford extends Coche{

    
    int anyo;
    int descuentoFabricante;
    
    public Ford(int velocidad2, double precio2, String color2, int anyo, int descuentoFabricante) {
        super(velocidad2, precio2, color2);
        this.anyo = anyo;
        this.descuentoFabricante = descuentoFabricante;
    }


    @Override
    double getPrecio() {
        return super.getPrecio() - descuentoFabricante;
    }

    
    
}
