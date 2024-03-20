public class satelites extends Astro {


    float distanciaPlaneta;
    float orbitaPlanetaria;
    String planetaPertebece;

    public satelites(double radioEcuatorial, double rotacionSobreEje, double masa, double tempMedia, double gravedad,
            float distanciaPlaneta, float orbitaPlanetaria, String planetaPertebece) {
        super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertebece = planetaPertebece;
    }


    


    @Override
    public String muestra() {
        return planetaPertebece;  
        
    }

    
    
    
}
