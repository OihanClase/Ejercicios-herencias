public class Acumulador implements Modificable{

    int valor;

    public Acumulador(int valorInicial) {
        this.valor = valorInicial;
    }


    


    @Override
    public void incremento(int valorIncremento) {

        this.valor += valorIncremento;
      
    }





    public int getValor() {
        return valor;
    }

    
    
    
}
