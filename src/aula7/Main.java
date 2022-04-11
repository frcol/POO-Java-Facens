package aula7;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String opt = "";
        Curso cur = null;
        
        int codigo, cargaHoraria;
        String nome;
        
        ArrayList<Curso> lstCurso = new ArrayList<>();
        Curso cursoTMp = null;
        
        String nomeAluno, ra;
        
        while(!opt.equals("3")) { 
            opt = JOptionPane.showInputDialog("1- Cad Curso\n2- Cad Aluno\n3- Remover Aluno\n4- Mostra todos Cursos\n5- Mostrar Aluno do Curso\n6- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    // Entrada do usuário
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));
                    nome = JOptionPane.showInputDialog("Codigo:");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga HOraria:"));
                    
                    // atrinui valores ao objeto
                    cur = new Curso(codigo, nome, cargaHoraria);
                    lstCurso.add(cur);
                    
                    break;
                case "2":
                     codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));
                     
                     for(Curso curso : lstCurso) {
                         if (curso.getCodigo() == codigo) {
                             cursoTMp = curso;
                         }
                     }
                     
                     if (cursoTMp != null) {
                        ra = JOptionPane.showInputDialog("RA:");
                        nomeAluno = JOptionPane.showInputDialog("Nome:");
                        Aluno a = new Aluno(ra, nomeAluno);
                        cursoTMp.inserirAluno(a);
                     }
                     
                    break;
                case "3":
                    if (a != null) {
                        JOptionPane.showMessageDialog(null, a.imprimir() );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
}
