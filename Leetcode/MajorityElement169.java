package Leetcode;

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int nums[] = { 3,2,3};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}