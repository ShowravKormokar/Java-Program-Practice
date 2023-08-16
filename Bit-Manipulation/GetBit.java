import java.util.*;

public class GetBit{
    public static void main(String agrs[]){
        int n = 5, pos = 2, bitMask = 1 << pos; // 5 = 0101, 0100, 0100 & 0101 = 0100

        if((bitMask & n) == 0){
            System.out.println("Bit was zero.");
        } else {
            System.out.println("Bit was one.");
        }
    }
}