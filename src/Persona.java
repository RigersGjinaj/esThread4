public class Persona extends Thread{

    String nome;
    Bagno bagno;

    public Persona(String nome,Bagno bagno){
        this.nome=nome;
        this.bagno=bagno;
    }

    @Override
    public synchronized void start() {

        bagno.semaforo.P(); 
        bagno.usaBagno(nome);
        bagno.semaforo.V();
        
    }



    
}
