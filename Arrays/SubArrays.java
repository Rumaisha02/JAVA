public class SubArrays{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        PrintSubArrays(arr);
    }
    
    public static void PrintSubArrays(int arr[]){
        int tp=0;
            for(int i=0;i<arr.length;i++){
                  int start=i;
                  System.out.println("["+arr[start]+"]"+"\t");
                  tp++;
                    for(int j=i+1;j<arr.length;j++){
                       int end=j;int sum=0;
                           System.out.print("[");
                       for(int k=start;k<=end;k++){
                           sum+=arr[k];
                          System.out.print(+arr[k]+",");
                        
                        }
                        System.out.println("] and sum="+sum);  tp++;            //n(n+1)/2
                    }
                    System.out.println();
            }
            System.out.println("Total sub arrays="+tp);
 
    }

}
