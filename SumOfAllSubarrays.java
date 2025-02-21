public class SumOfAllSubarrays{
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7};
      
        for(int i=0;i<arr.length;i++){
            int sum=0;
           for(int j=i;j<arr.length;j++){
             sum=sum+arr[j];
             System.out.println("sum of sub-array "+arr[i]+","+arr[j]+" is "+ sum);
           }
            
        }
    }
}
