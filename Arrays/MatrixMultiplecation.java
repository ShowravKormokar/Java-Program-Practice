import java.util.*;

public class MatrixMultiplecation{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st matrix row and column number: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.print("Enter 2nd matrix row and column number: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        if(col1 == row2){
            int arr1[][]=new int[row1][col1];
            int arr2[][]=new int[row2][col2];
            int arr3[][]=new int[row1][col2];

            System.out.println("Enter 1st matrix elwments: ");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    System.out.print("Matrix [" + i + "][" + j + "] = ");
                    arr1[i][j] = sc.nextInt();
                }
                }

            System.out.println("Enter 2nd matrix elwments: ");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    System.out.print("Matrix [" + i + "][" + j + "] = ");
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix: ");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    for(int k=0; k<row2; k++){
                        arr3[i][j]+=(arr1[i][k])*(arr2[k][j]);
                    } 
                }
            }

            System.out.println("New Matrix: ");
            for(int i=0; i<row1; i++){
                for(int j=0; j< col2; j++){
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication not possible.\nPlease, confirm 1st matrix column and 2nd matrix row are same.");
        }

    }   
}   

/*

1 2      5 6
3 4  x   7 8

19  22
43  50

*/