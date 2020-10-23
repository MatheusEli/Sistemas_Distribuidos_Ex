package Sockets.aulasocket01.cliente;

import java.io.PrintStream;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        final int PORTA = 9876;
        Socket sktCliente = null;
        PrintStream saida = null;

        //solicita uma conexão
        try {
            sktCliente = new Socket("127.0.0.1", PORTA);
            System.out.println("Conectado com o servidor.");

            saida = new PrintStream(sktCliente.getOutputStream());
        } catch (Exception e) {
            System.out.println("Erro ao conetar com o servidor.");
        }

        //etapa de comunicação
        try {
            saida.println("Olá Servidor!");    
        } catch (Exception e) {
            System.out.println("Erro na etapara de comunicação.");
        }

        //encerra a conexão
        try {
            sktCliente.close();
            System.out.println("Terminada a conexão.");
        } catch (Exception e) {
            System.out.println("Erro ao encerrar a conexão.");
        }
        
    }
}
