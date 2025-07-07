import java.util.Arrays;

public class MaxSubarray {
        int Max=0;
       public static void main(String[] args){
        int[] arr={1,-2,6,-1,3};
        BruteForce(arr);
        PrefixArrayWay(arr);
    }
    
 public static void PrefixArrayWay(int arr[]){
          int Maxsum=Integer.MIN_VALUE;
          int PRefixarr[]=new int[arr.length];
         
          PRefixarr[0]=arr[0];
          for (int i = 1; i <PRefixarr.length; i++) {
            PRefixarr[i]=PRefixarr[i-1]+arr[i];
             }
        
          for(int i=0;i<arr.length;i++){
                int start=i;
                    for(int j=i+1;j<arr.length;j++){
                       int end=j;
                       int Currentsum=start==0?PRefixarr[end]:PRefixarr[end]-PRefixarr[start-1];
                      
                        if(Currentsum>Maxsum){
                            Maxsum=Currentsum;
                        }   
                        //n(n+1)/2
                        
                    }
                    System.out.println();
            }

             System.out.println(Arrays.toString(PRefixarr));
             System.out.println("Maximun Sum of Subarray=" +Maxsum);

    }




    public static void BruteForce(int arr[]){
           int Maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                  int start=i;
                  System.out.println("["+arr[start]+"]"+"\t");
                
                    for(int j=i+1;j<arr.length;j++){
                       int end=j;int Currentsum=0;
                           System.out.print("[");
                       
                           for(int k=start;k<=end;k++){
                           Currentsum+=arr[k];
                          System.out.print(+arr[k]+",");
                        }
                        System.out.println("] and sum="+Currentsum); 
                        if(Currentsum>Maxsum){Maxsum=Currentsum;}   
                        //n(n+1)/2
                        
                    }
                    System.out.println();
            }
            System.out.println("Maximun Sum of Subarray=" +Maxsum);
    }




   
}
