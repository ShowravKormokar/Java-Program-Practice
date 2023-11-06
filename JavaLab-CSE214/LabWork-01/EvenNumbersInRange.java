public class EvenNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Even numbers within the range 5-255:");
        for (int i = 5; i <= 255; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
