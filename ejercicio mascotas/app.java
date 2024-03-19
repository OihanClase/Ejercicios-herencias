public class app {

   
    
    public static void main(String[] args) {

        

        mascotas firulais = new perro(null, 0, null, null, "caniche", false);
        mascotas michi = new gato(null, 0, null, null, "pedro", false);
    
        mascotas parlanchin = new loro(null, 0, null, null, false, false, null, false);
        mascotas popelle = new canario(null, 0, null, null, false, false, null, false);
        
        
        mascotas[] listaMascotas = {firulais, michi, parlanchin, popelle};

       
        inventario Inventario = new inventario(listaMascotas);

       
        System.out.println(firulais.muestra());


        inventario.mostrarInventario();


    }

    
       
    
   
}
    

