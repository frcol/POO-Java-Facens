package aula5.exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String opt = "";
        Apolice ap = null;
        
        int numero;
        int idade;
        String nome;
        char sexo;
        double valorAutomovel;
        
        ArrayList<Apolice> lstApolices = new ArrayList<>();
        
        while(!opt.equals("4")) { 
            opt = JOptionPane.showInputDialog("1a- Cadastrar\n2- Consultar\n3- Consultar Item\n4- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    // Entrada do usuário
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    sexo = JOptionPane.showInputDialog("Sexo:").charAt(0);
                    valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Valor do Automovel:"));
                    
                    // atrinui valores ao objeto
                    ap = new Apolice(numero, idade, nome, sexo, valorAutomovel);
                    lstApolices.add(ap);
                    break;
                case "2":
                    if (!lstApolices.isEmpty()) {
                        String msg = "";
                        for (Apolice apo : lstApolices) {
                            msg += "\n"+apo.imprimir();
                            msg += "\n====================";  
                        }
                        
                        JOptionPane.showMessageDialog(null,msg );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    if (!lstApolices.isEmpty()) {
                       numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da Apolice:"));
                        
                       for (Apolice apo : lstApolices) {
                            if (apo.getNumero() == numero) {
                               JOptionPane.showMessageDialog(null,apo.imprimir() ); 
                            } 
                       }    
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
}
