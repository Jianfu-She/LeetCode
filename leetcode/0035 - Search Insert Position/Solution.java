/**
 * Problem: Given a sorted array and a target value, return the index if the target is found. 
 *          If not, return the index where it would be if it were inserted in order.
 *          You may assume no duplicates in the array.
 * 
 * Example: Input: [1,3,5,6], 5   Output: 2
 *          Input: [1,3,5,6], 2   Output: 1
 *          Input: [1,3,5,6], 7   Output: 4
 *          Input: [1,3,5,6], 0   Output: 0
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        if (nums[0] > target) {
            return 0;
        }
        
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        
        return left;
    }
}
