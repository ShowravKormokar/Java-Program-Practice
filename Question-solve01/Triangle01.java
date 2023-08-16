import java.util.*;

public class Triangle01{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(((i+j) % 2 == 0) ? "1 " : "0 ");
            }
            System.out.println();
        }
        System.out.print("This is called 0-1 Triangle.");
    }
}