package aula10;

public class Pessoa {
    private String email;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String imprimir() {
        return "\n EMail: "+getEmail()+
                "\n Celular: "+getCelular();          
    }
}
