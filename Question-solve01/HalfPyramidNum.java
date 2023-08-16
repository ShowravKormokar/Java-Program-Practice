import java.util.*;

public class HalfPyramidNum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.print("This is called Half Pyramid with number (Right side).");
    }
}