import java.util.*;

public class InvertedHalfPyramid{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("This is called Inverted Half Pyramid.");
    }
}