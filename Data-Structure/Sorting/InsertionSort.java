import java.util.*;

public class InsertionSort{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Insertion sort
        for(int i=0; i<n; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        // Print Acending order
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}