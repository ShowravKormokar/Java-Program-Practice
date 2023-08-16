import java.util.*;

public class SolidRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("This is called Solid Rhombus.");
    }
}