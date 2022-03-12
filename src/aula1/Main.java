
package aula1;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String opt = "";
        Aluno a = null;
        String ra, nome, curso;
        
        while(!opt.equals("3")) { 
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Consultar\n3- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    
                    a = new Aluno();
                    a.setRa(ra);
                    a.setNome(nome);
                    a.setCurso(curso);
                    
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, a.imprimir());
                    break;
                case "3":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
        
    }
    
}
