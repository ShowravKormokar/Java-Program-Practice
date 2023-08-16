import java.util.*;
// import bank;

class Pen{
    String color;
    String type;

    public void write(){
    System.out.println("Access denied...");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    // method/function overloading
    public void printStuInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printStuInfo(String name){
        System.out.println(name);
    }
    public void printStuInfo(int age){
        System.out.println(age);
    }
    public void printStuInfo(String name, int age){
        System.out.println(name+" "+age);
    }


    Student(){}

    Student(Student s2){ //copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class class1{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
       
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Bolpoint";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        //Student
        Student s1 = new Student();
        s1.name = "Bristy";
        s1.age = 18;

        Student s2 = new Student(s1);// Copy constructor
        s2.printStuInfo();
        s2.printStuInfo(s1.name);
        s2.printStuInfo(s1.age);
        s2.printStuInfo(s1.name,s1.age);


        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // Input one word
        String name = sc.nextLine(); // Input multi word
        System.out.println(name);

        // ----- This items import from Bank package(folder)
        // bank.Account account1 = new bank.Account();
        // account1.name = "Customer1";
    }
}
