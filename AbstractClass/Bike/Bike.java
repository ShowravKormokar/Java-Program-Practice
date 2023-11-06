public abstract class Bike{
    public void start(){
        System.out.println("Bike Starting.");
    }
    public void bikeBreak(){
        System.out.println("ABS Breaking");
    }    
    public abstract void speed();
}