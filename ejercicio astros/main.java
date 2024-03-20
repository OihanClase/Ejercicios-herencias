public class main {

    public static void main(String[] args) {

        
        
        Astro tierra = new planetas(1, 0, 0, 0, 0, 0, false, false);
        Astro jupiter = new planetas(0, 0, 0, 0, 0, 0, false, false);
        Astro marte = new planetas(0, 0, 0, 0, 0, 0, false, false);

        Astro satelite1 = new satelites(0, 0, 0, 0, 0, 0, 0, null);
        Astro satelite2 = new satelites(0, 0, 0, 0, 0, 0, 0, null);
        Astro satelite3 = new satelites(0, 0, 0, 0, 0, 0, 0, null);


        Astro[] arrayAstros = {tierra, jupiter, marte, satelite1, satelite2, satelite3};

        System.out.println(tierra.muestra());

        muestraTodos(arrayAstros);



    }

    public static void muestraTodos(Astro arrayAstros[]) {
        
        for (int i = 0; i < arrayAstros.length; i++) {

            System.out.println(arrayAstros[i]);

            
        }
    }
    
}
