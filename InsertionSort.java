public class InsertionSort {
    public static void main(String[] args){
        int[] A={40,20,30,50,10,60};
        int n=A.length;
        for (int j = 1; j <n; j++) {
            int key=A[j];
            int i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i=i-1;
            }
            A[i+1]=key;
        }
      for (int i : A) {
         System.out.print(i+"\t");
      }
    }
}
