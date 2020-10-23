package exercicio_2;

public class App {
    

    public static void main(String[] args) {

        int v[] = new int[50];
        int resp[] = new int[3];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()*100);
        }
        
        Printer printer = new Printer("Thread2", v, resp);
        Worker worker = new Worker("Thread1", v, resp, printer);

        System.out.println("Inicializando Thread 1");
        worker.start();

        System.out.println("MAIN finalizado.");
    }
}
