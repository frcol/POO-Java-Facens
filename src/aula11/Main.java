package aula11;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        
        ArrayList<Aluno> lstAlunos = new ArrayList<>();
        String ra, nome, curso, anoConclusao;
        
        while(!opt.equals("4")) { 
            opt = JOptionPane.showInputDialog("1- Criar Aluno Graduacao "+
                                              "\n2- Criar Aluno Pos"+
                                              "\n3- Imprimir"+
                                              "\n4- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) { // cadastar Aluno Graducao
                case "1":
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    anoConclusao = JOptionPane.showInputDialog("Ano de conclusao EM:");
                    
                    lstAlunos.add(new AlunoGraduacao(ra,nome,curso,anoConclusao));
                break;
                case "2": // Alunos de Pos
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    anoConclusao = JOptionPane.showInputDialog("Ano de conclusao Graducao:");
                    
                     lstAlunos.add(new AlunoPosGraduacao(ra,nome,curso,anoConclusao));
                    
                break;
                case "3":
                    if (!lstAlunos.isEmpty()) {
                        String msg = "";
                        
                        for (Aluno aluno : lstAlunos) {
                            msg += aluno.toString();
                        }
                        JOptionPane.showMessageDialog(null, msg );
                    }
                break;
                case "4":
                break;
            }
        }
    }
}
