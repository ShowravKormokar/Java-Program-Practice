import java.util.*;

public class ClearBit{
    public static void main(String agrs[]){
        int n = 5, pos = 2, bitMask = 1 << pos, notBitMusk = ~(bitMask);

        int newNumber = notBitMusk & n;
        System.out.println("New number: " + newNumber);
        
    }
}