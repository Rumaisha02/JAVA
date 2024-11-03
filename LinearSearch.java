import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int[] ar={1,2,3,4,5,54354,654,32,4545,765,73,354,74,7};
            System.out.println("Enter valur too search for in array");
            int target=sc.nextInt();
            int result=linearSearch(ar, target);
            int result2=linearSearch2(ar, target);
            {
                  if(result==-1||result2==-1){
                      System.out.println("Element not found");
      
                  }
                  else{
                      System.out.println("element found at index" + result);
                  }
            }
            //prints the result we got form 2nd function
           {
                  if(result2!=-1){
                      System.out.println(result2 + " is found");
                  }
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
    //to return the elements instead of the index we can then use enhanced for loop instead of the whole loop
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if(element==target){
                return  element;
            }
        }
        return -1;
    }
}
