import java.util.Scanner;

public class HomeWork002 {
    public static void main(String[] args) {
        FloatInput();
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
}
