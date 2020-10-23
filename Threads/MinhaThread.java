package Threads;

public class MinhaThread extends Thread{

    public MinhaThread(String name){

        super(name);
    }
    
    public void run(){


        System.out.println("Início da thread "+getName());

        try{
            sleep(2000);
        }catch(Exception ex){

            System.out.println(ex);
        }
        
        System.out.println("Fim da thread "+getName());
    }
}
