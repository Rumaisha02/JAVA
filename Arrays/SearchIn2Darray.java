import java.util.*;
public class SearchIn2Darray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={
            {1,2,34,65},
            {244,45,6},
            {23,67,987,3},
            {2,55,76,3233} };
        System.out.println("Enter the value to search for");
        int target=sc.nextInt();
        int[] ans=Search(arr, target);
        System.out.println(Arrays.toString(ans));
        
    sc.close();
    }
    static int[] Search(int[][] arr,int target){
       
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col}; }
            }
        }
        return new int[]{-1,-1};
    }
}