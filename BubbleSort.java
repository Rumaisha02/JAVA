// import java.util.Arrays;

// public class bubblesort {
//     public static void main(String[] args) {
//         int[] arr={10,9,11,6,15,2};
//         int bubEle=arr[0];
//         for (int i = 0; i <6 ; i++) {
//             if (bubEle>arr[i+1]) {
//                 int temp=bubEle;
//                 bubEle=arr[i+1];
//                 arr[i+1]=temp;
//             } else {
//                 bubEle=arr[i+1];
//             }
//         }
//        System.out.println(Arrays.toString(arr));
//     }
     
// }
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted array:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted, no need to check them
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

