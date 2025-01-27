import java.util.*;
class Two_Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array element");
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target value");
        int target=sc.nextInt();
        Search(nums, target);
        // System.out.println(result);
        sc.close();
    }
    static void  Search(int[] nums,int target){
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]+nums[i+1]==target){
                // System.out.println("Working till here");
                System.out.println("["+i+","+(i+1)+"]");
            }
        }
     } 
}