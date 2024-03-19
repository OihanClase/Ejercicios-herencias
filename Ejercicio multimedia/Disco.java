public class Disco extends Multimedia{

    private Genero genero;

    // Constructor
    public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
        super( titulo,  autor,  formato,  duracion);
        this.genero = genero;
    }

    // Método getter y toString
    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + " Disco [genero=" + genero + "]";
    }
}