public abstract class aves extends mascotas{

    boolean pico;
    boolean vuela;









    public aves(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }





    public abstract String volar();
    
}
