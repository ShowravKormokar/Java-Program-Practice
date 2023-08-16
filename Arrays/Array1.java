import java.util.*;

public class Array1{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];

        // int marks[] = {50, 42, 62};
        // marks[0]= 97;
        // marks[1]= 88;
        // marks[2]= 85;
        // marks[3]= 91;
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(marks[i]);
        }
    }
}