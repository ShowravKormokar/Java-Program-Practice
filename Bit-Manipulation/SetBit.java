import java.util.*;

public class SetBit{
    public static void main(String agrs[]){
        int n = 5, pos = 1, bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println("New number: " + newNumber);
        
    }
}