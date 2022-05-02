package aula10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        String nome, doc, email, celular;
        
        while(!opt.equals("4")) { 
            opt = JOptionPane.showInputDialog("1- Criar Pessoa Fisica "+
                                              "\n2- CriarPessoa Juridica"+
                                              "\n3- Imprimir"+
                                              "\n4- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) { // cadastar Pessoa Fisica
                case "1":
                    nome = JOptionPane.showInputDialog("Nome:");
                    doc = JOptionPane.showInputDialog("CPF:");
                    email = JOptionPane.showInputDialog("Email:");
                    celular = JOptionPane.showInputDialog("Celular:");
                    
                    lstPessoas.add(new PessoaFisica(nome, doc, email, celular));
                break;
                case "2":
                    nome = JOptionPane.showInputDialog("Razao Social:");
                    doc = JOptionPane.showInputDialog("CNPJ:");
                    email = JOptionPane.showInputDialog("Email:");
                    celular = JOptionPane.showInputDialog("Celular:");
                    
                    lstPessoas.add(new PessoaJuridica(nome, doc, email, celular));
                break;
                case "3":
                    if (!lstPessoas.isEmpty()) {
                        String msg = "";
                        for (Pessoa pessoa : lstPessoas) {
                            msg += pessoa.imprimir();
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
