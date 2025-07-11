public class PairsArray{
   //TIME COMPLEXITY O(n^2)
    public static void main(String args[]){
      int A[]={2,4,6,8,10};
      BruteForceApproach(A);
    }
    public static void BruteForceApproach (int A[]){
        int tp=0;
        int start=0,end=A.length-1;
        for (int i = start; i <=end; i++) {
             
            for (int j = i+1; j <=end; j++) {
                
                 System.out.print( "("+ A[i]+","+A[j]+")"+"\t");
                  tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs="+tp); //by airthematic progression = n(n-1)/2

    }

}