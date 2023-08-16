import java.util.*;

public class Matrix{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row and column number: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][]=new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Index [" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}