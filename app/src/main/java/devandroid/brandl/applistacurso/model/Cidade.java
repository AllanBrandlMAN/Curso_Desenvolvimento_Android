package devandroid.brandl.applistacurso.model;

import android.util.Log;

public class Cidade {

    private String nomeCidade;
    private String estadoCidade;
    private String paisCidade;



    public Cidade() {
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getEstadoCidade() {
        return estadoCidade;
    }

    public void setEstadoCidade(String estadoCidade) {
        this.estadoCidade = estadoCidade;
    }

    public String getPaisCidade() {
        return paisCidade;
    }

    public void setPaisCidade(String paisCidade) {
        this.paisCidade = paisCidade;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nomeCidade='" + nomeCidade + '\'' +
                ", estadoCidade='" + estadoCidade + '\'' +
                ", paisCidade='" + paisCidade + '\'' +
                '}';
    }


}
