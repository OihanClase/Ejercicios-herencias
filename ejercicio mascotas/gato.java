public class gato extends mascotas{

    String color;
    boolean peloLargo;

    public gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
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
