package aula2.demo1;

public class Calculadora {
    public int soma(int a, int b) {
        System.out.println("int");
        return a+b;
    }
    
    public double soma(double a, double b) {
        System.out.println("double");
        return a+b;
    }
    
    public int substracao(int a, int b) {
        return a-b;
    }
    
    public double substracao(double a, double b) {
        return a-b;
    }
    
    public int mult(int a, int b) {
        return a*b;
    }
    
    public double mult(double a, double b) {
        return a*b;
    }
    
    public int div(int a, int b) {
        return a/b;
    }
    
    public double div(double a, double b) {
        return a/b;
    }
}
