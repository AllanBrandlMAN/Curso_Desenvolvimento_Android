package devandroid.brandl.applistacurso.model;


//Ordem de pagamento
public class Pessoa {
    //construtor da classe pessoa
    //atributos da classe pessoa atributo - objeto - molde- modelo -template
    //metodos de acesso - getters e setters

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;


    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Pessoa(){


}

}
