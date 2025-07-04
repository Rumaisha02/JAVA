import java.util.*;
public class BinarySearch {
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
     int A[]={1,2,44,5,33,6,10,55,11};
    System.out.println("Enter the key to search for");
    int key=sc.nextInt();
    int index=BinSearch(A,key);
    System.out.println("Index of our " + key +" is: " +index);
 }
   public static int BinSearch(int A[],int key){

   int start=0,end=A.length-1;

   while(start<=end){
    int mid=(start+end)/2;
    
    if(A[mid]==key){
        return mid;
    }
    else if(key>A[mid]){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
   }


    return -1;
   }
}
