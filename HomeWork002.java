import java.util.Scanner;

public class HomeWork002 {
    public static void main(String[] args) {
        FloatInput();

        int [] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task_2_2(intArray, 10, 5);

        Task_2_3();

        NullInput();
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

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

    public static void Task_2_3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } 
     
    }

    private static void NullInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String num = sc.nextLine();
        if (num == "" || num.replace(" ", "") == ""){
            System.out.println("Пустая строка!!");
            NullInput();
        }
        
    }
}
