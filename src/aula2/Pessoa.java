package aula2;

public class Pessoa {
    private String cpf;
    private String nome;
    private String carteiraDeMotorista;
    
    public Pessoa(String cpf, String nome, String carteira) { // Construtor
        this.cpf = cpf;
        this.nome = nome;
        this.carteiraDeMotorista = carteira;
    }

    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }
    
    public String imprimir() {
        return "CPF: "+this.cpf+
                "\nNome:"+this.nome+
                "\nCArteira de Motorista:"+getCarteiraDeMotorista();
    }
}
