package aula2.exercicio2;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentual;
    
    public Vendedor(int codigo, String nome) {
        
    }
    
    public Vendedor(int codigo, String nome, double percentual) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentual = percentual;  
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentual / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir(double valorVenda, double desconto) {
        return "Código: "+codigo
                +"\nNome:"+nome
                +"\nValor venda:"+valorVenda
                +"\n% Comissão:"+percentual
                +"\nDesconto:"+desconto
                +"\nValor a pagar:"+calcularPagamentoComissao(valorVenda, desconto);
    }
}
