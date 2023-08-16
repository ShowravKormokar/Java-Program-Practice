import java.util.*;

public class UpdateBit{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        int n = 5, pos = 1, bitMask = 1 << pos;

        int newNumber = notBitMusk & n;
        System.out.println("New number: " + newNumber);
        
        if(op == 1){
            // Set
            int newNumber = bitMask | n;
            System.out.println("New number: " + newNumber);
        } else{
            // Clear
            int notBitMusk = ~(bitMask);
            int newNumber = notBitMusk & n;
            System.out.println("New number: " + newNumber);
        }
    }
}