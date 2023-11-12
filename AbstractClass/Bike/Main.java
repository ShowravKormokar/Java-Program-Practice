public class Main{
    public static void main(String[] args){
        Bike bk = new Bajaj();
        bk.start(); //run time polymorphishm

        bk = new Honda();
        bk.speed();

        Bajaj b = new Bajaj();
        b.start();
        b.speed();
        b.bikeBreak();

        Honda h = new Honda();
        h.start();
        h.speed();
        h.bikeBreak();
    }
}