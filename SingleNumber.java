/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4 */

import java.util.Arrays;

public class SingleNumber {
    
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i += 2) {
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }
}
    
