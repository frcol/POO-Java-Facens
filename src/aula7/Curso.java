package aula7;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> lstAlunos; // <-- relacionamento
    
    public Curso() {
        lstAlunos = new ArrayList<>();
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
         this();
         this.nome = nome;
         this.cargaHoraria = cargaHoraria;
         this.codigo = codigo;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    public void setLstAlunos(ArrayList<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }
    
    public void inserirAluno(Aluno aluno) {
        lstAlunos.add(aluno);
    }
    
    public void removeAluno(int index) {
        lstAlunos.remove(index);
    }
    
    public String imprimir() {
        return "\nCodigo: "+codigo+
               "\nNome: "+nome+
               "\nCarga horaria: "+cargaHoraria;
    }
    
    public String imprimirCompleto() {
        String msg = imprimir()+"\n =========== ";
        
        for (Aluno alunoTmp : lstAlunos) {
            msg += alunoTmp.imprimir()+"\n ------------";
        }
        
        return msg;
    }
}
