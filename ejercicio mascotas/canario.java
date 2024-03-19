public class canario extends aves{

    String color;
    boolean canta;

    public canario(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela,
            String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public String volar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volar'");
    }

    @Override
    public String muestra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestra'");
    }

    @Override
    public String cumpleaños() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cumpleaños'");
    }

    @Override
    public boolean habla() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'habla'");
    }

    

    
    
}
