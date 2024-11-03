import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int[] ar={1,2,3,4,5,54354,654,32,4545,765,73,354,74,7};
            System.out.println("Enter valur too search for in array");
            int target=sc.nextInt();
            int result=linearSearch(ar, target);
            if(result==-1){
                System.out.println("Element not found");

            }
            else{
                System.out.println("element found at index" + result);
            }

        
        };
     
    }
    //function to search for targetted value in an array and return if found 
    //return -1 if value not found in that array
    static int linearSearch(int[] arr, int target){
       
        if(arr.length==0){
         return -1;
        }
         
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
              
        }
        return -1;
        
    }
}
