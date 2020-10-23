package Sockets.aulasocket02.cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        final int PORTA = 9876;
        Socket sktCliente = null;
        PrintStream saida = null;
        Scanner entrada = null;
        Scanner teclado = new Scanner(System.in);
        String msg;

        // solicita uma conexão
        try {
            sktCliente = new Socket("127.0.0.1", PORTA);
            System.out.println("Conectado com o servidor.");

            saida = new PrintStream(sktCliente.getOutputStream());
            entrada = new Scanner(sktCliente.getInputStream());
        } catch (Exception e) {
            System.out.println("Erro ao conetar com o servidor.");
        }

        // etapa de comunicação
        try {
            do {
                System.out.println("Digite a mensagem:");
                msg = teclado.nextLine();
                saida.println(msg);
                String msgSrv = entrada.nextLine();
                System.out.println("Recebido: " + msgSrv);
            } while (!msg.equals("exit") && !msg.equals("fechar"));

        } catch (Exception e) {
            System.out.println("Erro na etapara de comunicação.");
        }

        // encerra a conexão
        try {
            sktCliente.close();
            System.out.println("Terminada a conexão.");
        } catch (Exception e) {
            System.out.println("Erro ao encerrar a conexão.");
        }

    }
}
