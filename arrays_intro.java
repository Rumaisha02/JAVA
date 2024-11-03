
import java.util.*;

//array introductory page! 24/10/2024
// syntax: 
// datatype[] variable_name=new datatype[size]
// or directly : int[] variable_name={a,b,c,d,...}
//1.arrays can store any type of data but one type at a time
// int[] rose;//declaring an array "rose" is getting defined in the stack
//rose-new int[size]; //actually here object is being created in the memory heapp
//new keyword is used to creat an object
//DYNAMIC MEMO ALLOCATION
//array objects are in heap and Heap objects are not continous
//array objects in java may not be continous internally(depends completely on JVM)
//3ways to print an array
public class arrays_intro {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];//declaring an array

        //inputing values to array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter array value");
            arr[i] = sc.nextInt();
        }

        //type 1 to print array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        //type2 to print array
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("\n");

        //type3 to print array
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}





