package Sockets.aulasocket01.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        final int PORTA = 9876;
        ServerSocket sktServer = null;
        Socket sktCliente = null;
        Scanner entrada;

        // bind - solicitar uma porta ao SO
        try {
            sktServer = new ServerSocket(PORTA);
        } catch (Exception e) {
            System.out.println("Porta " + PORTA + " em uso");
            return;
        }

        // aguarda um pedido de conexão - listen/accept
        try {
            System.out.println("Aguardando uma conexão...");
            sktCliente = sktServer.accept();

            System.out.println("Conectado com " + sktCliente.getInetAddress().getHostAddress());

            entrada = new Scanner(sktCliente.getInputStream());

        } catch (Exception e) {
            System.out.println("Erro no processo de conexão.");
            return;
        }

        // etapa de comunicação
        try {
            String msg = entrada.nextLine();
            System.out.println("Recebido: " + msg);

        } catch (Exception e) {
            System.out.println("Erro dunrante a comunicação com o cliente.");
        }

        // encerra a conexão
        try {
            sktCliente.close();
            sktServer.close();
            System.out.println("Terminada a conexão.");
        } catch (Exception e) {
            System.out.println("Erro ao encerrar as conexões.");
        }

    }
}