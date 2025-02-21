public class SubArraySum_K {
        public static void main(String[] args){
            int[] arr={2,3,4,5,6,7};
            int tar=6, count=0;
            for(int i=0;i<arr.length;i++){
                int sum=0;
               for(int j=i;j<arr.length;j++){
                 sum=sum+arr[j];
                 if(sum==tar){
                   count++;
                 }
                //  System.out.println("sum of sub-array "+arr[i]+","+arr[j]+" is "+ sum);
               }
                
            }
            System.out.println("The sub arrays having sum "+ tar +" are: "+ count);
    }
 }
    

