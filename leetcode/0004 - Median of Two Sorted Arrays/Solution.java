/**
 * Problem: There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *          Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example: nums1 = [1, 3] nums2 = [2]     The median is 2.0
 *          nums1 = [1, 2] nums2 = [3, 4]  The median is (2 + 3)/2 = 2.5
 */

 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, index = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[index++] = nums1[i++];
            } else if (nums1[i] == nums2[j]) {
                nums[index++] = nums1[i++];
                nums[index++] = nums2[j++];
            } else {
                nums[index++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            nums[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[index++] = nums2[j++];
        }
        
        if (nums.length % 2 == 0) {
            return (double) (nums[index / 2] + nums[index / 2 - 1]) / 2;
        }
        return (double) nums[index/2];
    }
}