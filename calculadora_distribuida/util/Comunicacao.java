package calculadora_distribuida.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Comunicacao {

    private ObjectOutputStream out;
    private ObjectInputStream in;

    public Comunicacao(Socket socket){
        try {
            out = new ObjectOutputStream( socket.getOutputStream() );
            in = new ObjectInputStream( socket.getInputStream() );
        } catch (Exception e) {
            System.out.println("Erro ao criar os objetos de comunicação.");
            System.out.println(e.getMessage());
        }
    }

    public void send(Object object){
        try {
            out.writeObject(object);
        } catch (Exception e) {
            System.out.println("Erro no envio da mensagem: " + e.getMessage());
        }
    }

    public Object receive(){
        try {
            return in.readObject();
        } catch (Exception e) {
            System.out.println("Erro ao receber a mensagem: " + e.getMessage());
            return null;
        }
    }

    
}
