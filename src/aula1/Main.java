
package aula1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        
        a.setRa("123456");
        a.setNome("Fabio");
        a.setCurso("ADS");
        
        JOptionPane.showMessageDialog(null, a.imprimir());
    
        Aluno b = new Aluno();
        b.setRa("7879879");
        b.setCurso("Jogos");
        b.setNome("Marcos");
        
        JOptionPane.showMessageDialog(null, b.imprimir());
    }
    
}
