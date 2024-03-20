public class Coche {
    int velocidad;
    double precio;
    String color;

    Coche(int velocidad, double precio, String color) {
        this.velocidad = velocidad;
        this.precio = precio;
        this.color = color;
    }

    double getPrecio() {
        return precio;
    }
}