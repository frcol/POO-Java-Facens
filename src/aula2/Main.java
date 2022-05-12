package aula2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa x = new Pessoa("1231231", "Fabio Colombini", "2342342343");

        JOptionPane.showMessageDialog(null, x.imprimir());
    }
}
