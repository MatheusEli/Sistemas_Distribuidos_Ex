package calculadora_distribuida.util;

import java.io.Serializable;

/*
    Dados para o Cliente
*/

public class Resposta implements Serializable{

    private static final long serialVersionUID = 1L;
    private double resultado;
    private int status;

	public Resposta(double resultado, int status) {
		this.resultado = resultado;
		this.status = status;
	}

    public double getResultado() {
        return resultado;
    }

    public int getStatus() {
        return status;
    }
    
}
