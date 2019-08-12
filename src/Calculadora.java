/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Calculadora {
    private double numero1;
    private double numero2;
    private double resultado;
    
    public Calculadora() {
        this(0,0,0);
    }
    
    public Calculadora(double numero1, double numero02, double resultado) {
        this.numero1 = numero01;
        this.numero2 = numero02;
        this.resultado = resultado;
    }
    
    public double getNumero01 () {
        return numero01;
    }
    
    public void setNumero01 (double numero01) {
        this.numeor01 = numero01;
    }
    
    public double getNumero02 () {
        return numero02;
    }
    
    public void setNumero02(double numero02{
        this.numero02 = numero02;
    }
    
    public double getResultado()  {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void somar(double numero01, double numero02){
        setResultado(this.getNumero01() + this.getNumero02());
    }
    
}
