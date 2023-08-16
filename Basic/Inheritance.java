class Shape{
    String color;
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilarealTriangle extends Triangle{
     
}

public class Inheritance{
    public static void main(String args[]){
        EquilarealTriangle et1 = new EquilarealTriangle();
        et1.color = "Red";
        System.out.println(et1.color);
        et1.area(10,5);
    }
}