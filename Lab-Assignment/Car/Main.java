public class Main{
    public static void main(String [] args){

        Car c1 = new Car();
        Car c2 = new Car(); 

        c1.setBrand("BMW");
        c1.setModel("M4 Sports");
        c1.setLaunchYear(2021);

        System.out.println("Car Details 01-");
        System.out.println("Brand Name:- "+c1.getBrand());
        System.out.println("Model:- "+c1.getModel());
        System.out.println("Launching Year:- "+c1.getLaunchYear() + "\n");

        c2.setBrand("Rolls Royce");
        c2.setModel("Boat Tail");
        c2.setLaunchYear(2018);

        System.out.println("Car Details 02-");
        System.out.println("Brand Name:- "+c2.getBrand());
        System.out.println("Model:- "+c2.getModel());
        System.out.println("Launching Year:- "+c2.getLaunchYear());
    }
}

// Name: Showrav Kormokar
// ID: 222311077
// Section: B