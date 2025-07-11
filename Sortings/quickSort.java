package Sortings;
import java.util.Arrays;

public class quickSort{
    public static void main(String[] args){
        int[] arr={100,70,20,10,50,90,60,30,80,40};
        int end=arr.length-1,st=0;
        System.out.println("Original Array"+ Arrays.toString(arr));
        QuickSort(arr,st,end);
        System.out.println("Sorted Array"+ Arrays.toString(arr));

    }
    public static void QuickSort(int[] arr,int st,int end){
    if(st<end){
        int pvtIdx=Partition(arr, st, end);
        QuickSort(arr, st, pvtIdx-1);//Calls the left subarray for QuickSort partition 
        QuickSort(arr, pvtIdx+1,end);//Calls the right subarray fro quickSort partitioning
    }
    }
    public static int Partition(int[] arr,int st,int end){
        int idx=st-1,pivot=arr[end];
        for (int j = st; j < end; j++) {
            if(arr[j]<=pivot){
                idx++;
                swap(arr,idx,j);
            }  
        }
        idx++;
        swap(arr,idx,end);
        return idx;
    }
    public static void swap(int[] arr, int idx,int Mainvalue){
      int temp=arr[idx];
      arr[idx]=arr[Mainvalue];
      arr[Mainvalue]=temp;
    }
}