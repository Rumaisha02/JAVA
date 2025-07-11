import java.util.Arrays;

public class ReverseArray {
    public static void Reverse( int A[]){
       int first=0,last=A.length-1;
       while(first<last){
        int temp=A[first];
        A[first]=A[last];
        A[last]=temp;

        first++;last--;
       }

    }
   public static void main(String args[]){
   int A[]={ 1,2,3,4,5 };
      System.out.println( "Original Array: " + Arrays.toString(A));

     Reverse(A);
     System.out.println( "Reversed Array: " + Arrays.toString(A));
}


}
