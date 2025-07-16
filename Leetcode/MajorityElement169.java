package Leetcode;

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3,2,2,2,2 };
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int[] count = new int[largest + 1];
        for (int index = 0; index < n; index++) {
            count[nums[index]]++;
        }
        System.out.println(Arrays.toString(count));
        
        int maxFreq=Integer.MIN_VALUE, maxindex=0;
        for (int i = 0; i < count.length; i++) {
            maxFreq=Math.max(maxFreq,count[i]);
            maxindex=;
        }
        return maxindex;
    }
}