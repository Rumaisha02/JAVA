//another way to do ducth national flag algo..a direct sorting method here  
//we'll use insertion sort

import java.util.Arrays;
public class dnfAlgo{
    public static void main(String[] args){
        int[] nums={0,2,2,1,0,0,2,2,1,1,1};
        int n=nums.length;
        System.out.println("OG" + Arrays.toString(nums));
        for (int i = 2; i < n; i++) {
            int key=nums[i];
            int j=i-1;
            while(j>0 && nums[j]>key){
             nums[j+1]=nums[j];
             j=j-1;
            }
            nums[j+1]=key;
        }
        System.out.println("ANS" + Arrays.toString(nums));
    }
}
