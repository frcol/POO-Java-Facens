package aula6.bancaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MainBanco1 {

    public static void main(String[] args) {
        String opt = "";
        ContaBancaria c = null;
        
        String banco;
        String agencia;
        String conta;
        String tipo;
        double valorSaldo;
        double valorLimite;
        
        ArrayList<ContaBancaria> lstContas = new ArrayList<>();
        ContaBancaria cbTmp = null;
        
        while(!opt.equals("6")) { 
            opt = JOptionPane.showInputDialog("1- Abrir Conta\n2- Sacar\n3- Depositar\n4- Imprimir extrato\n5- Aumetar Limite\n6- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            if (opt.equals("2") || opt.equals("3") || opt.equals("4") || opt.equals("5")) {
                conta = JOptionPane.showInputDialog("Conta:");
                
                for (ContaBancaria contaTmp : lstContas) {
                    if (contaTmp.getConta().equals(conta)) {
                        cbTmp = contaTmp;
                    }
                }
            }
            
            
            switch (opt) {
                case "1":
                    // Entrada do usuário
                    banco = JOptionPane.showInputDialog("Banco:");
                    agencia = JOptionPane.showInputDialog("Agencia:");
                    conta = JOptionPane.showInputDialog("Conta:");
                    tipo = JOptionPane.showInputDialog("Tipo:");
                    valorSaldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                    valorLimite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));

                    // atrinui valores ao objeto
                    c = new ContaBancaria(banco, agencia, conta, tipo, valorSaldo, valorLimite);
                    lstContas.add(c);
                    break;
                case "2":
                    if (cbTmp != null) {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Sacar: "));
                        if (!cbTmp.sacar(valor)) {
                            JOptionPane.showMessageDialog(null, 
                                                "Sem saldo na conta", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                        }
                        cbTmp = null;
                    }
                    break;
                case "3":
                    if (cbTmp != null) {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Depositar:"));
                        cbTmp.depositar(valor);
                        cbTmp = null;
                    }
                    break;
                case "4":
                    if (cbTmp != null) {
                        JOptionPane.showMessageDialog(null, cbTmp.verExtrato() );
                        cbTmp = null;
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "5":
                    if (cbTmp != null) {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Novo limite:"));
                        cbTmp.setValorLimite(valor);
                        cbTmp = null;
                    }
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }    
}
