package calculadora_distribuida.util;

import java.io.Serializable;

/*
Dados para o Servidor
*/

public class Requisicao implements Serializable{
    

    private static final long serialVersionUID = 1L;
    private double numero1;
    private double numero2;
    private char operacao;

    public Requisicao(double numero1, double numero2, char operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public char getOperacao() {
        return operacao;
    }
    
}
