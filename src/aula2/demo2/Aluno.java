package aula2.demo2;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    private int anoIntegracao;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    
    public Aluno() {
        
    }
    
    public Aluno(String ra, String nome, String curso, int anoIntegracao) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoIntegracao = anoIntegracao;
    }
    
    public Aluno(String ra) {
        this.ra = ra;
    }
            
    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    // ==================================================
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIntegracao() {
        return anoIntegracao;
    }

    public void setAnoIntegracao(int anoIntegracao) {
        this.anoIntegracao = anoIntegracao;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
    
    public double calculaMedia(double nota1, double nota2) {
        return (nota1+nota2)/2;
    }
    
    public double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1*0.15f) + (nota2*0.30f) + (nota3*0.1f) + (nota4*0.45f);
    }
    
    public String imprimir() {
        double media;
        if (anoIntegracao <= 2019) {
            media = calculaMedia(nota1, nota2);
        } else {
            media = calculaMedia(nota1, nota2, nota3, nota4);
        }
        
        String msg = " RA: "+ra
                    +"\n Nome: "+nome
                    +"\n Curso: "+curso
                    +"\n Media: %.2f";
        
        return String.format(msg, media);
        
    }
    
}
