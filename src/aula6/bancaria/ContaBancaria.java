package aula6.bancaria;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String conta;
    private String tipo;
    private double valorSaldo;
    private double valorLimite;
    
    public ContaBancaria(String banco, String agencia, String conta, String tipo) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
    }
    
    public ContaBancaria(String banco, String agencia, String conta, String tipo,
                        double valorSaldo, double valorLimite) {
       this(banco, agencia, conta, tipo);
       this.valorSaldo = valorSaldo;
       this.valorLimite = valorLimite;
    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
     public void depositar(double valor) {
        setValorSaldo(valorSaldo + valor);
    }
    
    public boolean sacar(double valor) {
        if (verSaldo() < valor) {
            return false;
        } else {
            setValorSaldo(valorSaldo - valor);
            return true;
        }
    }

    public double verSaldo() {
        return valorSaldo + valorLimite;
    }
    
    public String verExtrato() {
        return "\n Banco: "+banco
                +"\n Agência: "+agencia
                +"\n Conta: "+conta
                +"\n Tipo: "+tipo
                +"\n Saldo: "+valorSaldo
                +"\n Limite: "+valorLimite
                +"\n Saldo total: "+verSaldo();
    }
}
