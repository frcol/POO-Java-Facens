package aula2.demo1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Calculadora calc;
        
        int num1, num2;

        calc = new Calculadora();
        
        while(!opt.equals("5")) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Num1"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Num2"));
            
            opt = JOptionPane.showInputDialog("1- Somar\n2- Subtrair\n3-Multiplicar\n4- Dividir\n5- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    JOptionPane.showMessageDialog(null,"Resultado: "+calc.soma(num1, num2));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Resultado: "+calc.substracao(num1, num2));
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"Resultado: "+calc.div(num1, num2));
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null,"Resultado: "+calc.mult(num1, num2));
                    break;
                case "5":
                    break;
            }
        }
    }
}
