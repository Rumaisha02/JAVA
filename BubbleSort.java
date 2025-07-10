import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {122,45,76,44,312,87,5542,24};
        
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));

    }

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swap=0;//adding this element so that when the array is already sorted..it doesn't run the whole loop and comes out of it if swapped element is stil
            // Last i elements are already sorted, no need to check them
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("Array already sorted");
                break;

            }
        }
    }

    // Helper method to print an array
   /* public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/
}


/*ALTERNATE METHOD  WITHOUT FUNCTIONS*/

// import java.util.Arrays;
// class Main {
//     public static void main(String[] args) {
//      int[] arr={10,9,11,6,15,2};
//      int n=arr.length;
//      for (int i = 0; i <n-1 ; i++) {
//           for(int j=0;j<n-i-1;j++){
//              if (arr[j]>arr[j+1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             } 
//           }
//          }
//         System.out.println(Arrays.toString(arr));
//     }
// }
