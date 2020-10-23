package exercicio_2;

public class Worker extends Thread{
    
    String nome;
    int v[];
    int resp[];
    Printer printer;

    public  Worker(String nome, int v[], int resp[], Printer printer) {
        
        super(nome);
        this.nome = nome;
        this.v = v;
        this.resp = resp;
        this.printer = printer;
    }

    @Override
    public void run() {
        
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            
            if(v[i] > maior){

                maior = v[i];           
            }
        }

        resp[0] = maior;

        System.out.println("Inicializando Thread 2");
        printer.start();
    }

}