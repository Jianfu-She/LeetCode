/**
 * Problem: Given a sorted array nums, remove the duplicates in-place such that each element appear 
 *          only once and return the new length.
 *          Do not allocate extra space for another array, you must do this by modifying the input 
 *          array in-place with O(1) extra memory.
 *          It doesn't matter what you leave beyond the returned length.
 * 
 * Example: Given nums = [0,0,1,1,1,2,2,3,3,4],
 *          Your function should return length = 5
 */

 class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
 }