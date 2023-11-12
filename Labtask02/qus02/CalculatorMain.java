public class CalculatorMain{
     public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 10);
        double result2 = calculator.add(2.5, 2.5);
        String result3 = calculator.add("Showrav", " Kormokar");

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}