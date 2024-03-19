public class perro extends mascotas{


    String raza;
    boolean pulgas;
    
    public perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public String muestra() {
        
        return "perro [raza=" + raza + ", pulgas=" + pulgas + "]";
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
