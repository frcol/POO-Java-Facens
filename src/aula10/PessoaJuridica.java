package aula10;

public class PessoaJuridica extends Pessoa implements I_ImplementaXPTO{
    private String razao;
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String razao, String cnpj, String email, String celular) {
        super(email, celular);
        this.razao = razao;
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String imprimir() {
        return "\n Razao Social: "+razao+
                "\n CNPJ: "+cnpj;
    }

    @Override
    public void xpto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
