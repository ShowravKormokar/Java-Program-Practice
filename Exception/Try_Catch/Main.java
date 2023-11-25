public class Main{
    public static void main(String[] args){

        // Only risky code under the try block
        try{
            int d = Integer.parseInt("abcd");

            System.out.println(d);
        }
        
        catch(NumberFormatException n){
            System.out.println("This is can't be convert into an integer");
        }
    }
}