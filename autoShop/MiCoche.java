public class MiCoche {

    public static void main(String[] args) {

      
        
        Coche sedan = new Sedan(150, 20000, "Rojo", 4);
        Ford ford1 = new Ford(180, 30000, "Azul", 2022, 1500);
        Ford ford2 = new Ford(200, 35000, "Blanco", 2023, 2000);
        Coche coche = new Coche(120, 15000, "Negro");

        Coche[] coches = {sedan, ford1, ford2, coche};

        for (int i = 0; i < coches.length; i++) {
            Coche c = coches[i];
            System.out.println("Precio de venta: $" + c.getPrecio());
        }

       
    }
    
}
