package aula6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Funcionario func = null;
        
        int codigo;
        String nome, setor, funcao;
        double salario;
        
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<>();
        
        while(!opt.equals("4")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar Funcionario"+
                    "\n2- Mostrar todos os funcionarios \n3- Mostrar Funcionario"+
                    "\n4- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    setor = JOptionPane.showInputDialog("Setor: ");
                    funcao = JOptionPane.showInputDialog("Funcao: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
                    
                    func = new Funcionario(codigo, nome, setor, funcao, salario);
                    lstFuncionarios.add(func);
                    
                    break;
                case "2":
                    if (!lstFuncionarios.isEmpty()) {
                        String msg = "";
                        for (Funcionario funcTmp : lstFuncionarios) {
                            msg += funcTmp.imprimir() +"\n ############### \n\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }
                    break;
                case "3":
                    if (!lstFuncionarios.isEmpty()) {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                        for (Funcionario jao : lstFuncionarios) {
                            if (jao.getCodigo() == codigo) {
                                JOptionPane.showMessageDialog(null, jao.imprimir());
                            } 
                        }
                    }
                    break;
                case "4":
                    break;
                        
            }
        }
    }
}
