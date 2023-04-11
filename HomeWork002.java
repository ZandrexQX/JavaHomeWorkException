import java.util.Scanner;

public class HomeWork002 {
    public static void main(String[] args) {
        FloatInput();

        int [] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task_2_2(intArray, 10, 5);

        
    }
    private static void FloatInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a float: ");
        try {
            float num = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Error!");
            FloatInput();
        }
    }
    private static void Task_2_2(int [] intArray, int d, int index) {
        try {
            double catchedRes1 = (float)intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
