public class planetas extends Astro {

    float distanciaSol;
    boolean orbitaSol;
    boolean tieneSatelites;

    public planetas(double radioEcuatorial, double rotacionSobreEje, double masa, double tempMedia, double gravedad,
            float distanciaSol, boolean orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }



    @Override
    public String muestra() {
        return "planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
        + tieneSatelites +"radio ecuatoriaaaal: " +radioEcuatorial +"]";
    }



    @Override
    public String toString() {
        return "planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
                + tieneSatelites + "]";
    }


    

    


   



    
    
    
}
