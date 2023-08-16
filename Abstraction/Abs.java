/* ------------- Abstraction ------------- */

// abstract class Animal{
//     public void walk(){};

//     Animal(){
//         System.out.println("Animal constructors.");
//     }

//     public void eats(){
//         System.out.println("Animal eats.");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructors.");
//     }

//     public void walk(){
//         System.out.println("Walks in 4 legs.");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks in 2 legs.");
//     }
// }

/*---------- Interface ------------ */

interface Animal{
    void walk();
}

interface Herbivore{
    int eye = 2;
}


//In Java, muitiple inheritance isn't possible by classes but possible by interface
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks in 4 legs.");
    }
}

public class Abs{
    public static void main(String args[]){
        Horse hr = new Horse();
        hr.walk();
        System.out.println(hr.eye);
    }
}