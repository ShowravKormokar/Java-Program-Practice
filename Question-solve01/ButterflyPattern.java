import java.util.*;

public class ButterflyPattern{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int x=1; x<=i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=(2*(n-i)); k++){
                System.out.print(" ");
            }
            for(int x=1; x<=i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.print("This is called Butterfly Pattern.");
    }
}