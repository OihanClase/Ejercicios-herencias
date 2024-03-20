public abstract class Astro {

    double radioEcuatorial;
    double rotacionSobreEje;
    double masa;
    double tempMedia;
    double gravedad;


    public Astro(double radioEcuatorial, double rotacionSobreEje, double masa, double tempMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.gravedad = gravedad;
    }


    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }


    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }


    public double getRotacionSobreEje() {
        return rotacionSobreEje;
    }


    public void setRotacionSobreEje(double rotacionSobreEje) {
        this.rotacionSobreEje = rotacionSobreEje;
    }


    public double getMasa() {
        return masa;
    }


    public void setMasa(double masa) {
        this.masa = masa;
    }


    public double getTempMedia() {
        return tempMedia;
    }


    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }


    public double getGravedad() {
        return gravedad;
    }


    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }


    @Override
    public String toString() {
        return "Astro [radioEcuatorial=" + radioEcuatorial + ", rotacionSobreEje=" + rotacionSobreEje + ", masa="
                + masa + ", tempMedia=" + tempMedia + ", gravedad=" + gravedad + "]";
    }

    
    public abstract String muestra();
    

    
}