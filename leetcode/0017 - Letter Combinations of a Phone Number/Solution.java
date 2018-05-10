/**
 * Problem: Given a string containing digits from 2-9 inclusive, return all possible letter 
 *          combinations that the number could represent.
 *          A mapping of digit to letters (just like on the telephone buttons) is given below. 
 *          Note that 1 does not map to any letters.
 *          2-abc 3-def 4-ghi 5-jkl 6-mno 7-pqrs 8-tuv 9-wxyz
 *
 * Example: Input: "23"  Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

 class Solution {
     public List<String> letterCombinations(String digits) {
         LinkedList<String> res = new LinkedList<>();
         if (digits.isEmpty()) {
             return res;
         }

         String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
         res.add("");
         while (res.peek().length() < digits.length()) {
             String pop = res.pop();
             String map = mapping[digits.charAt(pop.length()) - '0'];
             for (char c : map.toCharArray()) {
                 res.add(pop + c);
             }
         }

         return res;
     }
 }

 /**
  * 构造一个FIFO队列
  */