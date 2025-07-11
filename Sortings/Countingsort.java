package Sortings;
import java.util.Arrays;

public class Countingsort {
    public static void main(String[] args) {
        int A[]={1,2,6,7,4,1,2,4,5,2,3,7,5};
        System.out.println("Original Array" +Arrays.toString(A));
        Counting(A);
        System.out.println("Sorted Array" +Arrays.toString(A));
 
    }
    public static void Counting(int A[]){
     //we need range for the size of counting array
     int largest=Integer.MIN_VALUE;
     for (int i = 0; i < A.length; i++) {
        largest=Math.max(largest, A[i]);
     }
     //we need one count array that will store frequency
     int count[]=new int[largest+1];// we kept the size as largest+1 so that we have array same as length starting from 0 and ending at exact length
     for (int i = 0; i < A.length; i++) {
         count[A[i]]++; /*count[A[i]]++ ..works in way as.. A[i] will give the element whose frequency we need to increase
         ...the count[that elemet]++ here ..the index of that element will be incresed */
     }
     //then we'll traverse over the count array and acc to the frequency will sort them onto the og array
     //We'll traverse over the count array ..and do changes acc to it on the og array
     int j=0; //to iterate over og array
     for (int i = 0; i < count.length; i++) {
        while(count[i]>0){
            A[j]=i; /*here it's putting the index no on the og array..why index no? coz in count array we had index no as the elemnt..
            .and it's element as the frequency...so originally we need the index no of the count array..that's the main part*/
            j++; 
            count[i]--;
        }
     }
    }
}
