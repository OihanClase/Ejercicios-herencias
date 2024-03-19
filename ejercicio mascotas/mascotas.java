public abstract class mascotas{

    String nombre;
    int edad;
    String estado;
    String fechaNacimiento;
    

    public mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    public abstract String muestra();

    public abstract String cumpleaños();

    public abstract boolean habla();

    

    
    
}
