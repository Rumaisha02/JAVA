
import java.util.Arrays;

//2d array in which number of column is not predefined

public class nocolumnarray{
    public static void main(String[] args){
         int[][] arr = {
                {1,2,3},
                {5,6},
                {7,8,9,10}
            };
            for(int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col]+ " ");
                }
                System.out.println();
            }
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
    }
}
//Array list is a feature in JAVA that helps using array without defining it's size. We can store as many elemnts in ArrayList as we want. Initially arrayList have a initial capacity
//in it which on being filled 50% it itself increases it's capacity so that we never have to face array out of index issue! 
// public class ArraylistExample {
//     public static void main(String[] args){

//         //syntax
//         ArrayList<Integer> list = new ArrayList<>(10);
    
//     }
// }
