import java.util.*;

public class BubbleSort{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //Decending order / sorting
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }                       
        }

        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}