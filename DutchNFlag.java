/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2] */

import java.util.Arrays;

public class DutchNFlag {
    public static void main(String[] args){
     int[] nums={1,2,0};
     System.out.println("UNSorted"+ Arrays.toString(nums));
     sortColors(nums);
     System.out.println("Sorted"+ Arrays.toString(nums));

     int[] nums1={1,2,0,0,2,2,1,1,1,0,1};
     System.out.println("::UNSorted "+ Arrays.toString(nums1));
     sortColors(nums1);
     System.out.println("Sorted"+ Arrays.toString(nums1));


    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0, high = n - 1, low = 0;
        while (mid<=high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
                // mid++;
            }
        }
    }

    public static void swap(int[] nums, int mid, int toswap) {
        int temp;
        temp = nums[toswap];
        nums[toswap] = nums[mid];
        nums[mid] = temp;
    }
}
