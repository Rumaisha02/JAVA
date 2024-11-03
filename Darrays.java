//2d arrays
//data type[][] array_name=new array_name[m][n];
//2-D array
// [1,2,3]
// [4,5,6]
// [7,8,9]
import java.util.Arrays;
import java.util.Scanner;
public class Darrays{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int[][] ar=new int[3][3];
            String[][] arr=new String[3][3];
            //number array
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                  System.out.println("/n"+"Enter number value");
                    ar[row][col]=sc.nextInt();
                }
            }
            for (int[] a : ar) {
                System.out.println(Arrays.toString(a));
            } 
            //String array
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.println("/n"+"Enter String value");
                    arr[row][col]=sc.next();
                }
            }
           
            for (String[] b : arr) {
                System.out.println(Arrays.toString(b));
            } 
          }
    }
    
}
