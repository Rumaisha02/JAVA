package Sortings;
import java.util.Arrays;

public class BasicSorts {
    public static void main(String[] args) {
        int Array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("Original Array:" + Arrays.toString(Array) + "\n");
        BubbleSort(Array);
        SelectionSort(Array);
    }

    public static void BubbleSort(int Array[]) {
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - 1 - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted Array:" + Arrays.toString(Array) + "\n");

    }

    public static void SelectionSort(int Array[]) {

        for (int i = 0; i < Array.length; i++) {
            int minpos = i;
            for (int j = i; j < Array.length; j++) {
                if (Array[minpos] > Array[j]) {
                    minpos = j;
                }
            }
            if (minpos != i) {
                int temp = Array[i];
                Array[i] = Array[minpos];
                Array[minpos] = temp;
            }
        }
        System.out.println("Selection Sorted Array:" + Arrays.toString(Array) + "\n");

    }
    // public static void InsertionSort(){}
    // public static void CountingSort(){}
}
