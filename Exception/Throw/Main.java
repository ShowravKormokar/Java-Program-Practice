public class Main{

    static void div(int a, int b){
        if(b==0){
            throw new ArithmeticException("/ by zero");
        }else{
            System.out.println(a/b);
        }
    }

    public static void main(String[] args){

        div(20, 0);
    }
}