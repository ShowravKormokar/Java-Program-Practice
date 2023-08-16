import java.util.*;

public class StringBuilder01{
    public static void main(String agrs[]){
        StringBuilder sb = new StringBuilder("Masuma");
        System.out.println(sb);

        //Char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 
        sb.setCharAt(5, 'A');
        System.out.println(sb);

        //Insert
        sb.insert(3, 's');
        System.out.println(sb);

        //Delete the char
        sb.delete(2, 3);
        System.out.println(sb);

        // Add element in the last Append
        sb.append("@");
        System.out.println(sb);
    }
}