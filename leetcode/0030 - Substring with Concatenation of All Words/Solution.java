import java.util.Map;

/**
 * Problem: You are given a string, s, and a list of words, words, that are all of the same 
 *          length. Find all starting indices of substring(s) in s that is a concatenation of 
 *          each word in words exactly once and without any intervening characters.
 * 
 * Example: Input:s = "barfoothefoobarman", words = ["foo","bar"]            Output: [0,9]
 *          Input:s = "wordgoodstudentgoodword", words = ["word","student"]  Output: []
 */

 class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> res = new ArrayList<>();

        if (words == null || words.length == 0) {
            return res;
        }

        Map<String, Integer> dict = new HashMap<>();
        Map<String, Integer> found = new HashMap<>();

        for (String word : words) {
            found.put(word, found.getOrDefault(word, 0) + 1);
        }

        int strLen = s.length(), wordLen = words[0].length(), wordsLen = words.length * wordLen;
        int j = 0;

        for (int i = 0; i < strLen - wordsLen + 1; i++) {
            j = i;
            while (j - i < wordsLen) {
                String substring = s.substring(j, j + wordLen);
                found.put(substring, found.getOrDefault(substring, 0) + 1);
                if (found.get(substring) > dic.getOrDefault(substring, 0)) {
                    break;
                }
                j += wordLen;
            }
            if (j - i == wordsLen) {
                res.add(i);
            }
            found.clear();
        }

        return res;
    }
 }