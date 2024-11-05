import java.util.Arrays;
public class MinMax {
    public static void main(String[] args) {
     int[] arr={34,43,2,5,77,22,-7,34,8768,1234,564,342};
     System.out.println(Arrays.toString(arr));
     System.out.println("Minimum value from the array is " + linearSearchMin(arr));
     System.out.println("MAximun value from the array is " + linearSearchMax(arr));
    }

    static int linearSearchMin(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int linearSearchMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
