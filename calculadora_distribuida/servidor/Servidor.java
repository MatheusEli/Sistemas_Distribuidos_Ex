package calculadora_distribuida.servidor;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    final static int PORTA = 9876;
    public static void main(String[] args) {
        
        ServerSocket serverSocket;
        Socket clienteSocket;
    
        try{
    
            serverSocket = new ServerSocket(PORTA);
        }catch(Exception ex){
    
            System.out.println("Não foi possível criar o Socket do Server.");
        }

        while(true){

            try{


                System.out.println("Aguardando Conexão...");
                clienteSocket = serverSocket.accept();
                System.out.println("Conexão com: "+clienteSocket.getInetAddress().getAddress()+", feita com sucesso!");
                
            }catch(Exception ex){

                System.out.println("Erro na conexão: "+ex.getMessage());
            }
        }
    }

    
    
}
