import java.util.*;

public class HollowRec{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row number: ");
    int n = sc.nextInt();
    System.out.print("Enter the col number: ");
    int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j== m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("This is called Hollow Rectangle.");
    }
}