package aula2.demo2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Aluno a = null;
        
        String ra, nome, curso;
        int anoIntegracao;
        float nota1, nota2, nota3, nota4;
        
        while (!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar Aluno \n2- Constultar Aluno \n3- Sair");
            
            switch(opt) {
                case "1":
                    ra = JOptionPane.showInputDialog("RA");
                    nome = JOptionPane.showInputDialog("Nome");
                    curso = JOptionPane.showInputDialog("Curso");
                    anoIntegracao = Integer.parseInt(JOptionPane.showInputDialog("Ano Integracao"));
                    
                    a = new Aluno(ra, nome, curso, anoIntegracao);
                    
                    if (anoIntegracao <= 2019) {
                        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
                        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
                        a.setNota1(nota1);
                        a.setNota2(nota2);
                    } else {
                        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
                        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
                        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota3"));
                        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota4"));
                        a.setNota1(nota1);
                        a.setNota2(nota2);
                        a.setNota3(nota3);
                        a.setNota4(nota4);
                    }
                    break;
                case "2":
                    if (a == null) {
                        JOptionPane.showMessageDialog(null, "Precisa cadastrar um Aluno");
                    } else {
                        JOptionPane.showMessageDialog(null, a.imprimir());
                    }
                    break;
                case "3":
                    break;
            }
        
        }
    }
}
