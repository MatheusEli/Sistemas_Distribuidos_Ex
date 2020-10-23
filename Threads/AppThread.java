package Threads;

public class AppThread {
    
    public static void main(String[] args) {
        

        MinhaThread t1 = new MinhaThread("THREAD 01");
        MinhaThread t2 = new MinhaThread("THREAD 02");
        MinhaThread t3 = new MinhaThread("THREAD 03");

        t1.start();
        t2.start();
        t3.start();

        
        System.out.println("Fim do MAIN");
    }
}
