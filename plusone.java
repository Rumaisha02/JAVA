/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0]. */

import java.util.Arrays;
public class plusone {
    public static void main(String[] args){
    int[] digits={9,9,9,9};
    digits=plusOne(digits);
    System.out.println(Arrays.toString(digits));
    }
    public  static int[] plusOne(int[] digits) {
        int sum=0;
        for (int i = 0; i < digits.length; i++) {
            sum=(sum*10)+digits[i];
        }
        int newSum=sum+1;
        System.out.println("newSum" + newSum);
        int len=(int)Math.log10(newSum)+1,tmp=newSum;
        System.out.println("length"+len);
        for (int i = len-1; tmp!=0; i--) {
            int a=tmp%10;
            tmp/=10;
            digits[i]=a;
            System.out.println(digits[i]);
        }
        // int p=len-1;
        // while(p>-1){
        //  int a=newSum%10;
        //  digits[p]=a;
        //  newSum /=10;
        //  p--;
        // }
        // if(newSum!=0){
        //     int[] temp=new int[digits.length+1];
        //     temp[0]=newSum;
        //     for(int i=1;i<temp.length;i++){
        //     temp[i]=digits[i-1];
        //   }
        //   return temp;
        // }

        return digits;
    }
}
