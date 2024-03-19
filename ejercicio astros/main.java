public class main {

    public static void main(String[] args) {

        
        
        astros tierra = new planetas(1, 0, 0, 0, 0, 0, false, false);
        astros jupiter = new planetas(0, 0, 0, 0, 0, 0, false, false);
        astros marte = new planetas(0, 0, 0, 0, 0, 0, false, false);

        astros satelite1 = new satelites(0, 0, 0, 0, 0, 0, 0, null);
        astros satelite2 = new satelites(0, 0, 0, 0, 0, 0, 0, null);
        astros satelite3 = new satelites(0, 0, 0, 0, 0, 0, 0, null);


        astros[] arrayAstros = {tierra, jupiter, marte, satelite1, satelite2, satelite3};

        System.out.println(tierra.muestra());

        muestraTodos(arrayAstros);



    }

    public static void muestraTodos(astros arrayAstros[]) {
        
        for (int i = 0; i < arrayAstros.length; i++) {

            System.out.println(arrayAstros[i]);

            
        }
    }
    
}
