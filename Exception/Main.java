public class Main{
    public static void main(String[] args){
        int a, b;

        String s = null;
        try{
            // int n = 5/0;
            System.out.println(s.length());
        }
        // catch(Exception e){
        //     System.out.println("Something wrong! " + e);
        // }
        catch(NullPointerException e){
            System.out.println("Something wrong! " + e);
        }
        finally{
            System.out.println("Finally Exception Found.");
        }
    }
}