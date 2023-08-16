import java.util.*;

public class SelectionSort{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Selection sort
        for(int i=0; i<n-1; i++){
            int sm = i;
            for(int j=i+1; j<n; j++){
                if(arr[sm] > arr[j]){
                    sm = j;
                }
            }
            int temp = arr[sm];
            arr[sm] = arr[i];
            arr[i] = temp;
        }

        // Print Acending order
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}