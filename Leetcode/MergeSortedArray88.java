package Leetcode;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int num1[] = { 0 };
        int num2[] = { 1 };
        int m = 0, n = num2.length;
        MergeSortedArray88 object = new MergeSortedArray88();
        object.merge(num1, m, num2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
