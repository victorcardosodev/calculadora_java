,0/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno */
public class MenuCalculadora {
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados 10;
    
    public MenuCalculadora() {
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    public void executarCalculadora() {
        do(
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        )while(this.opcao!=0);
    }
    private void executarMenuPrincipal() { 
        String mensagemMenu = "Selecione uma opção "
                +"\n 1 - somar"
                +"\n 2 - subtrair"
                +"\n 3 - multiplicar"
                +"\n 4 - dividir"
                +"\n 5 - sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToIn(entradaDados);
    }
    public void avaliarOpcaoEscolhida() {
        String saida;
        double num1=0, num2=0;
        if(this.opcao != 0 && this.opcao<=4) {
            String mensagemEntrada = "Digite o 1º numero";
            num1 = conversor.StringTodouble(io.entradaDados(mensagemEntrada));
            calculadora.setNome01(num1);
            mensagemEntrada = "Digite o 2º numero";
            unm2 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero02(num2);
        }
        switch(this.opcao) {
            case 1:
                calculadora.somar(num1,num2);
                saida="Resultado da soma: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            case 2:
                calculadora.subtrair(num1, num2);
                saida="Resultado da subtração: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            case 3:
                calculadora.multiplicar(num1, num2);
                saida="Resultado da multiplicação: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            case 4:
                calculadora.dividir(num1, num2);
                saida="Resultado da Divisão: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            case 5:
                calculadora.sair();
                
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
}
