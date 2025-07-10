public class InsertionSort {
    public static void main(String[] args){
        int[] A={40,20,30,50,10,60};
        int n=A.length;
        for (int j = 1; j <n; j++) {
            int current=A[j];
            int prev=j-1;
            while(prev>=0 && A[prev]>current){
                A[prev+1]=A[prev];
                prev=prev-1;
            }   
            A[prev+1]=current;
        }
      for (int i : A) {
         System.out.print(i+"\t");
      }
    }
}
