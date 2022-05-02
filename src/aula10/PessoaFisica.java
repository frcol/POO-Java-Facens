package aula10;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public PessoaFisica() {
    }
    
    public PessoaFisica(String nome, String cpf, String email, String celular) {
        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String imprimir() {
        return "\n Nome: "+nome+
                "\n CPF: "+cpf+
                super.imprimir();          
    }
}
