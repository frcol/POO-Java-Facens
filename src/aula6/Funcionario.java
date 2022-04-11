package aula6;

public class Funcionario {
    // Atributos
    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;
    
    // Construtores
    public Funcionario() {
        
    }
    
    public Funcionario(int codigo, String nome, String setor,
                        String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
    }

    // Acessore e Modificadores
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // ======================================
    public String imprimir() {
        return "\n Codigo: "+codigo+
                "\n Nome: "+nome+
                "\n Setor: "+setor+
                "\n Funcao: "+funcao+
                "\n Salario: "+salario;
    }
}
