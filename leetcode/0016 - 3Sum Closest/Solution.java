/**
 * Problem: Given an array nums of n integers and an integer target, find three integers in nums 
 *          such that the sum is closest to target. Return the sum of the three integers. You may 
 *          assume that each input would have exactly one solution.
 *
 * Example: Given array nums = [-1, 2, 1, -4], and target = 1.
 *          The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

 class Solution {
     public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);

         int res = nums[0] + nums[1] + nums[2];
         int sum, r, l;

         for (int i = 0; i < nums.length - 2; i++) {
             if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                 l = i + 1;
                 r = nums.length - 1;
                 while (l < r) {
                     sum = nums[i] + nums[l] + nums[r];
                     res = Math.abs(res - target) > Math.abs(sum - target) ? res : sum;
                     if (sum == target) {
                         return target;
                     } else if (sum < target) {
                         l++;
                     } else {
                         r--;
                     }
                 }
             }
         }

         return res;
     }
 }