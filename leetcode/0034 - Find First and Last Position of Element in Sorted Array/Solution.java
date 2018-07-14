/**
 * Problem: Given an array of integers nums sorted in ascending order, find the starting and 
 *          ending position of a given target value.
 *          Your algorithm's runtime complexity must be in the order of O(log n).
 *          If the target is not found in the array, return [-1, -1].
 * 
 * Example: Input: nums = [5,7,7,8,8,10], target = 8  Output: [3,4]
 *          Input: nums = [5,7,7,8,8,10], target = 6  Output: [-1,-1]
 */

 class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int indexHead = -2;
        int indexTail = 0;

        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                indexHead = mid;
                indexTail = mid;
                while (indexHead >= 0 && indexHead < nums.length && nums[indexHead] == target) {
                    indexHead--;
                }
                while (indexTail >= 0 && indexTail < nums.length && nums[indexTail] == target) {
                    indexTail++;
                }
                break;
            }
        }

        return new int[]{indexHead + 1, indexTail - 1};
    }
 }
 