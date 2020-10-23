package calculadora_distribuida.cliente;

import java.net.Socket;
import java.util.Scanner;

import calculadora_distribuida.util.Comunicacao;
import calculadora_distribuida.util.Requisicao;

public class Cliente {


    public static void main(String[] args) {
        
        Socket clientSocket;
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2;
        char operacao;
    
        try{
    
            serverSocket = new Socket("127.0.0.1", 9876);
        }catch(Exception ex){
    
            System.out.println("Falha na comunicação com servidor.");
            return;
        }

        System.out.println("----CALCULADORA DISTRIBUÍDA----/nDigite o primeiro valor:");

        valor1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor:");

        valor2 = teclado.nextDouble();

        System.out.println("Digite a operação:");

        operacao = teclado.nextLine().charAt(0);


        Requisicao requisicao = new Requisicao(valor1,valor2,operacao);
        Comunicacao comunicacao = new Comunicacao(clientSocket);

        comunicacao.send(requisicao);
    }
    
}
