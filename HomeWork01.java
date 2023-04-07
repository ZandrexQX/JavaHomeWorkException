import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        // Реализуйте 3 метода, 
        // чтобы в каждом из них получить разные исключения
        int[] arr = new int[]{8,3,6,4,3,7,10,8};
        int[] arr_2 = new int[]{4,1,2,4,3,1,10,2};
        String[][]arrStr = new String[][]{{"13","21","5","4","1"},{"13","1","4","2","1"},
                                        {"11","43","1","4","16"},{"19","1","4","26","12"}};
        int num = 12;
        System.out.println(PositiveNumbers(arr));
        System.out.println(DivNumbers(arr,num));
        System.out.println(SumNoHundred(arr));
        System.out.println(sum2d(arrStr));
        System.out.println(Arrays.toString(DivArr(arr, arr_2)));
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
    public static int sum2d(String[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<5) throw new RuntimeException("Длина массива меньше 5");
            if (arr[i].length>5) throw new RuntimeException("Длина массива больше 5");
            for (int j = 0; j < 5; j++) {
                try { 
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) { 
                    throw new RuntimeException("В массиве буква");
                } 
                
            }
        }
        return sum;
    }
    public static int [] DivArr (int[] arr, int[] arr_2) {
        int[] arr_f = new int [arr.length];
        if (arr.length != arr_2.length) throw new RuntimeException("Длины массивов не равны");
        for (int i = 0; i < arr.length; i++){
            if (arr_2[i] == 0) throw new RuntimeException("В делителе замечен ноль!!");
            arr_f[i] = arr[i]/arr_2[i];
        }
            return arr_f;
    }
}
