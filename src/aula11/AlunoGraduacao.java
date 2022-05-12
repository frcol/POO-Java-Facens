package aula11;

public class AlunoGraduacao extends Aluno{
    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override
    public String toString() {
        return "\nRA: "+getRa()+
                "\nNome: "+getNome()+
                "\nCurso: "+getCurso()+
                "\nAno de Conclusao do EM: "+anoConclusaoEnsinoMedio;
    }   
    
    
}
