/**
 * Problem: Write a function to find the longest common prefix string amongst an array of strings.
 *          If there is no common prefix, return an empty string "".
 * 
 * Example: Input: ["flower","flow","flight"]    Output: "fl"
 *          Input: ["dog","racecar","car"]       Output: ""
 */

 class Solution {
     public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String res = "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || (strs[j].charAt(i) != strs[0].charAt(i))) {
                    return res;
                }
            }
            res += strs[0].charAt(i);
        }
        
        return res;
    }
}