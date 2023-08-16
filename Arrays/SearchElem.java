import java.util.*;

public class SearchElem{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element are stores: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( arr.length);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();

        boolean isTrue = false;        
        for(int j=0; j<n; j++){
            if(arr[j] == x){
                System.out.print("Number matched. Position: ");
                System.out.println(j+1);
                isTrue = true;
                break;
            }
        }
        if(isTrue == false){
                System.out.println("Number not matched.");
        }
    }
}