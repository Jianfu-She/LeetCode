/**
 * Problem: Given an array nums of n integers and an integer target, are there elements a, b, c, and d 
 *          in nums such that a + b + c + d = target? Find all unique quadruplets in the array which 
 *          gives the sum of target.
 *          The solution set must not contain duplicate quadruplets.
 * 
 * Example: Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 *          A solution set is:
 *          [
 *            [-1,  0, 0, 1],
 *            [-2, -1, 1, 2],
 *            [-2,  0, 0, 2]
 *          ] 
 */

 class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new LinkedList<>();
        int a, b, c, d;
        
        for (a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                c = b + 1;
                d = nums.length - 1;
                while (c < d) {
                    if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                        res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        while (c < d && nums[c] == nums[c + 1]) c++;
                        while (c < d && nums[d] == nums[d - 1]) d--;
                        c++;
                        d--;
                    } else if (nums[a] + nums[b] + nums[c] + nums[d] < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        
        return res;
    }
}