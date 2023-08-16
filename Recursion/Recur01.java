import java.util.*;

public class Recur01{

    static void printNumber(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] agrs){
        printNumber(5);
    }
}