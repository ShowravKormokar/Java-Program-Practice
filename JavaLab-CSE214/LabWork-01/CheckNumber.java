import java.util.*;

public class CheckNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("The number is zero.");
        }else if(number > 0){
            System.out.println("The number positive.");
        }else{
            System.out.println("The number negative.");
        }

    }
}