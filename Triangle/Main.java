public class Main{
    public static void main(String[] args){

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0, 5.0);
        System.out.println("Base= "+ t1.getBase());
        System.out.println("Height= "+ t1.getHeight());
        System.out.println("Area= "+ t1.getArea());

        System.out.println("Base= "+ t2.getBase());
        System.out.println("Height= "+ t2.getHeight());
        System.out.println("Area= "+ t2.getArea());

        Triangle t3 = new Triangle();
        t3.setBase(8.0);
        t3.setHeight(6.0);
        System.out.println("Base= "+ t3.getBase());
        System.out.println("Height= "+ t3.getHeight());
        System.out.println("Area= "+ t3.getArea());

        System.out.println(t3.toString());
    }
}