import aula1.*;
import javax.swing.JOptionPane;


public class MainTemplate {

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
                    // Entrada do usuário
                    ra = JOptionPane.showInputDialog("RA:");
                   
                    // atrinui valores ao objeto
                    a = new Aluno();
                    a.setRa(ra);
                    
                    break;
                case "2":
                    if (a != null) {
                        JOptionPane.showMessageDialog(null, a.imprimir() );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
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
