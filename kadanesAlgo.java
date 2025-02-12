/*Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23. */


public class kadanesAlgo{
public static void main(String[] args){
  int[] nums = {-1};
  System.out.println(maxSubArray(nums));
}
    public static int maxSubArray(int[] nums) {
        int n=nums.length,CS=0,MS=nums[0];
        for (int i = 0; i < n; i++) {
            CS+=nums[i];
            MS=max(MS,CS);
            if(CS<0){
                CS=0;
            }
        }
      return MS;
    }
     
    public static int max(int MS,int CS){
      if(CS<MS){
        return MS;
      }
      else{
        return CS;
      }
    }
}
    

