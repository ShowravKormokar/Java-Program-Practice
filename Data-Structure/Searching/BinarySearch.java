import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the " + n + " sorted elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the searching value: ");
        int key = sc.nextInt();

        int start=0, end=n-1, flag=0;
        for(int i=start; i<=end;){
            int mid = (start+end)/2;

            if(key == arr[mid]){
                System.out.println(key + " is found at index no. "+ mid);
                flag = -1;
                break;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            else
                start = mid +1;
        }

        if(flag == 0)
            System.out.println("Not found");
        
    }
}