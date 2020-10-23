package exercicio_2;

public class Printer extends Thread{
    
    String nome;
    int v[];
    int resp[];

    public  Printer(String nome, int v[], int resp[]) {
        
        super(nome);
        this.nome = nome;
        this.v = v;
        this.resp = resp;
    }

    @Override
    public void run() {
        
        for (int i : v) {
            
            System.out.print(i + " ");
        }

        System.out.println("Maior número = "+resp[0]);
    }
}

