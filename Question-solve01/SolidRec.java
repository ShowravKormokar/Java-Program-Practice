import java.util.*;

public class SolidRec{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row number: ");
    int n = sc.nextInt();
    System.out.print("Enter the col number: ");
    int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("This is called Solid Rectangle.");
    }
}