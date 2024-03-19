public class Main {
    public static void main(String[] args) {
    
        ListaMultimedia listaMultimedia = new ListaMultimedia(10);

        Pelicula pelicula1 = new Pelicula("Pelicula1", "Director1", Formato.AVI, 120, "Actor1", "Actriz1");
        Pelicula pelicula2 = new Pelicula("Pelicula2", "Director2", Formato.MPG, 90, "Actor2", "Actriz2");
        Pelicula pelicula3 = new Pelicula("Pelicula3", "Director3", Formato.MP3, 150, "Actor3", "Actriz3");

        listaMultimedia.add(pelicula1);
        listaMultimedia.add(pelicula2);
        listaMultimedia.add(pelicula3);

        System.out.println("Lista de Películas:");
        System.out.println(listaMultimedia.toString());

    
        listaMultimedia = new ListaMultimedia(20);

        Disco disco1 = new Disco("Disco1", "Artista1", Formato.CDAUDIO, 60, Genero.rock);
        Disco disco2 = new Disco("Disco2", "Artista2", Formato.DVD, 45, Genero.pop);
        Disco disco3 = new Disco("Disco3", "Artista3", Formato.WAV, 75, Genero.opera);

        listaMultimedia.add(disco1);
        listaMultimedia.add(disco2);
        listaMultimedia.add(disco3);

        System.out.println("\nLista de Discos:");
        System.out.println(listaMultimedia.toString());

       
    }    
}