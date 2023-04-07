
public class HomeWork {
    public static void main(String[] args) {
        // Реализуйте 3 метода, 
        // чтобы в каждом из них получить разные исключения
        int[] arr = new int[]{4,1,2,4,3,1,100,2};
        int num = 12;
        System.out.println(PositiveNumbers(arr));
        System.out.println(DivNumbers(arr,num));
        System.out.println(SumNoHundred(arr));
    }
    public static String PositiveNumbers (int[] arr) {
        for (int i = 0; i < arr.length; i++) if (arr[i] < 0) throw new RuntimeException("Замечено отрицательное число!!");
        return "Все числа положительные";
    }
    public static int DivNumbers (int[] arr, int num) {
        int sumDivision = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) throw new RuntimeException("Замечен ноль");
            sumDivision += num/arr[i];
        }
            return sumDivision;
    }
    public static int SumNoHundred(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        if (sum >= 100) throw new RuntimeException("Сумма больше ста");
        return sum;
    }
}
