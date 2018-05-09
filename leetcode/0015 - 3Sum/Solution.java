/**
 * Problem: Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 *          Find all unique triplets in the array which gives the sum of zero.
 *          The solution set must not contain duplicate triplets.
 *
 * Example: Given array nums = [-1, 0, 1, 2, -1, -4],
 *          A solution set is:
 *          [
 *              [-1, 0, 1],
 *              [-1, -1, 2]
 *          ]
 */

 class Solution {
     pubic List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);

         List<List<Integer>> res = new ArrayList<>();
         int l, r;

         for (int i = 0; i < nums.length - 2; i++) {
             l = i + 1; 
             r = nums.length - 1;
             while (l < r) {
                 if (nums[l] + nums[r] == -nums[i]) {
                     res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                     while (l < r && nums[l] == nums[l + 1]) {
                         l++;
                     }
                     while (l < r && nums[r] == nums[r - 1]) {
                         r--;
                     }
                     l++;
                     r--;
                 } else if (nums[l] + nums[r] < -nums[i]) {
                     l++;
                 } else {
                     r--;
                 }
             }
         }

         return res;
     }
 }