public class TestInteface {

    public static void hazleHablar(Parlanchin parlanchin) {
        parlanchin.habla();
    }

    public static void main(String[] args) {
        

        Perro firulais = new Perro();
        Gato michi = new Gato();
        Cucu cucu = new Cucu();



       hazleHablar(michi);
       hazleHablar(firulais);
       hazleHablar(cucu);

    }

 

    
    
}
