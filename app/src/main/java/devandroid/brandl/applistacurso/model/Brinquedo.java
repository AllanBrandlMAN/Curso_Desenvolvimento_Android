package devandroid.brandl.applistacurso.model;

public class Brinquedo {

    private String nomeBrinquedo;
    private String anoBrinquedo;
    private String precoBrinquedo;






    public String getNomeBrinquedo() {
        return nomeBrinquedo;
    }

    public void setNomeBrinquedo(String nomeBrinquedo) {
        this.nomeBrinquedo = nomeBrinquedo;
    }

    public String getAnoBrinquedo() {
        return anoBrinquedo;
    }

    public void setAnoBrinquedo(String anoBrinquedo) {
        this.anoBrinquedo = anoBrinquedo;
    }

    public String getPrecoBrinquedo() {
        return precoBrinquedo;
    }

    public void setPrecoBrinquedo(String precoBrinquedo) {
        this.precoBrinquedo = precoBrinquedo;
    }

    public Brinquedo(){}


    @Override
    public String toString() {
        return "Brinquedo{" +
                "nomeBrinquedo='" + nomeBrinquedo + '\'' +
                ", anoBrinquedo='" + anoBrinquedo + '\'' +
                ", precoBrinquedo='" + precoBrinquedo + '\'' +
                '}';
    }
}
