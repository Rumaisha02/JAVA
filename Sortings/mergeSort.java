import java.util.Arrays;

public class mergeSort{
    public static void main(String[] args){
        int[] A={10,30,80,40,90,20,50,70,60,100};
        int r=A.length-1,p=0;
        System.out.println(Arrays.toString(A));
        MergeSort(A,p,r); 
        System.out.println("Sorted Array"+ Arrays.toString(A));   
    }
    public static void  MergeSort(int[]A,int p, int r){
        if(p<r){
        int q=(p+r)/2;
        MergeSort(A,p,q);//Calling the first half of array
        MergeSort(A,q+1,r);//Calling the second half of array
        Merge(A,p,q,r);
        }
    } 
    public static void  Merge(int[] A,int p, int q, int r){
        //calculating size of both subarrays
        int n1=q-p+1;
        int n2=r-q;
       
        //Creating temp arrays to store left and right subarrays
        int[] L=new int[n1];
        int[] R=new int[n2];
       
        //Copying data from array to these subarrays
        for(int i=0;i<n1;i++){
            L[i]=A[p+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=A[q+1+j];
        }
        //Merging two subarrays acc to conquering perspective
        int i=0,j=0,k=p;
        while(i<n1 && j<n2){
          if(L[i]<R[j]){//copying L subarray if it's smaller otherwise will coy R subarray
            A[k]=L[i];
            i++;
          }
          else{
            A[k]=R[j];
            j++;
          }
          k++;
        }
        //copying the remaining elements
        while(i<n1){
            A[k]=L[i];
            i++; k++;
        }
        while(j<n2){
            A[k]=R[j];
            j++; k++;
        }
        // System.out.println("Sorted Array"+ Arrays.toString(A));   
    }
}