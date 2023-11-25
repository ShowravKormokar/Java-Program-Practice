public class Main{
    public static void main(String[] args){

        // Only risky code under the try block
        try{
            // Exception type- 1
            int d = Integer.parseInt("123");
            System.out.println(d);

            // Exception type- 2
            int[] arr ={0, 1, 2, 3};
            System.out.println(arr[4]);

            // Exception type- 3
            String str = null;
            System.out.println(str.length());
        }

        // This try block, have 3 type of exception. It can be found an exception it can be throw catch, and does not execute after founded exceptions code
        
        catch(NumberFormatException n){
            System.out.println("This is can't be convert into an integer");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Out of size.");
        }
        catch(NullPointerException s){
            System.out.println("String cann't be null.");
        }
        catch(Exception x){ // Handle any type of exception
            System.out.println(x);
        }
    }
}