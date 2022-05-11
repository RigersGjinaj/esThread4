public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programma iniziato");

        Semaforo semUomini=new Semaforo(1);
        Semaforo semDonne=new Semaforo(1);

        Bagno bagnoUomini=new Bagno(semUomini);
        Bagno bagnoDonne=new Bagno(semDonne);

        //Uomini
        Persona p1=new Persona("Topolino", bagnoUomini);
        Persona p2=new Persona("Paperino", bagnoUomini);
        Persona p3=new Persona("pippo", bagnoUomini);

        //Donne
        Persona p4=new Persona("Minni", bagnoDonne);
        Persona p5=new Persona("Paperina", bagnoDonne);
        Persona p6=new Persona("Mrs.Donner", bagnoDonne);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();

        System.out.println("I bagni sono liberi");

    }
}
