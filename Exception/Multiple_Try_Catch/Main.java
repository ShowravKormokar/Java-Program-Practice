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

        try{
            int[] arr =new int[5];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;
            arr[4] = 4;

            System.out.println(arr[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}