public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }


  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.print("I will print on the same line.");//print dile new line make korbe na
    System.out.println(3+3);
    myMethod();
    // type variableName = value;
    int a = 5;
    float b = 10;
    System.out.println(a+b);

    final int myNum = 15;
    // int myNum = 150;
    // myNum = 20;  // myNum is now 20
    System.out.println(myNum);

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
    
  }
  
}