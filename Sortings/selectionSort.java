package Sortings;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args){
        int[] arr={20,0,10,50,60,40};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<n-1;i++) {
            int minIndex=i;
            for (int j=i+1; j<n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
