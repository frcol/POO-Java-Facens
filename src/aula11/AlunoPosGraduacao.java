package aula11;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    
    public AlunoPosGraduacao(String ra, String nome, String curso, String anoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    @Override
    public String toString() {
        return "\nRA: "+getRa()+
                "\nNome: "+getNome()+
                "\nCurso: "+getCurso()+
                "\nAno de Conclusao do EM: "+anoConclusaoGraduacao;
    } 
}
