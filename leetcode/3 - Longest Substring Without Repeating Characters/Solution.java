/**
 * Problem: Given a string, find the length of the longest substring without repeating characters.
 *
 * Example: Given "abcabcbb", the answer is "abc", which the length is 3.
 *          Given "bbbbb", the answer is "b", with the length of 1.
 *          Given "pwwkew", the answer is "wke", with the length of 3. 
 *          Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

 Class Solution {
     public int lengthOfLongestSubstring(String s) {
        int length = 0, i = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for (int j = 0; j < arr.length; j++) {
            if (map.containsKey(arr[j])) {
                i = Math.max(i, map.get(arr[j]));
            }
            length = Math.max(length, j - i + 1);
            map.put(arr[j], j + 1);
        }

        return length;
    }
 }